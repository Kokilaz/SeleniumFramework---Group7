package Pages;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gifts extends CommonAPI {
    public static void GiftsButton() {
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        WebElement GiftsButton = driver.findElement(By.cssSelector("#gifts-dropdown > a"));
        wait.until(ExpectedConditions.visibilityOf(GiftsButton));
        GiftsButton.click();
    }
}
