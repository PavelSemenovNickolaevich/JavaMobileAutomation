package lib.ui.mobile_web;

import lib.ui.NavigationUi;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MVNavigationUI extends NavigationUi {

    public MVNavigationUI(RemoteWebDriver driver) {
        super(driver);
    }


    static {
        MY_LISTS_LINK = "css:a[data-event-name='menu.unStar']";
        BUTTON_BACK = "xpath://android.widget.FrameLayout[@content-desc='My lists']";
        OPEN_NAVIGATION = "css:#mw-mf-main-menu-button";
    }
}
