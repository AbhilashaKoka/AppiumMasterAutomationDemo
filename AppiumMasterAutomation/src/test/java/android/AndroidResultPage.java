package android;

import exception.InvalidInputException;
import pages.HomePage;
import pages.ResultPage;

import org.openqa.selenium.By;

public class AndroidResultPage extends ResultPage {
    private final String resultLinkLocator = "//div[@role='heading']/div[text()='Selenium']";

    @Override
    public HomePage clickOnResultByLinkText(String linkToBeClicked) throws InvalidInputException {
        clickOnElement(By.xpath(resultLinkLocator));
        return HomePage.getInstance();
    }
}