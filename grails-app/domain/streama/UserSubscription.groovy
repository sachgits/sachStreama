package streama

import org.quartz.*;

class UserSubscription {

  Date startDate = new Date();
  Date endDate;
  String planName;
  long amount;
  static belongsTo = [user:User]

    static constraints = {
      startDate nullable: false;
      planName blank: false, nullable: false;
      endDate nullable: false;
    }

  public UserSubscription(long amnt, User usr){
    //ask user account to deduct some amount depending on cash and plans
    //if user account has 40 totalbalance and there is no plan for that then we deduct 0 from user account
    //if totalbalance is 50 only we deduct 50 from users totalbalance if 70 since there is no plan for 70 we deduct 50 from totalbalance
    //leaving balance of 20 to user's totalBalance when users totalBalance is 100 we subscribe user to 3 day plan if 130 we subscribe to 100
    //plan and return a balance of 30 if totalBalance is 150 we subscribe user to 4 day plan and if user totalbalnce is 200 we subscribe user
    //to 7 day plan if she sends 220 then one is subscribed to 7 day plan and gets a balance of 20 in his totalbalance

    user = usr
    if(amnt >= 50 && amnt < 100){
      planName = "@50 Daily";
      amount = 50;
      endDate = startDate + 1;
      user.totalBalance -= 50;
      user.subscribedStatus = true;
    }else if(amnt >= 100 && amnt < 150){
      planName = "@100 3 days";
      amount = 100;
      endDate = startDate + 3;
      user.totalBalance -= 100;
      user.subscribedStatus = true;
    }else if(amnt >= 150 && amnt < 200){
      planName = "@150 4 days";
      amount = 150;
      endDate = startDate + 4
      user.totalBalance -= 150;
      user.subscribedStatus = true;
    }else if(amnt >= 200){
      planName = "@200 Weekly";
      amount = 200;
      endDate = startDate + 7
      user.totalBalance -= 200;
      user.subscribedStatus = true;
    }

  }

  def afterInsert(){
    //put user to access control list ACL and create a trigger that will remove user from access control list
    //at the end of his/her plan
    println("after insert reached")
    UserRole.removeAll(user);
    def role = Role.findByAuthority("ROLE_PAID");
    UserRole.create(user, role);
    LinkedHashMap params = new LinkedHashMap();
    params.put("username", user.username);
    params.put("userRole", UserRole);
    Date tempDate = startDate;
    tempDate.setTime(startDate.getTime() + (2 * 1000 * 60));
    WiflixDailyJob.schedule(tempDate, ['username':user.username]);
    println("schedule created");

  }

}
