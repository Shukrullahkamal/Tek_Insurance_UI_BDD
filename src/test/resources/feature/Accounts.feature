
@Smoke @Regression
Feature: Tek_Ui_insurance Account test!

  Scenario: Navigate to Customer Service Portal with valid CSR credentials and
  navigate to Accounts verify 5 row /page is default
    Given Navigate to login
    When Enter  username and password
    Then Press The SignIn BUTTON
    And Click on Account
    And Five Is default


