package Pages;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login extends CommonAPI {
    public static void LoginButton() {
        WebElement loginButton = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        HomePage.testUserCanNavigateToHomePage();
        driver.findElement(By.cssSelector("#wrapper > header > div.top-banner.stickyOn > div.wrap > div.icon-items > ul > li > a > svg")).click();
         driver.findElement((By.cssSelector("#wrapper > header > div.top-banner.stickyOn > div.wrap > div.icon-items > ul > li > div > div > a:nth-child(1)")));
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }


    public static void SigninBox() {
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        WebElement username = driver.findElement(By.cssSelector("#dwfrm_login_username"));
        username.sendKeys("preethikokila1@gmail.com");
        WebElement password = driver.findElement(By.cssSelector("#dwfrm_login_password"));
        password.sendKeys("Hijklmn1");
        driver.findElement(By.cssSelector("#dwfrm_login > fieldset > div.form-row.form-row-button > button")).click();
    }
}

