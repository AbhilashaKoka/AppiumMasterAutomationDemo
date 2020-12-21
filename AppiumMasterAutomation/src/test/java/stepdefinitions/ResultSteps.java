package stepdefinitions;
import businessflows.Result;
import exception.InvalidInputException;
import io.cucumber.java8.En;


public class ResultSteps implements En {

    final String searchLinkToBeclicked = "SeleniumHQ Browser Automation";

   public ResultSteps() {

        When("I click on official Selenium HQ website$", () -> {
            try {
                new Result().clickOnResultsLinkByText(searchLinkToBeclicked);
            } catch (InvalidInputException e) {
                e.printStackTrace();
            }
        });
    }
}