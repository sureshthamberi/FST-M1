package live_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;
import java.util.concurrent.TimeUnit;

public class Activity5 {
    WebDriver driver;
    String reqTitle, butn;

    WebElement button;

    @BeforeClass
    public void setupTest() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.navigate("jobs");
        //butn = driver.findElement(By.cssSelector("html body.home.page-template-default.page.page-id-16.ast-desktop.ast-plain-container.ast-no-sidebar.astra-2.0.1.ast-header-custom-item-inside.ast-single-post.ast-inherit-site-logo-transparent.astra.ast-normal-title-enabled.ast-mouse-clicked div#page.hfeed.site header#masthead.site-header.ast-primary-submenu-animation-fade.header-main-layout-1.ast-primary-menu-enabled.ast-logo-title-inline.ast-hide-custom-menu-mobile.ast-menu-toggle-icon.ast-mobile-header-inline div.main-header-bar-wrap div.main-header-bar div.ast-container div.ast-flex.main-header-container div.ast-main-header-bar-alignment div.main-header-bar-navigation nav#site-navigation.ast-flex-grow-1.navigation-accessibility.toggled div.main-navigation ul#primary-menu.main-header-menu.ast-nav-menu.ast-flex.ast-justify-content-flex-end.submenu-with-border.astra-menu-animation-fade li#menu-item-24.menu-item.menu-item-type-post_type.menu-item-object-page.menu-item-24 a")).getText();

        //button= driver.findElement(By.cssSelector("html body.home.page-template-default.page.page-id-16.ast-desktop.ast-plain-container.ast-no-sidebar.astra-2.0.1.ast-header-custom-item-inside.ast-single-post.ast-inherit-site-logo-transparent.astra.ast-normal-title-enabled.ast-mouse-clicked div#page.hfeed.site header#masthead.site-header.ast-primary-submenu-animation-fade.header-main-layout-1.ast-primary-menu-enabled.ast-logo-title-inline.ast-hide-custom-menu-mobile.ast-menu-toggle-icon.ast-mobile-header-inline div.main-header-bar-wrap div.main-header-bar div.ast-container div.ast-flex.main-header-container div.ast-main-header-bar-alignment div.main-header-bar-navigation nav#site-navigation.ast-flex-grow-1.navigation-accessibility.toggled div.main-navigation ul#primary-menu.main-header-menu.ast-nav-menu.ast-flex.ast-justify-content-flex-end.submenu-with-border.astra-menu-animation-fade li#menu-item-24.menu-item.menu-item-type-post_type.menu-item-object-page.menu-item-24 a")).click();
       // Select menu= new Select(driver.findElement(By.id("primary-menu")));
        //menu.selectByIndex("menu-item-24").click();
    }

    @Test
    public void verify()
    {
        button= driver.findElement(By.tagName("ul")).findElement(By.tagName("li"));//.getTagName("a");
        //System.out.println(driver.findElement(By.tagName("ul")).findElement(By.tagName("li")).findElement(By.id("menu-item-25")).getText());
        //driver.findElement(By.tagName("ul")).findElement(By.tagName("li")).findElement(By.id("menu-item-25")).click();
        butn = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a")).getText();
        //button=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a"));
        System.out.println("Menu is: " + butn);
        //driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a")).click();
        button.click();
        reqTitle= driver.findElement(By.xpath("//header/h1[@class='entry-title']")).getText();
        System.out.println("expected heading is "+reqTitle);
        Assert.assertEquals(reqTitle,"Jobs");
      }


@AfterClass
 public void close(){   driver.close(); }}
