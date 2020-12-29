package lib.ui;

import lib.Platform;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class NavigationUi extends MainPageObject {


    protected static String
            MY_LISTS_LINK,
            BUTTON_BACK,
            OPEN_NAVIGATION;

    public NavigationUi(RemoteWebDriver driver) {
        super(driver);
    }

    public void ClickMyLists() {
        if (Platform.getInstance().isMW()) {
            this.tryClickElementWithFewAttempts(
                    MY_LISTS_LINK,
                    "Cannot find icon",
                    5
            );
        } else {
            this.waitForElementAndClick(
                    MY_LISTS_LINK,
                    "Cannot find icon",
                    5
            );
        }
    }

    public void clickBackButton() {
        waitForElementAndClick(
                BUTTON_BACK,
                "Cannot close article, cannot find arrow link",
                5
        );
    }

    public void openNavigation() {
        if (Platform.getInstance().isMW()) {
            this.waitForElementAndClick(OPEN_NAVIGATION, "Cannot find and click open navigation button", 5);
        } else {
            System.out.println("Method openNavigation() do nothing for platform " + Platform.getInstance().getPlatformVar());
        }
    }
}
