package Pages;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExfoliatingSoaps extends CommonAPI {
    public static void ExSTab(){
        WebDriverWait wait = new WebDriverWait(driver,1,5000);
        WebElement  ExSTab= null;
        ExSTab = driver.findElement(By.cssSelector("#secondary > div.filter-overflow > div.filter-content > div.active-sub-category > ul:nth-child(4) > li:nth-child(3) > a"));
        wait.until(ExpectedConditions.visibilityOf(ExSTab));
        ExSTab.click();

    }
}
