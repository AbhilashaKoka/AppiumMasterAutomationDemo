package desktop;


import org.openqa.selenium.By;

import exception.InvalidInputException;
import pages.HomePage;
import pages.ResultPage;

public class WebResultPage extends ResultPage {
    private String finalLocatorOfResult = "//h3[text() = '%s']";

    @Override
    public HomePage clickOnResultByLinkText(String linkToBeClicked) throws InvalidInputException {
        clickOnElement(By.xpath(String.format(finalLocatorOfResult, linkToBeClicked)));
        return HomePage.getInstance();
    }
}