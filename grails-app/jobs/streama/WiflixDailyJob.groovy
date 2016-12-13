package streama



class WiflixDailyJob {
  def paymentService
    static triggers = {
      simple startDelay: 1000, repeatCount: 0 // execute job once in 5 seconds
    }

    def execute(context) {
        // execute job
      String username = context.mergedJobDataMap.get('username');//TODO: not sure about context
      println(username);
      User user = User.findByUsername(username);
      if(user == null)
        return;
      println("user found continue with job execution");
      user.subscribedStatus = false;
      //Note: no validation check's
      user.save();

      Role role = Role.findByAuthority('ROLE_PAID');
      UserRole.remove(user,role, true);

      //ignite next
      paymentService.makeMpesaPayment(user,0);
    }
}
