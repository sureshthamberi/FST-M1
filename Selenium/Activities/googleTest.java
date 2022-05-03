package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googleTest {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        //WebElement btng = driver.findElement(By.cssSelector("input.value=Google."));
        WebElement btng = driver.findElement(By.xpath("//centre/input[@name='btnk']"));
        System.out.println(btng.getText());

    }
}
