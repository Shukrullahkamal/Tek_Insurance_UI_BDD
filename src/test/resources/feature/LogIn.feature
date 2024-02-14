
@Smoke
Feature: Login page



  Scenario: Navigate to login by clicking on Login button and enter valid csr user
  Username: supervisor
  Password: tek_supervisor

    Given Navigate to Tek ui
    Given Click on Login Button
    When Enter  username and password
    And validate user navigate to Customer Service Portal




    Scenario: Navigate to login and enter wrong credentials and validate error message as expected
    Note both wrong username and wrong password should tested
      Given Click on Login Button
      Given  Enter wrong username and password
      And validate user navigate to Customer Service Portal
      Then Validate error message


      # We can use Scenario Outline to define this Scenario as well
      Scenario Outline: LogIn step
             When CLICK ON login
             Then Press The SignIn BUTTON
             Given enter username as "<username>" and password as "<password>"
        Examples:
        | username | | password |
        | supervisor| | Tek_Supervisor|



