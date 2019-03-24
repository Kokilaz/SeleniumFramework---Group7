package HomePage;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AmazonHomePageSigin extends CommonAPI {

    @FindBy(css = "#nav-link-accountList > span.nav-line-1")
    WebElement login;

    @FindBy(css = "#ap_email")
    WebElement email;

    @FindBy (id = "ap_password")
    WebElement password;

    @FindBy (id = "signInSubmit" )
    WebElement siginSubmit;

    public void openlogin(){
        login.click();
    }

    public void giveEmail(){
        email.sendKeys("lovely_jenny87@yahoo.com");
    }

    public void typePassword(){
        password.sendKeys("asdfghjkl1234567");
    }

    public void clickSigin(){
        siginSubmit.click();
    }

    public void openpageLogin(){
        openlogin();
        giveEmail();
        typePassword();
        clickSigin();

    }

}

