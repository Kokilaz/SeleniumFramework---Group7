package HomePage;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonListCategories extends CommonAPI {


    @FindBy(css = "#searchDropdownBox")
    WebElement Categories;

    public void setCategories() {
        List<WebElement> categories = driver.findElements(By.cssSelector("#searchDropdownBox"));
        for (WebElement search : categories) {
            System.out.println(search.getText());
        }
    }
}
