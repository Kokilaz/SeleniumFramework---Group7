package TestPages;

import Pages.*;
import org.testng.annotations.Test;

public class TestBodyCare extends BodyCare {
    @Test
    public static void BCTab(){
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
    }
}
