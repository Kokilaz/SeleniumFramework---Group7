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

    @FindBy(css = "#service > strong")
    WebElement ChooseAService;

    @FindBy(xpath = "/html/body/globalheader/div/div[2]/div/div/ul/li[2]/a/span[2]")
    WebElement Cancer;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[1]/ul/li[1]/a")
    WebElement FindADoctor;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[1]/ul/li[2]/a")
    WebElement OurServces;

    @FindBy(xpath ="//*[@id=\"primrow\"]/div/div[1]/ul/li[3]/a" )
    WebElement PaymyBill;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[1]/ul/li[4]/a")
    WebElement Locations;

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[1]/ul/li[5]/a")
    WebElement Visitors;






// Methods
    public void CheckLogo(){
        Logo.click();
    }

   // public void EnterInSearchBox(String search) {
       // SearchBox.sendKeys(search, Keys.ENTER);

    //}
       // public void SearchButton() {
          //  SearchButton.click();
       // }

        public void ChooseAService() {
           // WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
            //wait.until(ExpectedConditions.visibilityOf(ChooseAService));
            ChooseAService.click();
        }

        public void Cancer() {
            Cancer.click();
        }

        public void FindADoctor(){
        FindADoctor.click();
        }

        public void OurServices(){
        OurServces.click();
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
    }
