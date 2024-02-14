package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseSetUp {
    private static WebDriver driver;
        public void OpenBrowser(){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.get("https://dev.insurance.tekschool-students.com");
    }
    public WebDriver getDriver(){
            return driver;
    }
    public void QuitBrowser(){
            if (driver != null)
                driver.quit();
    }



}
