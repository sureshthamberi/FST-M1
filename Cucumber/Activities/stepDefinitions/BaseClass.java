package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseClass {
    //Create a new instance of the Firefox driver
    static WebDriver driver =new FirefoxDriver();
    static WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));


}
