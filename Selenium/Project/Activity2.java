package live_projects;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Activity2 {
    WebDriver driver;
    String headTitle;
    String Expectd = "Welcome to Alchemy Jobs";

    @BeforeClass
        public void setup()
        {
            driver = new FirefoxDriver();
            driver.get("https://alchemy.hguy.co/jobs");
            driver.manage().window().maximize();
            //headTitle = driver.findElement(By.tagName("h1")).findElement(By.className("entry-title")).getText();
            headTitle = driver.findElement(By.xpath("//*[@id='post-16']/header/h1")).getText();
            System.out.println(Expectd);
            System.out.println(headTitle);
        }
    @Test
        public void testMethod ()
        {

            if (Expectd.equalsIgnoreCase(headTitle))
                System.out.println("Hedding matched with expected");
            else
                System.out.println("Heading not Matched with expected");


        }
    @AfterClass
        public void endTest ()    {     driver.close();    }

}