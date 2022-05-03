package live_projects;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ActivityChrome
{
    //Global variables declaration
    WebDriverWait wait;
    AndroidDriver<MobileElement> driver = null;

    @BeforeClass
    public void initiate() throws MalformedURLException
        {
            // Set the Desired Capabilities
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", "NVPZWK7P49LNSSCA");
            caps.setCapability("platformName", "Android");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("appPackage", "com.android.chrome");//"com.android.chrome"
            caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
            caps.setCapability("noReset", true);
            caps.setCapability("adbExecTimeout", 50000);

            // Instantiate Appium Driver

            URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
            driver = new AndroidDriver<MobileElement>(appServer, caps);
            wait = new WebDriverWait(driver, 50);

            // Open page
            driver.get("https://www.training-support.net/selenium");
        }

    @Test
    public void scrollIntoViewTest ()
        {
            String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
            // Wait for the page to load
            //wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View")));

            // Scroll element into view and click it
            driver.findElement(
                            MobileBy.AndroidUIAutomator(UiScrollable + ".scrollForward(7).scrollIntoView(text(\"To-Do List\"))"))
                    .click();

            // Wait for the page to load
//            driver.findElementById("taskInput").sendKeys("my Name Suresh");
    //string 1
            driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"taskInput\")")).sendKeys("MY NAME SURESH");
            //wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Click Me!")));
  //          wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Button")));
            //wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("resourceID(\"tasksCard\")")));
            // Click on Add Task
            // Scroll element into view and click it
            //driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable + ".scrollForward(7).scrollIntoView(text(\"Add Task\"))"))
            //        .click();
            driver.findElement(MobileBy.linkText("Add Task")).click();
//2
            driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"taskInput\")")).sendKeys("MY PET NAME SCOOBY");
            driver.findElement(MobileBy.linkText("Add Task")).click();

//3
            driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"taskInput\")")).sendKeys("MY BIKE is HERO");
            driver.findElement(MobileBy.linkText("Add Task")).click();


            // Print page title
  //          String pageTitle = driver.findElementByXPath("//android.widget.TextView[contains(@text, 'New Tab')]").getText();
    //        System.out.println("Page title is: " + pageTitle);

            // Assertion
            //////////////////  suresh  Assert.assertEquals(pageTitle, "New Tab Opener");
        }

@AfterClass
    public void afterClass()
{
         driver.quit();
}
}
