package Pages;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends CommonAPI {
    public static void viewCartItems() {
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        WebElement cartItem1 = null;
        driver.findElement(By.cssSelector("#mini-cart > div.mini-cart-total > a > span.minicart-quantity")).click();
        String cartName1 = null;
        System.out.println("Items in Preethi's cart are:");
        cartItem1 = driver.findElement(By.cssSelector("#cart-table > tbody > tr:nth-child(1) > td.item-details > div > div.name > a"));
        cartName1 = cartItem1.getText();
        System.out.println(cartName1);
        WebElement cartItem2 = null;
        String cartName2 = null;
        cartItem2 = driver.findElement(By.cssSelector("#cart-table > tbody > tr:nth-child(2) > td.item-details > div > div.name > a"));
        cartName2 = cartItem2.getText();
        System.out.println(cartName2);
        WebElement cartItem3 = null;
        String cartName3 = null;
        cartItem3 = driver.findElement(By.cssSelector("#cart-table > tbody > tr:nth-child(3) > td.item-details > div > div.name > a"));
        cartName3 = cartItem3.getText();
        System.out.println(cartName3);
        WebElement cartItem4 = null;
        String cartName4 = null;
        cartItem4 = driver.findElement(By.cssSelector("#cart-table > tbody > tr:nth-child(4) > td.item-details > div > div.name > a"));
        cartName4 = cartItem4.getText();
        System.out.println(cartName4);
        WebElement cartItem5 = null;
        String cartName5 = null;
        cartItem5 = driver.findElement(By.cssSelector("#cart-table > tbody > tr:nth-child(5) > td.item-details > div > div.name > a"));
        cartName5 = cartItem5.getText();
        System.out.println(cartName5);


    }
}