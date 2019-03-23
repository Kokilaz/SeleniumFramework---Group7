package TestHomePage;

import Base.CommonAPI;
import HomePage.MainPage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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

    @Test
    public void TestChooseAService(){
        mainPage.ChooseAService();
    }

    @Test
    public void TestCancer(){
        mainPage.Cancer();
    }

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
}
