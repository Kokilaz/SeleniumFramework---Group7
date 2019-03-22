package Pages;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandSoaps extends CommonAPI {
    public static void HSTab() {
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        WebElement HSTab = driver.findElement(By.cssSelector("#hand-soaps-dropdown > a"));
        wait.until(ExpectedConditions.visibilityOf(HSTab));
        HSTab.click();
    }
}