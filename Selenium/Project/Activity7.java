package live_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity7 {

    WebDriver driver;
    String reqJob, butn, expdTitle, returnPage;
    @BeforeClass
    public void setUP() {

        driver = new FirefoxDriver();
        //FluentWait wait = new FluentWait(driver);
        //Select dropJobType = new Select();
    }
    @Test
    public void verification()
    {
        driver.get("https://alchemy.hguy.co/jobs");
        driver.findElement(By.cssSelector("#menu-item-26 > a:nth-child(1)")).click();
                //driver.manage().timeouts().implicitlyWait()
        expdTitle = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();

        System.out.println("I am in page : "+ expdTitle);
        driver.findElement(By.cssSelector("#create_account_email")).sendKeys("tt@yahoo.com");
        driver.findElement(By.cssSelector("#job_title")).sendKeys("SSsoftwareEng1");
        driver.findElement(By.cssSelector("#job_location")).sendKeys("London");
        Select dropJobType= new Select(driver.findElement(By.cssSelector("#job_type")));
        dropJobType.selectByVisibleText("Part Time");
        //driver.switchTo().frame(0);
        //driver.findElement(By.tagName("body")).sendKeys("Posting jobs here");
        driver.findElement(By.xpath("//*[@id='company_name']")).sendKeys("SS com pvt ltd");
        driver.findElement(By.cssSelector("#application")).sendKeys("ss@yahoo.com");
        driver.findElement(By.xpath("//*[@id='company_website']")).sendKeys("http:\\SS.com");
        driver.findElement(By.xpath("//*[@id='company_tagline']")).sendKeys("my job is software");
        driver.findElement(By.xpath("//*[@id='company_video']")).sendKeys("http:\\myvedio.com");
        driver.findElement(By.xpath("//*[@id='company_twitter']")).sendKeys("http:\\twitter.com");
        driver.switchTo().frame(0);
        driver.findElement(By.tagName("body")).sendKeys("Posting jobs here");
        driver.switchTo().defaultContent(); //switching back from the iframe
        driver.findElement(By.xpath("//form/p/input[4]")).click();
        driver.findElement(By.xpath("//*[@id='job_preview_submit_button']")).click();

                //----------Jobs search----------
                //driver.manage().timeouts().implicitlyWait()
        driver.get("https://alchemy.hguy.co/jobs");
        driver.findElement(By.cssSelector("#menu-item-24 > a:nth-child(1)")).click();
        returnPage = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
       if (returnPage.equalsIgnoreCase("jobs"))
           System.out.println("I am at page:" + returnPage);
           driver.findElement(By.xpath("//*[@id='search_keywords']")).sendKeys("SSsoftwareEng1");
           driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
           System.out.println("My Job posted successfully with title: " + driver.findElement(By.xpath("//a/div[1]/h3")).getText());


    }

    @AfterClass
    public void done()
    {

        driver.close();
    }

}
