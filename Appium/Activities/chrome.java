package activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class chrome {
  AndroidDriver<MobileElement> driver;
  WebDriverWait wait;
    @BeforeClass
    public void initiate() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

// Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
    }

    @Test
    public void launching()
    {
        // Open the browser with the URL
        driver.get("https://www.training-support.net/selenium");

// Locate heading on page and print it
        //String pageTitle = driver.findElementBy...("...").getText();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.className("android.widget.TextView")));
        String pageTitle = driver.findElementByXPath("//android.widget.TextView[1][@text='Selenium']").getText();
        System.out.println("Heading: " + pageTitle);
    }
    @AfterClass
    public void close()
    {
      driver.close();
    }
}
