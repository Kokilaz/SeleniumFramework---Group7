package Pages;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class HomePage extends CommonAPI {

    static String homepageUrl = "https://www.bathandbodyworks.com/";
    HomePage homePage;

    public class CommonAPI {
        public  WebDriver driver = null;
        String url = null;

        @BeforeMethod
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "/Users/preethikokila/Desktop/PreethiKSeleniumProject/BathandBodyWorks/Driver/chromedriver");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        @AfterMethod
        public void cleanUp() {
            driver.close();

        }
    }

    public static void testUserCanNavigateToHomePage() {
        String homepageTitle = "Body Care & Home Fragrances You'll Love | Bath & Body Works";
        driver.navigate().to(homepageUrl);
        driver.findElement(By.cssSelector("body > div.ui-dialog.ui-widget.ui-widget-content.ui-corner-all.ui-front.global-email-dialog.ui-draggable > div.ui-dialog-titlebar.ui-widget-header.ui-corner-all.ui-helper-clearfix.ui-draggable-handle > button > span.ui-button-icon-primary.ui-icon.ui-icon-closethick")).click();
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(), homepageTitle);
   }
}