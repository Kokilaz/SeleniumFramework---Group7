package TestPages;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestGiftsForHim extends GiftsForHim {

    @Test
    public static void GFHTab(){
        Login.LoginButton();
        Login.SigninBox();
        HomeFragrance.HFTab();
        SingleWickCandle.SWCButton();
        EucalyptusSpearmint.ESCandle();
        AddToBag.Addtobag();
        EucalyptusSpearmint.RVCandle();
        AddToBag.AddOneMore();
        BodyCare.BCTab();
        SelectBodyCare.SBCButton();
        BodyCareItems.WaikikiBeachCoconut();
        AddToBag.Addtobag();
        BodyCareItems.BlackCoconutSands();
        AddToBag.AddOneMore();
        BodyCareItems.SandalwoodEucalyptus();
        AddToBag.AddMore();
        CartPage.viewCartItems();
        HandSoaps.HSTab();
        ExfoliatingSoaps.ExSTab();
        BlackCherryMerlot.BCMSoap();
        AddToBag.Addtobag();
        BlackCherryMerlot.LemonSoap();
        AddToBag.AddOneMore();
        Gifts.GiftsButton();
        GiftsForHim.GFHTab();
    }
}
