package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.google.com/");
        //String title =driver.getTitle();
        //System.out.println("First page:" + title);
       // driver.navigate().to("https://www.customink.com/fundraising//");
        //String title2 =driver.getTitle();
        //System.out.println("second page:" + title2);
        //WebElement a= driver.findElement(By.name("btnK"));
        //WebElement a= driver.findElement(By.xpath("//input[@class=gNO89b]"));
        //System.out.println("button name" + a.getText());

        WebElement txt = driver.findElement(By.xpath("//input[@type=text]")); //className("gLFyf gsfi"));
        txt.sendKeys("mail.com");
        //System.out.println(txt.getText());
        driver.close();
    }
}
