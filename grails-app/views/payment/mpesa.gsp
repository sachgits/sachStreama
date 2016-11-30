

<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Wiflix :: Lipa Na Mpesa </title>
  <!-- for-mobile-apps -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="keywords" content="Wiflix Payment Widget, Wiflix Movies, Wiflix Streaming service, wiflix movies @50,
no dataplan needed free" />
  <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
  function hideURLbar(){ window.scrollTo(0,1); } </script>
  <!-- //for-mobile-apps -->
  <!-- js -->
  <asset:javascript type="text/javascript" src="creditly.js" ></asset:javascript>
  <asset:javascript src="jquery.min.js"></asset:javascript>
  <script type="text/javascript">
    $(function() {
      var creditly = Creditly.initialize(
        '.creditly-wrapper .expiration-month-and-year',
        '.creditly-wrapper .credit-card-number',
        '.creditly-wrapper .security-code',
        '.creditly-wrapper .card-type');

      $(".creditly-card-form .submit").click(function(e) {
        e.preventDefault();
        var output = creditly.validate();
        if (output) {
          // Your validated credit card output
          console.log(output);
        }
      });
    });
  </script>
  <!-- //js -->
  <asset:stylesheet src="paymentStyle.css" rel="stylesheet" type="text/css" media="all" />
  <asset:stylesheet rel="stylesheet" src="creditly.css" type="text/css" media="all" />
  <link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
</head>
<body>
<div class="main">
  <h1>Lipa Na Mpesa</h1>
  <div class="agileits_main_grid w3layouts_main w3_main_grid">
    <div class="agileits_main_grid_right agileits_w3layouts_grid_right">
      <h2>Wiflix movies @50 Daily</h2>
      <p>Ksh 50/-</p>
    </div>
    <div class="agileits_main_grid_left w3l_main w3ls_main_grid_left">
      <div class="agileits_main_grid_left1 agileits_main_grid_left1">
        <form action="#" method="post" class="creditly-card-form agileinfo_form">
          <section class="creditly-wrapper wthree, w3_agileits_wrapper">
            <div class="credit-card-wrapper">
              <div class="first-row form-group">
                <div class="controls">
                  <label class="control-label">Go to M-PESA on your phone with your number as 0721169392</label>
                </div>
                <div class="controls">
                  <label class="control-label" >Select Lipa na MPESA, PAY BILL option</label>
                </div>
                <div class="controls">
                  <label class="control-label">Enter Business no. 220220</label>
                </div>
                <div class="controls">
                  <label class="control-label" >Enter Account no. as wiflix</label>
                </div>
              </div>

              <div class="second-row form-group">
                <div class="controls">
                  <label class="control-label">Enter your M-PESA PIN and send</label>
                </div>
                <div class="controls">
                  <label class="control-label">Wait for M-PESA Confirmation Message</label>
                </div>
              </div>
              <button class="submit"><span>Verify</span></button>
            </div>
          </section>

        </form>
      </div>
    </div>
    <div class="clear"> </div>
  </div>
  <div class="agileits_copyright agile_copy">
    <p class="w3_agile_right">Copyright &copy; 2016 Wiflix . All Rights Reserved</p>
  </div>
</div>
</body>
</html>
