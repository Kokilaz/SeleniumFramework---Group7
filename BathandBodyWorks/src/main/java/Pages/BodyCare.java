package Pages;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BodyCare extends CommonAPI {
    public static void BCTab(){
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        WebElement BCTab = driver.findElement(By.xpath("//*[@id=\"body-care-dropdown\"]/a"));
        wait.until(ExpectedConditions.visibilityOf(BCTab));
        BCTab.click();
    }
}