import groovy.sql.Sql;
class BootStrap {

    def marshallerService
    def defaultDataService
    def migrationService
    //def dataSource

    def init = { servletContext ->
        marshallerService.init()
        defaultDataService.createDefaultRoles()
        defaultDataService.createDefaultUsers()
        defaultDataService.createDefaultSettings()
        migrationService.setDefaultDeletedFlag()
        migrationService.setTrailerForMovies()
        migrationService.importMovieDbGenres()
        migrationService.addGenresToMoviesAndShows();
       // Sql sql = new Sql(dataSource: dataSource);
     // boolean table_count = sql.execute(QuartzTable.qrtz_table_check);
       /* if(table_count){
          System.println("does the Qrtz table exists: " + table_count);
          sql.execute(QuartzTable.QUARTZ_DDL);
        }else
          System.println("Qrtz table does not exist: " + table_count); */

    }
    def destroy = {
    }
}
