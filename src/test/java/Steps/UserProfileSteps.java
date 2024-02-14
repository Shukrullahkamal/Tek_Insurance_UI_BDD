package Steps;

import Utility.SeleniumUtility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.UserProfilePage;


public class UserProfileSteps  extends SeleniumUtility {

    @Given("Navigate to login")
    public void NavigateToLogIn(){
        ClickOnLogInButton(UserProfilePage.NAVIGATE_TO_LOGIN);
    }

    @When("enter Credentials")
    public void EnterUserAndPass(){
        EnterCSR(UserProfilePage.USER_NAME,"supervisor");
        EnterCSR(UserProfilePage.PASSWORD,"tek_supervisor");
    }

    @Then("Navigate to customer service portal")
    public void NavigateToPortal(){
        ClickOnSignInButton(UserProfilePage.CLICK_ON_SIGN_IN);
    }

    @Then("Click on profile button")
   public void ProfileBUTTON() {
        ClickOnCreateAccountButtonIs(UserProfilePage.PRESS_THE_PROFILE_BUTTON);

   }

   @And("Validate the information is in Profile Side Drawer is correct")
    public void ValidateTheInformation(){
        boolean ValidateUserType = isElementDisplayed(UserProfilePage.USER_TYPE);
        Assert.assertTrue(ValidateUserType);

        boolean ValidateFullName = isElementDisplayed(UserProfilePage.VALIDATE_FULL_NAME);
        Assert.assertTrue(ValidateFullName);
        boolean ValidateUerName = isElementDisplayed(UserProfilePage.VALIDATE_USER_NAME);
        Assert.assertTrue(ValidateUerName);

    }

     @Then("Click on LogOut Button")
      public void LOG_OUT(){

        ClickOnLogOUT(UserProfilePage.CLICK_LOG_OUT_BUTTON);


     }


}







