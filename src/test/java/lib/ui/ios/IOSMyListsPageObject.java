package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.MyListPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IOSMyListsPageObject extends MyListPageObject {

    public IOSMyListsPageObject(RemoteWebDriver driver) {
        super(driver);
    }
// для ios отличный локатор от андроида
    static {
      //  FOLDER_BY_NAME_TPL = "//*[@text='{FOLDER_NAME}']";
        ARTICLE_BY_TITLE_TPL = "//*[@text='{TITLE}']";
    }
}
