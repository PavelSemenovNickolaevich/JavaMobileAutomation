package lib.ui.mobile_web;

import lib.ui.SearchPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MVSearchPageObject extends SearchPageObject {

    //В значение переменных ставится локакторы ios
    static {
        SEARCH_INIT_ELEMENT = "css:button#searchIcon";
        SEARCH_INPUT = "css:form>input[type='search']";
        SEARCH_CANCEL_BUTTON = "css:button.cancel";
        SEARCH_RESULT_BY_SUBSTRING_TPL = "xpath://div[contains(@class, 'wikidata-description')][contains(text(), '{SUBSTRING}')]";
        SEARCH_RESULT_ELEMENT = "css:ul.page>li.page-summary";
        SEARCH_EMPTY_RESULT_ELEMENT = "css:p.without-results";


    }

    public MVSearchPageObject(RemoteWebDriver driver) {
        super(driver);
    }
}
