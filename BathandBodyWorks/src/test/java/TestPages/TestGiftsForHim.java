package TestPages;

import Pages.*;
import org.testng.annotations.Test;

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
