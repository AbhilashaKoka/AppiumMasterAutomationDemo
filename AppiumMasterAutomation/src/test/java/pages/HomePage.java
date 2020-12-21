package pages;



import exception.InvalidInputException;
import helper.KEYS;
import helper.ProjectConstants;
import utilities.ThisRun;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import android.AndroidHomePage;
import desktop.WebHomePage;

public abstract class HomePage extends BasePage {
    public static HomePage getInstance() throws InvalidInputException {
        ThisRun thisRun = ThisRun.getInstance();
        Logger logger = LogManager.getLogger(SearchPage.class.getName());
        String platform = thisRun.getAsString(KEYS.PLATFORM.name());
        String subPlatform = thisRun.getAsString(KEYS.SUB_PLATFORM.name());
        String screenNameSuffix = HomePage.class.getName();
        switch (platform) {
            case ProjectConstants.PLATFORM_DESKTOP:
                return new WebHomePage();
            case ProjectConstants.PLATFORM_MOBILITY:
                if (subPlatform.equals(ProjectConstants.PLATFORM_ANDROID)) {
                    return new AndroidHomePage();
                }
            default:
                throw new InvalidInputException("Invalid platform type - '" + platform + "' provided to instantiate instance of " + screenNameSuffix);
        }
    }

    public String getCurrentScreenURL() {
        return getCurrentURL();
    }
}