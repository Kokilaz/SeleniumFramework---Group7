package TestHomePage;

import HomePage.OurServicesPage;
import HomePage.PatientNVisitorsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPatientNVisitorPage extends PatientNVisitorsPage {

  PatientNVisitorsPage patientnvisitorspage;
    String homePageUrl = "https://www.nyp.org/patients-and-visitors";

    @BeforeClass
    public void initialize() {
        driver.navigate().to(homePageUrl);
        patientnvisitorspage = PageFactory.initElements(driver, PatientNVisitorsPage.class);
    }

    @Test
    public void Visitors(){
        patientnvisitorspage.Visitors();
    }

    @Test
    public void MedicalRecords(){
        patientnvisitorspage.MedicalRecords();
    }

    @Test
    public void VisitingHours(){
        patientnvisitorspage.VisitingHours();
    }

    @Test
    public void Accommodations(){
        patientnvisitorspage.Accommodations();
        driver.navigate().back();
    }

    @Test
    public void GiftShop(){
        patientnvisitorspage.GiftShop();
    }


    }
