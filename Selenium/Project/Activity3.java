package live_projects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Activity3 {

    WebDriver driver;
    String urlName;

@BeforeClass
public void setup()
{
     driver= new FirefoxDriver();
     driver.get("https://alchemy.hguy.co/jobs");
     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     //driver.findElement(By.xpath("//*[@id='post-16']/header/h1")).getText();
     //urlName=driver.findElement(By.xpath("//*[@id='post-16']/header/h1")).getAttribute("src").
    //urlName=driver.findElement(By.cssSelector(".attachment-large")).findElement(By.ByTagName("img")).getAttribute("src");
    urlName=driver.findElement(By.cssSelector(".attachment-large")).getAttribute("src");

}

@Test
public void process()
{
    System.out.println("url of the header image is: " +urlName);
}

@AfterClass
public void closing(){  driver.close();}
}

