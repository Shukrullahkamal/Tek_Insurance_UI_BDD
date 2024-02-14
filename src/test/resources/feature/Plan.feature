
@Smoke

  Feature: Tek_Ui_insurance_Plan pager testing


    Scenario: Navigate to Customer Service Portal with valid CSR credentials
    and navigate to Plans Page. Validate 4 row of data is present.

      Given Navigate to login
      When Enter  username and password
      Then Press The SignIn BUTTON
      And Clock on plan page
      Then Validate 4 row of data is present


     Scenario:  Navigate to Customer Service Portal with valid CSR credentials and navigate to Plans Page.
       then validate Create Date is Today date in (EST Time zone).
     and Date Expire is a day after (EST Time Zone)

       Given Navigate to login
       When Enter  username and password
       Then Press The SignIn BUTTON
       And Clock on plan page
       Then Create Date is Today date in EST Time zone
       And  The Date Expire is a day after EST Time Zone
