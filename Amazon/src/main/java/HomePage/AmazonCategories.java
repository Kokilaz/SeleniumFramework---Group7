package HomePage;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonCategories extends CommonAPI {


    @FindBy(xpath = "//option[@value='search-alias=fashion-baby']")
    WebElement BabyFashion;

    public void setBabyFashion(){
        BabyFashion.click();
        BabyFashion=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        BabyFashion.sendKeys("Baby fashion", Keys.ENTER);
    }

    @FindBy(xpath = "//option[@value='search-alias=collectibles']")
    WebElement fineart;

    public void setfineart(){
        fineart.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Collectibles", Keys.ENTER);
    }

    @FindBy(xpath = "//option[@value='search-alias=computers']")
    WebElement Computers;

    public void setComputers() {
        Computers.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Computers", Keys.ENTER);
    }

    @FindBy(xpath = "//option[@value='search-alias=digital-music']" )
    WebElement DigitalMusic;

    public void setDigitalMusic(){
        DigitalMusic.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Digital music", Keys.ENTER);
    }

    @FindBy(xpath = "//option[@value='search-alias=lawngarden']")
    WebElement Garden;

    public void setGarden(){
        Garden.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Garden & Outdoor", Keys.ENTER);
    }

    @FindBy(xpath = "//option[@value='search-alias=electronics']" )
    WebElement Electronics;

    public void setElectronics(){
        Electronics.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Electronics", Keys.ENTER);
    }

    @FindBy(xpath = "//option[@value='search-alias=gift-cards']" )
    WebElement GiftCard;

    public void setGiftCard(){
        GiftCard.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Gift cards", Keys.ENTER);
    }

    @FindBy(xpath = "//option[@value='search-alias=financial']")
    WebElement Credit;

    public void setCredit(){
        Credit.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Credit and Payment Cards", Keys.ENTER);
    }

    @FindBy(xpath = "//option[@value='search-alias=courses']")
    WebElement Courses;

    public void setCourses(){
        Courses.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Courses", Keys.ENTER);
    }

    @FindBy(xpath = "//option[@value='search-alias=grocery']")
    WebElement Grocery;

    public void setGrocery(){
        Grocery.click();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Grocery & Gourmet Food", Keys.ENTER);
    }

    @FindBy(xpath = "//option[@value='search-alias=hpc']")
    WebElement Health;

    public void setHealth(){
        Health.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Health, Household & Baby Care", Keys.ENTER);
    }

    @FindBy(xpath = "//option[@value='search-alias=digital-text']" )
    WebElement Kindle;

    public void setKindle(){
        Kindle.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Kindle Store", Keys.ENTER);
    }

    @FindBy(xpath = "//option[@value='search-alias=movies-tv']" )
    WebElement Movies;

    public void setMovies(){
        Movies.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Movies & TV", Keys.ENTER);
    }

    @FindBy(xpath = "//option[@value='search-alias=fashion']")
    WebElement ClothingShoes;

    public void setClothingShoes(){
        ClothingShoes.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Clothing, Shoes & Jewelry", Keys.ENTER);
    }

    @FindBy(xpath = "//option[@value='search-alias=warehouse-deals']" )
    WebElement WarehouseDeals;

    public void setWarehouseDeals(){
        WarehouseDeals.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Warehouse deals", Keys.ENTER);
    }

    @FindBy(css = "#searchDropdownBox" )
    WebElement itemsofWomen;

    public void setitemsofWomen(){
        itemsofWomen.click();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Womens", Keys.ENTER);
    }

    @FindBy(xpath = "//option[@value='search-alias=fashion-girls']" )
    WebElement itemsofGirls;

    public void setitemsofGirls(){
        itemsofGirls.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Girls", Keys.ENTER);
    }



    @FindBy(xpath = "//option[@value='search-alias=fashion-mens']")
    WebElement itemsofMen;

    public void setitemsofMen(){
        itemsofMen.click();
    }

    @FindBy(css ="#searchDropdownBox")
    WebElement itemsofBoys;

    public void setitemsofBoys(){
        itemsofBoys.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Boys", Keys.ENTER);
    }


}
