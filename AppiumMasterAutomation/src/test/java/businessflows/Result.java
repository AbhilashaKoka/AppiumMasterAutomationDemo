package businessflows;


import exception.InvalidInputException;
import pages.ResultPage;

public class Result {

     public void clickOnResultsLinkByText(String resultTextToBeClicked) throws InvalidInputException {
            //ResultScreen.getInstance().clickOnResultByLinkText(resultTextToBeClicked);
         ResultPage.getInstance().clickOnResultByLinkText(resultTextToBeClicked);
     }
}