package live_projects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1
{
        WebDriver driver;

@BeforeClass
    public void setup()
   {
    //Create a new instance of the Firefox driver
    driver = new FirefoxDriver();

    //Open browser
    driver.get("https://alchemy.hguy.co/jobs");
    //String title1 = driver.getTitle();
    //Print the title of the page
    //System.out.println("Page title is: " + title1);
    }
@Test
    public void testMethod()
    {
    String title1 = driver.getTitle();

    //Assertion for page title
    Assert.assertEquals("Alchemy Jobs – Job Board Application",title1);

    //Print title of new page
    //System.out.println("Title Matched ");

     }
@AfterClass

        public void testDown()
        {
            driver.close();
        }

    }

