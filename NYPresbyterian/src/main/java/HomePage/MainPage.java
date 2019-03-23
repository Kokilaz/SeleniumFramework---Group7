package HomePage;

import Base.CommonAPI;
import com.sun.tools.javac.comp.Enter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPage extends CommonAPI {

   /*static String homepageUrl = "https://www.nyp.org/home";

    public static void testUserCanNavigateToHomePage() {
        String homepageTitle = "NYP.org - NewYork-Presbyterian";
        driver.navigate().to(homepageUrl);
        driver.findElement(By.cssSelector("head > title")).click();
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(), homepageTitle);*/


    @FindBy(id = "logoImgId")
     WebElement Logo;

   // @FindBy(xpath = "//*[@id=\"txtSearch\"]")
   // WebElement SearchBox;

    //@FindBy(id = "Search")
    //WebElement SearchButton;

   // @FindBy(css = "#service > strong")
    //WebElement ChooseAService;

    //@FindBy(xpath = "/html/body/globalheader/div/div[2]/div/div/ul/li[2]/a/span[2]")
    //WebElement Cancer;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[1]/ul/li[1]/a")
    WebElement FindADoctor;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[1]/ul/li[2]/a")
    WebElement OurServices;

    @FindBy(xpath ="//*[@id=\"primrow\"]/div/div[1]/ul/li[3]/a" )
    WebElement PaymyBill;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[1]/ul/li[4]/a")
    WebElement Locations;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[1]/ul/li[5]/a")
    WebElement Visitors;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[2]/ul/li[1]/a")
    WebElement AboutUs;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[2]/ul/li[2]/a")
    WebElement ClinicalTrials;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[2]/ul/li[3]/a")
    WebElement HealthLibrary;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[2]/ul/li[4]/a")
    WebElement GiveToNYP;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[2]/ul/li[5]/a")
    WebElement ContactUs;

    @FindBy(xpath = "/html/body/globalheader/div/div[1]/div/div[2]/ul/li[1]/a/img")
    WebElement FacebookIcon;

    @FindBy(xpath = "/html/body/globalheader/div/div[1]/div/div[2]/ul/li[2]/a/img")
    WebElement TwitterIcon;

    @FindBy(xpath = "/html/body/globalheader/div/div[1]/div/div[2]/ul/li[3]/a/img")
    WebElement InstagramIcon;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[1]/a/img")
    WebElement UrgentCareButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/a/div/div/p[2]")
    WebElement HealthMattersVideoButton;

   // @FindBy(linkText = "AmazingThingsAreHappeningHere")
    //WebElement AmazingThingsTile;
   // @FindBy(id = "service")
    //WebElement ChooseAService;

    //@FindBy(xpath = "/html/body/globalheader/div/div[2]/div/div/ul/li[2]/a")
    //WebElement Cancer;

    @FindBy(xpath = "/html/body/footer/div/div[2]/div/ul/li[2]/a")
    WebElement NewsRoom;

    @FindBy(xpath = "/html/body/footer/div/div[2]/div/ul/li[4]/a")
    WebElement GlobalServices;

    @FindBy(xpath = "/html/body/footer/div/div[2]/div/ul/li[5]/a")
    WebElement ForProfessionals;

    @FindBy(xpath = "/html/body/footer/div/div[2]/div/ul/li[6]/a")
    WebElement Employees;

    @FindBy(xpath = "/html/body/footer/div/div[2]/div/ul/li[7]/a")
    WebElement ForVendors;

    @FindBy(xpath = "/html/body/footer/div/div[2]/div/ul/li[8]/a")
    WebElement Careers;

    @FindBy(xpath = "/html/body/div[2]/div/div[5]/div[1]/div/h3")
    WebElement MedicalServices;

    @FindBy(xpath = "/html/body/footer/div/div[2]/div/ul/li[9]/a")
    WebElement Events;



// NYP Methods
    public void CheckLogo(){
        Logo.click();
    }

   // public void EnterInSearchBox(String search) {
       // SearchBox.sendKeys(search, Keys.ENTER);

    //}
       // public void SearchButton() {
          //  SearchButton.click();
       // }

       // public void ChooseAService() {
           // WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
            //wait.until(ExpectedConditions.visibilityOf(ChooseAService));
           // ChooseAService.click();
        //}

        //public void Cancer() {
            //Cancer.click();
        //}

        public void FindADoctor(){
        FindADoctor.click();
        }

        public void OurServices(){
        OurServices.click();
        }
        public void PayMyBill(){
        PaymyBill.click();
        }

        public void Locations(){
        Locations.click();
        }

        public void Visitors(){
        Visitors.click();
        }

        public void AboutUs(){
        AboutUs.click();
        }

        public void ClinicalTrials(){
        ClinicalTrials.click();
        }

        public void HealthLibrary(){
        HealthLibrary.click();
        }

        public void GiveToNYP(){
        GiveToNYP.click();
        }

        public void ContactUs(){
        ContactUs.click();
        }

        public void FacebookIcon(){
        FacebookIcon.click();
        }

        public void TwitterIcon(){
        TwitterIcon.click();
        }

        public void InstagramIcon(){
        InstagramIcon.click();
        }

        public void UrgentCare(){
        UrgentCareButton.click();
        }

        public void HealthMattersVideoButton(){
        HealthMattersVideoButton.click();
        }

        //public void AmazingThingsTile(){
       // AmazingThingsTile.click();
       // }
        /*public void ChooseAService(){
        WebDriverWait wait = new WebDriverWait(driver, 1, 20);
        wait.until(ExpectedConditions.visibilityOf(ChooseAService));
        ChooseAService.click();
        }

        public void Cancer(){
        Cancer.click();
        }*/

        public void NewsRoom(){
            NewsRoom.click();
        }

        public void GlobalServices(){
            GlobalServices.click();
        }

        public void ForProfessionals(){
            ForProfessionals.click();
        }

        public void Employees(){
            Employees.click();
        }

        public void ForVendors(){
            ForVendors.click();
        }

        public void Careers(){
            Careers.click();
        }

        public void MedicalServices(){
            MedicalServices.click();
        }

        public void Events(){ Events.click();}


    }
