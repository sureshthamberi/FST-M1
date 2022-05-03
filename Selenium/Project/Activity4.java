package live_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;
    String scnHeading;

    @BeforeClass
    public void setUP() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
    }

    @Test
    public void Testhere(){
        //scnHeading=driver.findElement(By.cssSelector("html body.home.page-template-default.page.page-id-16.ast-desktop.ast-plain-container.ast-no-sidebar.astra-2.0.1.ast-header-custom-item-inside.ast-single-post.ast-inherit-site-logo-transparent.astra.ast-normal-title-enabled.ast-mouse-clicked div#page.hfeed.site div#content.site-content div.ast-container div#primary.content-area.primary main#main.site-main article#post-16.post-16.page.type-page.status-publish.has-post-thumbnail.ast-article-single div.entry-content.clear h2")).
        scnHeading=driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/h2")).getText();
        System.out.println("Second Heading in the page is: "+scnHeading);
        Assert.assertEquals(scnHeading,"Quia quis non");
    }
    @AfterClass
    public void ClosingBrowser(){
        driver.close();
    }
}
