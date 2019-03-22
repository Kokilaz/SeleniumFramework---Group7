package Pages;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectBodyCare extends CommonAPI {
    public static void SBCButton(){
        WebDriverWait wait = new WebDriverWait(driver,1,5000);
        WebElement SBCButton = driver.findElement(By.cssSelector("#secondary > div.filter-overflow > div.filter-content > div.active-sub-category > ul:nth-child(2) > li:nth-child(1) > a"));
        wait.until(ExpectedConditions.visibilityOf(SBCButton));
        SBCButton.click();

    }
}