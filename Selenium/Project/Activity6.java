package live_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;


public class Activity6
{
     WebDriver driver;
     String reqJob, butn,expdTitle,EmailPrt;

@BeforeClass
     public void setUP() {
          reqJob = "Banking";
          driver = new FirefoxDriver();
          FluentWait wait = new FluentWait(driver);

}
@Test
     public void verification()
{
          driver.get("https://alchemy.hguy.co/jobs");
          driver.findElement(By.cssSelector("#menu-item-24 > a:nth-child(1)")).click();
          //driver.manage().timeouts().implicitlyWait()
          expdTitle = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
          if (expdTitle.equalsIgnoreCase("jobs"))
            if (driver.findElement(By.xpath("//*[@id='search_keywords']")).isDisplayed())
                driver.findElement(By.xpath("//*[@id='search_keywords']")).sendKeys(reqJob);
                if (driver.findElement(By.xpath("//input[@value='Search Jobs']")).isDisplayed())
                    driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
                    if (driver.findElement(By.xpath("//a/div[1]/h3")).isDisplayed())
                       System.out.println(" i am at page:" + driver.findElement(By.xpath("//a/div[1]/h3")).getText());
                       driver.findElement(By.xpath("//a/div[1]/h3")).click();
                       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
                       if (driver.findElement(By.xpath("//input[@value='Apply for job']")).isDisplayed())
                          driver.findElement(By.xpath("//input[@value='Apply for job']")).click();
                          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
                          if (driver.findElement(By.xpath("//a[@class='job_application_email']")).isDisplayed())
                              System.out.println("Button :" + driver.findElement(By.xpath("//input[@value='Apply for job']")).getText() + "clicked successfully");
                             EmailPrt = driver.findElement(By.xpath("//a[@class='job_application_email']")).getText();
                             System.out.println("Eamil to is:  " + EmailPrt);
    }

@AfterClass
    public void done()
     {

   driver.close();
     }
}
