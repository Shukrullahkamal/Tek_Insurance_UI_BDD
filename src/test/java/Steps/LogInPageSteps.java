package Steps;

import Utility.SeleniumUtility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LogInPAGE;


public class LogInPageSteps extends SeleniumUtility {


    @Given("Navigate to Tek ui")
    public void NavigateToTekUI(){
        OpenBrowser();
    }

    @Given("Click on Login Button")
    public void ClickOnLogIN(){
        ClickOnCreateAccountButtonIs(LogInPAGE.LOG_IN_BUTTON);
    }

    @When("Enter  username and password")
    public void EnterUserAndPass(){
        sendText(LogInPAGE.USER_NAME, "supervisor");
        sendText(LogInPAGE.PASSWORD,"tek_supervisor");
    }


    @And("validate user navigate to Customer Service Portal")
    public void ClickOnSignInButton(){
        ClickOnCreateAccountButtonIs(LogInPAGE.SIGN_IN);
    }



    @Given("Enter wrong username and password")
    public void WrongUserAndPass(){
        sendText(LogInPAGE.WRONG_USER,"WrongUser");
        sendText(LogInPAGE.WRONG_PASSWORD, "WrongPASSWORD");
    }


    @Then("Validate error message")
    public void ValidateErrorMessage(){
        boolean Error = isElementDisplayed(LogInPAGE.ERROR_MESSAGE_RESPOND);
        Assert.assertTrue(Error);
    }

    // using Scenario outline for login steps!

    @When("CLICK ON login")
  public void LOGINCLICK(){
        ClickOnCreateAccountButtonIs(LogInPAGE.CLICK_ON_LOG_IN);

  }

    @Given("enter username as {string} and password as {string}")
    public void  EnterCredentials(String username, String password){

        sendText(LogInPAGE.USER_NAME, "Supervisor");
        sendText(LogInPAGE.PASSWORD, "Tek_Supervisor");

    }

    @Then("Press The SignIn BUTTON")
      public void PressTheSignIn(){
        ClickOnCreateAccountButtonIs(LogInPAGE.CLICK_ON_SIGN_IN_BUTTON);

      }
    }


