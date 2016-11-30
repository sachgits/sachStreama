package streama

import grails.transaction.Transactional
import org.grails.datastore.mapping.core.Session

@Transactional
class UserTimerService {

    def serviceMethod() {

    }
  /*
  * no of hours user have been in use
   */
  def getNumberOfSecondsFromLastUpdate(int lastUpdate){
    int nowInMilliseconds = 10001010101;
    return nowInMilliseconds - lastUpdate;
  }

  /*
  *alert time is over user needs to pay now
  * TODO: not sure if we should keep track of time in seconds or miliseconds
   */
  def isTimeUpOrNot(int milliSeconds){
    if(milliSeconds >= 5*60)
      return true;
    return false;
  }

  /*
  * updates users usage in last 24hrs
  * updates every 5 minutes while viewing movies
  *
   */
  def userUsageMeter(User user){

  }

  /*
  * Try to serialize the last time user was online and watching movie so as to track if user has finished 24hours
  * to users browser maybe passing it via apis RESTfull
   */
  def serializeHoursToBrowser(response, int seconds, User user){

  }
  /*
  * Try to serialize the last time user was online and watching movie so as to track if user has finished 24hours
  * to users browser using grails session manager
   */
  def serializeHoursToSession(Session session, int seconds, User user){

  }
  /*
  * deserialize what we last serialized to users browser i.e last time user was online and watching movie
   */
  def deserializeHoursFromBrowser(request, User user){

  }
  /*
  * return the last time user was online and watching movie i.e last serialized time update
   */
  def deserializeHoursFromSession(Session session, User user){

  }

}
