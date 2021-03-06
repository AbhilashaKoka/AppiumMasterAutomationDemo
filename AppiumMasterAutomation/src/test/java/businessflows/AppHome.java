package businessflows;



import exception.InvalidInputException;
import pages.HomePage;

import org.junit.Assert;

public class AppHome {

    public void verifyHomeScreenIsOpen() throws InvalidInputException {
        String currentURL = HomePage.getInstance().getCurrentScreenURL();// AppHomeScreen.getInstance().getCurrentScreenURL();
        String expectedURL = "https://www.selenium.dev/";
        Assert.assertEquals("Expected App Home page is not found", expectedURL, currentURL);
    }
}