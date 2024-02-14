package pages;

import org.openqa.selenium.By;
public class AccountPage {

    public static final By VALIDATE_ACCOUNT = By.xpath("/html/body/div[1]/div/div[2]/div/div/a[1]");
    public static final By EMAIL_ADDRESS = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[2]");
    public static final By FULL_NAME = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[3]");
    public static final By DATE_OF_BIRTH = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[6]");
    public static final By GENDER = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/table/thead/tr/th[4]");


}
