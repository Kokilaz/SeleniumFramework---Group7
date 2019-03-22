package TestPages;

import Pages.*;
import org.testng.annotations.Test;

public class TestSelectBodyCare extends SelectBodyCare {

    @Test
    public static void SBCButton(){
        Login.LoginButton();
        Login.SigninBox();
        HomeFragrance.HFTab();
        SingleWickCandle.SWCButton();
        EucalyptusSpearmint.ESCandle();
        AddToBag.Addtobag();
        EucalyptusSpearmint.RVCandle();
        AddToBag.AddOneMore();
        CartPage.viewCartItems();
        BodyCare.BCTab();
        SelectBodyCare.SBCButton();
    }
}