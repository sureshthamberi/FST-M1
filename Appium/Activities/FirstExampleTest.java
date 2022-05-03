package examples;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstExampleTest {

    //Driver Declaration
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {

        //Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceId","NVPZWK7P49LNSSCA");
        caps.setCapability("platformName","android");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("appPackage","com.android.calculator2");
        caps.setCapability("appActivity",".Calculator");
        caps.setCapability("noReset",true);
        //Appium Service URL

        URL serverURL =new URL("http://localhost:4723/wd/hub");


        //Driver initialization
        driver = new AndroidDriver<>(serverURL,caps);

    }
  @Test
    public void additionWithCalc(){
    // Find number 5
      MobileElement digit5=driver.findElementById("digit5");  // resourceID from inspector
      //Tap number 5
      digit5.click();

      //tap plus
      driver.findElementById("plus").click();

       //Tap number 5 again
        digit5.click();


      //Tap equals

      driver.findElementById("equal").click();
       // Find the result text
      String result=driver.findElementById("edittext").getText();
      //Assertion for the expected result
     // Assert.assertEquals(result,"5+5 =10");
      Assert.assertTrue(result.contains("10"));
      System.out.println("Mobile Tester");


  }
@AfterClass
    public void tearDown()
   {
    //Close the Application
    driver.quit();
   }


}
