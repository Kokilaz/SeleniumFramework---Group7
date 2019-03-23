package HomePage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.XpiDriverService;
import org.openqa.selenium.support.FindBy;

public class OurServicesPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[1]/ul/li[2]/a")
    WebElement ourservices;

    @FindBy(xpath = "/html/body/div[2]/div/div[5]/div[1]/div/div/div[1]/ul/li[1]/a")
    WebElement Allergy;

    @FindBy(xpath = "/html/body/div[2]/div/div[5]/div[1]/div/div/div[1]/ul/li[2]/a")
    WebElement Alzheimers;

    @FindBy(xpath = "/html/body/div[2]/div/div[5]/div[1]/div/div/div[1]/ul/li[9]/a")
    WebElement BrainTumors;

    //@FindBy(linkText = "Ambulatory Care Network")
   // WebElement AmbulatoryCare;

    //@FindBy(xpath = "//*[@id=\"service-accordion\"]/ul[2]/li[1]/a")
    //WebElement BurnCenter;

    //@FindBy(xpath = "//*[@id=\"service-accordion\"]/ul[3]/li[17]/a")
    //WebElement NYPOnDemand;

    @FindBy(xpath = "/html/body/div[2]/div/div[5]/div[1]/div/div/div[2]/ul/li[10]/a")
    WebElement OpthalmolgicalSurgery;

    @FindBy(xpath = "/html/body/div[2]/div/div[5]/div[1]/div/div/div[1]/ul/li[12]/a")
    WebElement CancerServices;

    @FindBy(xpath = "/html/body/div[2]/div/div[5]/div[1]/div/div/div[2]/ul/li[12]/a")
    WebElement PainMedicine;

//methods

    public  void ourservices(){
        ourservices.click();
    }

    public void Allergy(){
        Allergy.click();

    }

    public void Alzheimers(){
        Alzheimers.click();
    }

    public void BrainTumors(){
        BrainTumors.click();
    }

    /*public void AmbulatoryCare(){
        AmbulatoryCare.click();
    }

    public void BurnCenter(){
        BurnCenter.click();
    }

    public void NYPOnDemand(){
        NYPOnDemand.click();
    }*/

    public void OpthalmolgicalSurgery(){
        OpthalmolgicalSurgery.click();
    }

    public void CancerServices(){
        CancerServices.click();
    }

    public void PainMedicine(){
        PainMedicine.click();
    }




}