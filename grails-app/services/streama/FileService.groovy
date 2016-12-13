package streama

import grails.transaction.Transactional
import org.springframework.security.access.prepost.PreAuthorize;
import static org.springframework.http.HttpStatus.*

@Transactional
@PreAuthorize("hasRole('IS_AUTHENTICATED_REMEMBERED')")
class FileService {

  def allowedVideoFormats = ['.mp4', '.mkv', '.webm', '.ogg', '.m4v']

  @PreAuthorize("hasRole('IS_AUTHENTICATED_REMEMBERED')")
  def serveVideo(request, response, rawFile, File file) {
    def rangeHeader = request.getHeader("Range")
    //bytes=391694320-


    def fileLength = rawFile.length()
    def contentLength = rawFile.length().toString()
    def rangeEnd = fileLength.toLong()-1
    def rangeStart

    if(rangeHeader){
      rangeStart = rangeHeader.split("\\D+")[1].toLong()
      contentLength = fileLength - rangeStart
    }
    //add html5 video headers
    response.addHeader("Accept-Ranges", "bytes")
    response.addHeader("Content-Length", contentLength.toString())
    response.addHeader("Last-Modified", (new Date()).toString())
    response.addHeader("Cache-Control", 'public,max-age=3600,public')
    response.addHeader("Etag", file.sha256Hex)


    if(rangeHeader){
      response.addHeader("Content-Range", "bytes $rangeStart-$rangeEnd/$fileLength")
      response.setStatus(PARTIAL_CONTENT.value())
    }




    //Read and write bytes of file incrementally into the outputstream
    FileInputStream fis = new FileInputStream(rawFile) //391694394
    byte[] buffer = new byte[16000]

    if(rangeStart){
      fis.skip(rangeStart)
    }

    try{
      while (true){
        int read = fis.read(buffer)
        if (read == -1){
          break
        }
        response.outputStream.write(buffer, 0, read)
      }
      fis.close()
    }catch(Exception e){
//      e.printStackTrace()
//      e.getCause().printStackTrace()
    }
  }


  def fullyRemoveFile(File file){
    if(file.externalLink){
      return
    }
    if(file.associatedVideosInclDeleted){
      file.associatedVideosInclDeleted.each{ video ->
        video.removeFromFiles(file)
        video.save(flush: true, failOnError: true)
      }
    }

    if(file.isInUse){
      def tvShowByPoster = TvShow.findByPoster_image(file)
      if(tvShowByPoster){
        tvShowByPoster.poster_image = null
        tvShowByPoster.save(flush: true, failOnError: true)
      }

      def tvShowByBackdrop = TvShow.findByPoster_image(file)
      if(tvShowByBackdrop){
        tvShowByBackdrop.backdrop_image = null
        tvShowByBackdrop.save(flush: true, failOnError: true)
      }
    }

    if(file.imagePath && file.fileExists){
      java.io.File rawFile = new java.io.File(file.imagePath)
      rawFile.delete()
    }

    file.delete(flush: true)
  }
}
