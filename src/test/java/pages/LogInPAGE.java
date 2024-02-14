package pages;

import org.openqa.selenium.By;

public class LogInPAGE {
 public static final By LOG_IN_BUTTON = By.xpath("//*[@id=\"root\"]/div/div[1]/div/a[2]");
 public static final By USER_NAME = By.xpath("//*[@id=\"username\"]");
 public static final By PASSWORD = By.xpath("//*[@id=\"password\"]");
 public static final By SIGN_IN = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/form/div/div[3]/button[1]");
 public static final By WRONG_USER = By.xpath("//*[@id=\"username\"]");
 public static final By WRONG_PASSWORD = By.xpath("//*[@id=\"password\"]");
 public static final By ERROR_MESSAGE_RESPOND = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div");

 // for Scenario Outline
 public static final By CLICK_ON_LOG_IN = By.xpath("//*[@id=\"root\"]/div/div[1]/div/a[2]");
 public static final By CLICK_ON_SIGN_IN_BUTTON = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/form/div/div[3]/button[1]");



}
