package pages;

import org.junit.Before;
import org.openqa.selenium.By;

import javax.swing.plaf.PanelUI;

public class PlanPage {

    public static final By CLICK_ON_PLAN_PAGE = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/a[2]");

    //First Row Elements
    public static final By VALIDATE_MOTOR_BIKE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[1]");
    public static final By MOTOR_CYCLE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[2]");
    public static final By BASE_PRICE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[3]");
    public static final By CREATED_DATE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[4]");
    public static final By EXPIRED_DATE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[5]");

    // Second Row Elements
     public static final By VALIDATE_BOAT = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[2]/td[1]");
     public static final By BOAT = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[2]/td[2]");
     public static final By BOAT_BASE_PRICE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[2]/td[3]");
     public static final By BOAT_CREATED_DATE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[3]/td[4]");
     public static final By BOAT_EXPIRED_DATE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[2]/td[5]");

     // Third Row Elements
    public static final By VALIDATE_HOUSE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[3]/td[1]");
    public static final By VALIDATE_RENTERS = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[3]/td[2]");
    public static final By HOUSE_BASE_PRICE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[3]/td[3]");
    public static final By HOUSE_CREATED_DATE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[3]/td[4]");
    public static final By HOUSE_EXPIRED_DATE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[3]/td[5]");


    //Fourth Row Elements

    public static final By  VALIDATE_VEHICLE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[4]/td[1]");
    public static final By  VALIDATE_AUTO = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[4]/td[2]");
    public static final By  VEHICLE_BASE_PRICE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[4]/td[3]");
    public static final By  VEHICLE_CREATED_DATE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[4]/td[4]");
    public static final By  VEHICLE_EXPIRED_DATE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[4]/td[5]");


}
