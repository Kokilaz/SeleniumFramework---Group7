package TestPages;

import Pages.HomeFragrance;
import Pages.Login;
import org.testng.annotations.Test;

public class TestHomeFragrance extends HomeFragrance {
    @Test
    public static void HFTab(){
        Login.LoginButton();
        Login.SigninBox();
        HomeFragrance.HFTab();

    }

}