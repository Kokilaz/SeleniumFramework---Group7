package HomePage;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindADoctorPage extends CommonAPI {

   @FindBy(xpath = "//*[@id=\"primrow\"]/div/div[1]/ul/li[1]/a")
    WebElement findDoctor;

    //@FindBy(id = "exp1")
    //WebElement SearchDoctorBox;


    public void findDoctor(){
        findDoctor.click();
    }

    //public void SearchDoctorBox(String value){
        //SearchDoctorBox.click();
       // driver.findElement(By.name("Lastname")).sendKeys(value);
    //}

    public void SearchDoctorBox() {
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        WebElement Lastname = driver.findElement(By.xpath("//*[@id=\"exp1\"]"));
        Lastname.sendKeys("Aaronson");
        //WebElement password = driver.findElement(By.cssSelector("#dwfrm_login_password"));
        //password.sendKeys("Hijklmn1");
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/div[2]/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[4]/div[2]/div/div/a")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 1,5000);
        driver.navigate().back();
    }


    //@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[4]/div[2]/div/div/a")
    //WebElement JAaronson;

   // public void JAaronson(){
       // JAaronson.click();
   // }

    public void SearchDoctorBox1() {
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        WebElement Expertise = driver.findElement(By.xpath("//*[@id=\"exp1\"]"));
        Expertise.sendKeys("Oncology");
        //WebElement password = driver.findElement(By.cssSelector("#dwfrm_login_password"));
        //password.sendKeys("Hijklmn1");
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/div[2]/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[4]/div/div/div/a")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 1,5000);
    }

}

