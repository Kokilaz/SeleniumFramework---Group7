package HomePage;

import Base.CommonAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.DataReader;
import utility.Xls_Reader;


public class ChooseAService extends CommonAPI {
    static String NYPUrl = "https://www.nyp.org/home";

    public static void Dropdown() {
        //Reading Data from Excel sheet
        Xls_Reader reader = new Xls_Reader("/Users/preethikokila/Desktop/SeleniumFrameworkGroup7/NYPresbyterian/src/test/resources/NYPDropdown.xls");
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        driver.get(NYPUrl);
        for (int i = 2; i < 13; i++) {
            String dropdown = reader.getCellData("Sheet1", "DropdownLinks", i);
            System.out.println(dropdown);
            WebElement chooseAservice = null;
            chooseAservice = driver.findElement(By.cssSelector("#service > span"));
            chooseAservice.click();
        }
    }
}


    //@FindBy(css = "body > globalheader > div > div.service-line > div > div > ul > li:nth-child(1) > span.choose-service")
    //WebElement choose_dropdown;

    //private ConnectToSqlDB con = new ConnectToSqlDB();
   // private String filepath = "../NYPresbyterian/src/test/resources/secret.properties";
    //DataReader excl = new DataReader();
    //String excelPath = "../NYPresbyterian/src/test/resources/NYPDropdown.xlsx";


