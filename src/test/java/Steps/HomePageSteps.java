package Steps;

import Utility.SeleniumUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;

public class HomePageSteps extends SeleniumUtility {

@When("validate Home page title")
public void HomePageTitle(){

   String Tilte = getElementText(HomePage.HOME_PAGE_TITLE);
   Assert.assertEquals("TEK Insurance App", Tilte);

}

   @Then("validate primary account button exist")
public void ValidatePrimaryAccountButton(){
  boolean isDisplayed = isElementDisplayed(HomePage.CREATE_PRIMARY_ACCOUNT_EXIST);
  Assert.assertTrue(isDisplayed);
}
}
