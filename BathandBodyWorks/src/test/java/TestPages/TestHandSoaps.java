package TestPages;

import Pages.*;
import org.testng.annotations.Test;

public class TestHandSoaps extends HandSoaps {

    @Test
    public static void HSTab(){
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
        ClearCart.Clearcart();
        ClearCart.ClearOneMore();
        CartPage.viewCartItems();

        HandSoaps.HSTab();



    }
}
