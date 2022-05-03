package live_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity8 {
    WebDriver driver;
    String UserNme,Pwd, ErrTxt;

    @BeforeClass
    public void initialize()
    {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");

    }
    @Test
    public void verify()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("Suresh");
        driver.findElement(By.xpath("//*[@id='user_pass']")).sendKeys("Suresh1");
        driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
        ErrTxt = driver.findElement(By.xpath("//div[1]/div/strong[1]")).getText();
        if (ErrTxt.equalsIgnoreCase("Error"));
        System.out.println("Login tried successfully");
    }
    @AfterClass
    public void conclusion()
    {
         driver.close();
    }
}
