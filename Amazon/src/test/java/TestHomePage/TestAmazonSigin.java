package TestHomePage;

import HomePage.AmazonHomePageSigin;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAmazonSigin extends AmazonHomePageSigin {

    AmazonHomePageSigin amazonHomePageSigin;
    String Url = "https://www.amazon.com";

    @BeforeMethod
    public void initialize(){
        driver.navigate().to(Url);
        amazonHomePageSigin = PageFactory.initElements(driver, AmazonHomePageSigin.class);
    }

    @Test
    public void setopenlogin(){
        amazonHomePageSigin.openlogin();
    }

    @Test
    public void setgiveEmail(){
        amazonHomePageSigin.giveEmail();
    }

    @Test
    public void settypePassword(){
        amazonHomePageSigin.typePassword();
    }

    @Test
    public void setclickSigin(){
        amazonHomePageSigin.clickSigin();
    }

    @Test
    public void setOpenPageLogin(){
        amazonHomePageSigin.openpageLogin();
    }

}
