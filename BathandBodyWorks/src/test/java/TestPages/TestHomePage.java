package TestPages;

import Pages.HomePage;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {



    @Test

    public static void testUserCanNavigateToHomePage() {
        HomePage.testUserCanNavigateToHomePage();
    }

}
