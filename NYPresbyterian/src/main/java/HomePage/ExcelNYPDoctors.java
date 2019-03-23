package HomePage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import utility.DataReader;

public class ExcelNYPDoctors extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[1]/ul/li[1]/a")
    WebElement findDoctor;


    public void findDoctor() {
        findDoctor.click();
    }
}




