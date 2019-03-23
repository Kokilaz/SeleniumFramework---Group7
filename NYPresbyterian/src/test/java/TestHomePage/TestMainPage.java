package TestHomePage;

import Base.CommonAPI;
import HomePage.MainPage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class TestMainPage extends MainPage {

    MainPage mainPage;
    String homePageUrl = "https://www.nyp.org/home";

    @BeforeClass
    public void initialize() {
        driver.navigate().to(homePageUrl);
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }

    @Test
    public void TestLogo(){
        mainPage.CheckLogo();
    }

   // @Test
   // public void TestSearchBox(){
        //mainPage.EnterInSearchBox("Locations");
      //  String UrlExpected = "https://www.nyp.org/global-search-page?p=1429289026549&packedargs=homeId=1429289026549&pname=NYP+Home&ptype=Page&siteConfigId=1429288956941&q=locations&search_filter=&search_filter_only_child=false&isPredictive=No";
        //Assert.assertEquals(driver.getCurrentUrl(),UrlExpected);
    //}

    //@Test
    //public void TestSearchButton(){
       // mainPage.SearchButton();
   // }

   // @Test
    //public void TestChooseAService(){
       // mainPage.ChooseAService();
   // }

   // @Test
    //public void TestCancer(){
       // mainPage.Cancer();
    //}

    @Test
    public void TestFindADoctor(){
        mainPage.FindADoctor();
    }

    @Test
    public void TestOurServices(){
        mainPage.OurServices();
    }

    @Test
    public void PayMyBill(){
        mainPage.PayMyBill();
    }

    @Test
    public void Locations(){
        mainPage.Locations();
    }

    @Test
    public void Visitors(){
        mainPage.Visitors();
    }

    @Test
    public void AboutUs(){
        mainPage.AboutUs();
    }

    @Test
    public void ClinicalTrials(){
        mainPage.ClinicalTrials();
    }

    @Test
    public void HealthLibrary(){
        mainPage.HealthLibrary();
    }

    @Test
    public void GiveToNYP(){
        mainPage.GiveToNYP();
    }

    @Test
    public void ContactUs(){
        mainPage.ContactUs();
    }

    @Test
    public void FacebookIcon(){
        mainPage.FacebookIcon();
        driver.navigate().back();
    }

    @Test
    public void TwitterIcon(){
        mainPage.TwitterIcon();
        driver.navigate().back();
    }

    @Test
    public void InstagramIcon(){
        mainPage.InstagramIcon();
        driver.navigate().back();
    }

    @Test
    public void UrgentCare(){
        mainPage.UrgentCare();
    }

    @Test
    public void HealthMattersVideoButton(){
        mainPage.HealthMattersVideoButton();
    }

    //@Test
   // public void AmazingThingsTile(){
       // mainPage.AmazingThingsTile();
   // }

   //  @Test
    //public void ChooseAService(){
       // mainPage.ChooseAService();
     //}

    // @Test
    //public void Cancer(){
      //  mainPage.Cancer();
     //}

    @Test
    public void NewsRoom(){
        mainPage.NewsRoom();
    }

    @Test
    public void GlobalServices(){
        mainPage.GlobalServices();
    }

    @Test
    public void ForProfessionals(){
        mainPage.ForProfessionals();
    }

    @Test
    public void Employees(){
        mainPage.Employees();
    }

    @Test
    public void ForVendors(){
        mainPage.ForVendors();
    }

    @Test
    public void Careers(){
        mainPage.Careers();
    }

    @Test
    public void MedicalServices(){
        mainPage.MedicalServices();
    }
}
