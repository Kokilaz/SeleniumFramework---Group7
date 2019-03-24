package Pages;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BodyCareItems extends CommonAPI {

    public static void WaikikiBeachCoconut() {
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        WebElement WaikikiBC = driver.findElement(By.xpath("//*[@id=\"26ee6803b54d53d08711ab72ea\"]/div[1]/a/div[3]/div[1]"));
        wait.until(ExpectedConditions.visibilityOf(WaikikiBC));
        WaikikiBC.click();
    }

    public static void BlackCoconutSands() {

        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        WebElement BlcakCS = driver.findElement(By.xpath("//*[@id=\"64264d41f6f1e96ca557446365\"]/div[1]/a/div[3]/div[1]"));
        wait.until(ExpectedConditions.visibilityOf(BlcakCS));
        BlcakCS.click();
    }

    public static void SandalwoodEucalyptus() {

        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        WebElement SWE = driver.findElement(By.xpath("//*[@id=\"fe08ecc98a761ed03b0499f711\"]/div[1]/a/div[3]/div[1]"));
        wait.until(ExpectedConditions.visibilityOf(SWE));
        SWE.click();
    }

}