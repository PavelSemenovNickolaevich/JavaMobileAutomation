package lib.ui.mobile_web;

import lib.ui.MyListPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MVMyListsPageObject extends MyListPageObject {

    public MVMyListsPageObject(RemoteWebDriver driver) {
        super(driver);
    }

    static {

        ARTICLE_BY_TITLE_TPL = "xpath://ul[contains(@class,'mw-mf-watchlist-page-list')]//h3[contains(text(),'{TITLE}')]";
        REMOVE_FROM_SAVED_BUTTON = "xpath://ul[contains(@class,'mw-mf-watchlist-page-list')]//h3[contains(text(),'{TITLE}')]/../../a[contains(@class,'watched')]";
        DATA_ID = "xpath://li[contains(@data-id,'9845')]";
    }
}
