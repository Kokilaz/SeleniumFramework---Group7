package TestHomePage;

import HomePage.MainPage;
import HomePage.OurServicesPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestOurServicesPage extends OurServicesPage {

    OurServicesPage ourservicespage;
    String homePageUrl = "https://www.nyp.org/clinical-services";

    @BeforeClass
    public void initialize() {
        driver.navigate().to(homePageUrl);
        ourservicespage = PageFactory.initElements(driver, OurServicesPage.class);
    }

    @Test
    public void TestOurServices() {
        ourservicespage.ourservices();
    }

    @Test
    public void Allergy(){
        ourservicespage.Allergy();
        driver.navigate().back();
    }

    @Test
    public void Alzheimers(){
        ourservicespage.Alzheimers();
        driver.navigate().back();
    }

    @Test
    public void BrainTumors(){
        ourservicespage.BrainTumors();
        driver.navigate().back();
    }

    /*@Test
    public void AmbulatoryCare(){
        ourservicespage.AmbulatoryCare();
        driver.navigate().back();
    }

    @Test
    public void BurnCenter(){
        ourservicespage.BurnCenter();
        driver.navigate().back();
    }

    @Test
    public void NYPOnDemand(){
        ourservicespage.NYPOnDemand();
    }*/

    @Test
    public void OpthalmolgicalSurgery(){
        ourservicespage.OpthalmolgicalSurgery();
        driver.navigate().back();
    }

    @Test
    public void CancerSrvices(){
        ourservicespage.CancerServices();
        driver.navigate().back();
    }

    @Test
    public void PainMedicine(){
        ourservicespage.PainMedicine();
    }

}
