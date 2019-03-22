package Pages;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GiftsForHim extends CommonAPI {
    public static void GFHTab(){
        WebDriverWait wait = new WebDriverWait(driver,1,5000);
        WebElement GFHTab = driver.findElement(By.cssSelector("#secondary > div.filter-overflow > div.filter-content > div.active-sub-category > ul:nth-child(4) > li:nth-child(2) > a"));
        wait.until(ExpectedConditions.visibilityOf(GFHTab));
        GFHTab.click();

    }
}
