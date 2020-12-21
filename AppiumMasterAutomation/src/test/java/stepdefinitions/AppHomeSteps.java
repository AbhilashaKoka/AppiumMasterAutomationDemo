package stepdefinitions;

import businessflows.AppHome;
import exception.InvalidInputException;
import io.cucumber.java8.En;

public class AppHomeSteps implements En {

    public AppHomeSteps() {

        Then("I verify official website is launched$", () ->        {
            try {
                new AppHome().verifyHomeScreenIsOpen();
            } catch (InvalidInputException e) {
                e.printStackTrace();
            }
        });
    }
}