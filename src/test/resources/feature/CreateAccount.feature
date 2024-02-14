@Smoke @Regression
  Feature:CreateAccount page

    Scenario:Navigate to Home page then click on Create Primary Account Button.
    User should navigate to Create Account form page validate Form Title as Expected
    “Create Primary Account Holder”
      When Click on Create Account Button
      Then validate title as expected Create Primary Account Holder

      Scenario: On Create primary account holder form fill up the form and click on create Account Button
      Validate user navigate to Sing up your Account page and email address shows as expected.
        When Click on Create Account Button
        And fill up the form
        Then click on create account
        And Validate the SignUp Page
        And Error message as expected



