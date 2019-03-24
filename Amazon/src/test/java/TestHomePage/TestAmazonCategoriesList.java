package TestHomePage;

import HomePage.AmazonListCategories;
import HomePage.AmazonMain;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAmazonCategoriesList extends AmazonListCategories {

    AmazonListCategories amazonListCategories;
    String Url = "https://www.amazon.com";


    @BeforeMethod
    public void initialize(){
        driver.get(Url);
        amazonListCategories = PageFactory.initElements(driver, AmazonListCategories.class);
    }

    @Test
    public void getCategories(){
        amazonListCategories.setCategories();

    }
}
