


  Feature: Tek_Ui_Insurance User Profile

    Scenario: Navigate to login and enter valid CSR
    credentials and navigate to Customer Service Portal
    then click on profile button validate information is in Profile Side Drawer is correct.
      Given Navigate to login
      When enter Credentials
      Then Navigate to customer service portal
      Then Click on profile button
      And Validate the information is in Profile Side Drawer is correct
      Then Click on LogOut Button
