package Pages;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlackCherryMerlot extends CommonAPI {

    public static void BCMSoap(){
        WebDriverWait wait = new WebDriverWait(driver,1,5000);
        WebElement BCMSoap = null;
        BCMSoap = driver.findElement(By.xpath("//*[@id=\"31e36fd861f33caa629e25b124\"]/div[1]/a/div[3]/div[1]"));
        wait.until(ExpectedConditions.visibilityOf(BCMSoap));
        BCMSoap.click();
    }

    public static void LemonSoap(){
        WebDriverWait wait = new WebDriverWait(driver,1,5000);
        WebElement LemonSoap = driver.findElement(By.xpath("//*[@id=\"6b198f8999347baa76d7db734a\"]/div[1]/a/div[3]/div[1]"));
        wait.until(ExpectedConditions.visibilityOf(LemonSoap));
        LemonSoap.click();
    }
}
