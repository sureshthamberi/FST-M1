package examples;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class googleTest
{

    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        // identify element
        WebElement p=driver.findElement(By.name("q"));
        //    /html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input
        //WebElement btn= driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
        WebElement btn= driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
   //           /html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]
        //WebElement bn = driver.findElement(By.name("btnK"));
        System.out.println("my name is:"+ btn.getTagName());
        System.out.println("my name is:"+ btn.getCssValue( "title"));
        System.out.println("my name is:"+ btn.getAttribute( "title"));
        //enter text with sendKeys() then apply submit()
        p.sendKeys("Selenium Java");
        // Explicit wait condition for search results
        WebDriverWait w = new WebDriverWait(driver, 5);

        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
        p.submit();
        //driver.close();
        //WebElement botn= driver.findElement(By.xpath("//center/input[@name='btnK']")) ;
        //String tle= driver.getTitle();
        //System.out.println("Title:"+ tle);
       // WebElement botn= driver.findElement(By.xpath("//div/center/input[@value='Google Search']")) ;
        //WebElement botn= driver.findElement(By.cssSelector("input.gNO89b"));//xpath("//div/center/input[@value='Google Search']")) ;

        //WebElement botn= driver.findElement(By.xpath("//input[@aria-label=\'Google Search\']")) ;
        //WebElement botn= driver.findElement(By.className("gLFyf gsfi")) ;
        //String btn=botn.getCssValue("aria-label");
        //botn.sendKeys("suresh");

        //WebElement botn= driver.findElement(By.xpath("//div[class='gb_1 gb_2 gb_9d gb_9c']")) ;
        //WebElement botn= driver.findElement(By.className("gb_1 gb_2 gb_9d gb_9c")) ;
        //System.out.println("my Name is :"+ botn.getText());
        //System.out.println(botn.getTagName());
        //driver.close();


    }
}


