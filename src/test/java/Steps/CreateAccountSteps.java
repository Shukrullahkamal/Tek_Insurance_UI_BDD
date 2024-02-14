package Steps;

import Utility.SeleniumUtility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CreateAccountPage;

public class CreateAccountSteps extends SeleniumUtility {

    @When("Click on Create Account Button")
    public void ClickOnCreateAccountButton(){
        ClickOnCreateAccountButtonIs(CreateAccountPage.CLICK_ON_PRIMARY_ACCOUNT);

    }
    @Then("validate title as expected Create Primary Account Holder")
    public void TitleAsExpected(){
        String ActualTitle = getElementText(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_HOLDER);
        Assert.assertEquals("Create Primary Account Holder", ActualTitle);
    }

    @And("fill up the form")
    public void FillUpTheForm(){

        sendText(CreateAccountPage.EMAIL_ADDRESS, "KAMAL122@GMAIL.COM");
        DropDwon(CreateAccountPage.TITLE, "Mr.");
        sendText(CreateAccountPage.FIRST_NAME, "Shukrullah");
        sendText(CreateAccountPage.LAST_NAME, "KAMAL");
        DropDownByValue(CreateAccountPage.GENDER,"Male");
        DropDownByIndex(CreateAccountPage.MARITAL_STATUS );
        sendText(CreateAccountPage.EMPLOYMENT_STATUS, "Student");
        sendText(CreateAccountPage.DATE_OF_BIRTH,"01/01/1999");

    }
    @Then("click on create account")
    public void ClickCreateAccount(){
        ClickOnCreateAccountButtonIs(CreateAccountPage.CREATE_ACCOUNT_BUTTON);
    }

    @And("Validate the SignUp Page")
    public void ValidateSignUpPage(){
        boolean SignUp = isElementDisplayed(CreateAccountPage.SIGN_UP_VALIDATION);
        Assert.assertTrue(SignUp);

    }

    @And("Error message as expected")
    public void MessageError() {
        boolean Error = isElementDisplayed(CreateAccountPage.ERROR_MESSAGE);
        Assert.assertTrue(Error);

    }}








