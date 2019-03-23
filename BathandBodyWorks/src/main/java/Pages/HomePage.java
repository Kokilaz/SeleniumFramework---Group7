package Pages;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class HomePage extends CommonAPI {

    static String homepageUrl = "https://www.bathandbodyworks.com/";
    HomePage homePage;


    public static void testUserCanNavigateToHomePage() {
        String homepageTitle = "Body Care & Home Fragrances You'll Love | Bath & Body Works";
        driver.navigate().to(homepageUrl);
        driver.findElement(By.cssSelector("body > div.ui-dialog.ui-widget.ui-widget-content.ui-corner-all.ui-front.global-email-dialog.ui-draggable > div.ui-dialog-titlebar.ui-widget-header.ui-corner-all.ui-helper-clearfix.ui-draggable-handle > button > span.ui-button-icon-primary.ui-icon.ui-icon-closethick")).click();
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(), homepageTitle);
   }
}