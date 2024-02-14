package pages;

import org.openqa.selenium.By;
public class UserProfilePage {
    public static final By NAVIGATE_TO_LOGIN = By.xpath("//*[@id=\"root\"]/div/div[1]/div/a[2]");
    public static final By USER_NAME = By.xpath("//*[@id=\"username\"]");
    public static final By PASSWORD = By.xpath("//*[@id=\"password\"]");
    public static final By CLICK_ON_SIGN_IN = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/form/div/div[3]/button[1]");
    public static final By PRESS_THE_PROFILE_BUTTON = By.xpath("//button[@aria-label='profile']");
    public static final By USER_TYPE = By.xpath("//*[@id=\"chakra-modal--body-:r3:\"]/div/div/div[2]/p[2]");
    public static final  By VALIDATE_FULL_NAME = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[3]/p[2]");
    public static final  By VALIDATE_USER_NAME = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[4]/p[2]");
    public static final  By CLICK_LOG_OUT_BUTTON = By.xpath("/html/body/div[3]/div[3]/div/div/footer/div/button[1]");
}


