package TestHomePage;

import HomePage.FindADoctorPage;
import HomePage.OurServicesPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.DataReader;

public class TestFindADoctorPage extends FindADoctorPage {

    FindADoctorPage findadoctorpage;
    String homePageUrl = "https://doctors.nyp.org/";
  DataReader excelData = new DataReader();
  String path = "/Users/preethikokila/Desktop/SeleniumFrameworkGroup7/NYPresbyterian/src/test/resources/NYP Doctors.xlsx";

    @BeforeClass
    public void initialize() {
        driver.navigate().to(homePageUrl);
       findadoctorpage = PageFactory.initElements(driver, FindADoctorPage.class);
    }

    @Test
    public void TestFindADoctor(){
        findadoctorpage.findDoctor();
    }

    @Test
    public void SearchDoctorBox(){
        findadoctorpage.SearchDoctorBox();
        driver.navigate().back();
    }

    //@Test
   // public void JAaronson(){
       // findadoctorpage.JAaronson();
   // }

    @Test
    public void SearchDoctorBox1(){
        findadoctorpage.SearchDoctorBox1();
    }

    @Test
    public void NYPDoctors(){
        String[] NYPDoctors = excelData.getExcelData(path,0);
        for (String str: NYPDoctors){
            System.out.println(str);
        }
    }
}
