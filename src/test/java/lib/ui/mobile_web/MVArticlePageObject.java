package lib.ui.mobile_web;

import lib.ui.ArticlePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MVArticlePageObject extends ArticlePageObject {
    public MVArticlePageObject(RemoteWebDriver driver) {
        super(driver);
    }

    static {
        TITLE = "css:#content h1";
        FOOTER_ELEMENT = "css:footer";
//        OPTIONS_ADD_TO_MY_LIST_BUTTON = "css:#page-actions li#page-actions-watch.page-actions-menu__list-item";
        OPTIONS_ADD_TO_MY_LIST_BUTTON = "css:#page-actions-watch a#ca-watch.mw-ui-icon-wikimedia-star-base20";
        OPTIONS_REMOVE_FROM_MY_LIST_BUTTON = "css:#page-actions-watch a#ca-watch.mw-ui-icon-wikimedia-unStar-progressive";

    }
}
