package stepdefinitions;

import businessflows.Search;
import exception.InvalidInputException;
import io.cucumber.java8.En;


public class SearchSteps implements En {

    public SearchSteps() {
       Given("^I search for \"([^\"]*)\"$", (String text) -> {
           try {
               new Search().searchText(text);
           } catch (InvalidInputException e) {
               e.printStackTrace();
           }
       });

    }
}
