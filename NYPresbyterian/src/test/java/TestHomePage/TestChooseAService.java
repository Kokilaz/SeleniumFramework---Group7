package TestHomePage;

import HomePage.ChooseAService;
import org.testng.annotations.Test;

public class TestChooseAService extends ChooseAService {

    @Test
    public void dropdown(){
        ChooseAService.Dropdown();
    }
}
