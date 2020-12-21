package desktop;


import org.openqa.selenium.By;

import exception.InvalidInputException;
import pages.ResultPage;
import pages.SearchPage;

public class WebSearchPage extends SearchPage {

    final String submitButtonLocator = "btnK";

    @Override
    public ResultPage searchTextOnGoogleHomePage(String searchText) throws InvalidInputException {
        setTextInElement(By.cssSelector(searchTextBoxLocator), searchText);
        clickOnElement(By.name(submitButtonLocator));
        return ResultPage.getInstance();
    }
}