package businessflows;


import exception.InvalidInputException;
import pages.SearchPage;

public class Search {

    public void searchText(String searchText) throws InvalidInputException {
        //SearchScreen.getInstance().searchTextOnGoogleHomePage(searchText);
        SearchPage.getInstance().searchTextOnGoogleHomePage(searchText);
    }

}