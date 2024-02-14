package Utility;

import Base.BaseSetUp;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SeleniumUtility extends BaseSetUp {
    public WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20));

    }
    private WebElement WaitForVisibility(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public String getElementText(By locator) {

       WebElement element = WaitForVisibility(locator);
       return element.getText();

    }
    public boolean isElementDisplayed(By locator) {
        return WaitForVisibility(locator).isDisplayed();
    }

    public void ClickOnCreateAccountButtonIs(By locator) {
        getDriver().findElement(locator).click();
    }

    public void sendText(By locator, String text) {
        WaitForVisibility(locator).sendKeys(text);

    }
    public void DropDwon(By locator, String value) {
        WebElement element = WaitForVisibility(locator);
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public void DropDownByIndex(By locator) {
        WebElement element = WaitForVisibility(locator);
        Select select = new Select(element);
        select.selectByIndex(2);
    }

    public void DropDownByValue(By locator, String item) {
        WebElement element = WaitForVisibility(locator);
        Select select = new Select(element);
        select.selectByVisibleText(item);

    }

    public void ClickOnLogInButton(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();

    }

    public void EnterCSR(By locator, String text) {
        WaitForVisibility(locator).sendKeys(text);
    }

    public void IsElementEnabled(By locator) {
        WebElement element = WaitForVisibility(locator);
        element.isEnabled();
    }


    public void ClickOnLogOUT(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void ClickOnSignInButton(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

}


