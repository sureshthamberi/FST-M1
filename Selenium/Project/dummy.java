package live_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class dummy {
    WebDriver driver;

    @BeforeClass
    public void inintiate() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/post-a-job/");
        WebElement el;
}
@Test
public void test()
    {
        driver.switchTo().frame(0);
        //driver.switchTo().frame(0)
        //driver.switchTo().frame("//*[@id='tinymce']");
        //WebElement el = driver.switchTo().activeElement();
        //new Actions(driver).moveToElement(el).perform();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        //driver.findElement(By.xpath("//html/body/p")).sendKeys("Posting jobs here");
        //driver.
        //driver.findElement(By.tagName("P")).isEnabled();
        driver.findElement(By.tagName("body")).sendKeys("Posting jobs here");
        //WebElement el = driver.findElement(By.xpath("//p"));
        //el.sendKeys("Posting jobs here");
//        /html/body/p

        //driver.findElement(By.xpath("/html/body")).sendKeys("Check");
    }

    @AfterClass
    public void closing(){
        driver.close();
    }
}
