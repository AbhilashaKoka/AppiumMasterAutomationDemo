package android;

import exception.InvalidInputException;
import pages.ResultPage;

import org.openqa.selenium.By;

public class AndroidSearchPage extends pages.SearchPage {
    private final String optionLocator = "//span[contains(text(), 'seleniumhq')]";
    @Override
    public ResultPage searchTextOnGoogleHomePage(String searchText) throws InvalidInputException {
        setTextInElement(By.cssSelector(searchTextBoxLocator), searchText);
        clickOnElement(By.xpath(optionLocator));
        return ResultPage.getInstance();
    }
}