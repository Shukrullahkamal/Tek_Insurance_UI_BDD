package pages;

import org.openqa.selenium.By;

public class CreateAccountPage {
    public static final By CLICK_ON_PRIMARY_ACCOUNT = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/a");
    public static final By CREATE_PRIMARY_ACCOUNT_HOLDER = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/h2");

    public static final By EMAIL_ADDRESS = By.xpath("//*[@id=\"email\"]");
    public static final By TITLE = By.xpath("//*[@id=\"title\"]");
    public static final By FIRST_NAME = By.name("firstName");
    public static final By LAST_NAME = By.xpath("//*[@id=\"lastName\"]");
    public static final By GENDER = By.xpath("//*[@id=\"gender\"]");
    public static final By MARITAL_STATUS = By.xpath("//*[@id=\"maritalStatus\"]");
    public static final By EMPLOYMENT_STATUS = By.xpath("//*[@id=\"employmentStatus\"]");
    public static final By DATE_OF_BIRTH = By.name("dateOfBirth");
    public static final By CREATE_ACCOUNT_BUTTON = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/form/div/div[2]/button[1]");
    public static final  By SIGN_UP_VALIDATION = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/h2[1]");
    public static final By ERROR_MESSAGE = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/form/div[1]");




}






