package Steps;

import Utility.SeleniumUtility;
import io.cucumber.java.Before;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AccountPage;

public class AccountSteps extends SeleniumUtility {

    @And("Click on Account")
    public void ClickAccount(){
        ClickOnCreateAccountButtonIs(AccountPage.VALIDATE_ACCOUNT);
    }

    @And("Five Is default")
    public void VerifyFivePageIsDefault(){

        boolean ValidateACCOUNT = isElementDisplayed(AccountPage.VALIDATE_ACCOUNT);
        Assert.assertTrue(ValidateACCOUNT);

        boolean ValidateEmailAddress = isElementDisplayed(AccountPage.EMAIL_ADDRESS);
        Assert.assertTrue(ValidateEmailAddress);

        boolean ValidateFullName = isElementDisplayed(AccountPage.FULL_NAME);
        Assert.assertTrue(ValidateFullName);

        boolean ValidateDateOfBirth = isElementDisplayed(AccountPage.DATE_OF_BIRTH);
        Assert.assertTrue(ValidateDateOfBirth);
          boolean ValidateGender = isElementDisplayed(AccountPage.GENDER);
          Assert.assertTrue(ValidateGender);


    }}







