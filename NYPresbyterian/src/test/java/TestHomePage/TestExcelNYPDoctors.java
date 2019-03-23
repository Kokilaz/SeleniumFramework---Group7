package TestHomePage;

import HomePage.ExcelNYPDoctors;
import HomePage.FindADoctorPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.DataReader;

public class TestExcelNYPDoctors extends ExcelNYPDoctors {

    FindADoctorPage findadoctorpage;
    DataReader excelData = new DataReader();
    public String path = "/Users/preethikokila/Desktop/SeleniumFrameworkGroup7/NYPresbyterian/src/test/resources/NYP Doctors.xlsx";

    @BeforeClass
    public void initialize() {
        findadoctorpage = PageFactory.initElements(driver, FindADoctorPage.class);
    }



    @Test
    public void NYPDoctors() {
        String[] NYPDoctors = excelData.getExcelData(path, 0);
        for (String str : NYPDoctors) {
            System.out.println(str);
        }
    }
}
