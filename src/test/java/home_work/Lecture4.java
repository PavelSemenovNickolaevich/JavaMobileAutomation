package home_work;

import lib.CoreTestCase;
import lib.Platform;
import lib.ui.*;
import lib.ui.factories.ArticlePageObjectFactory;
import lib.ui.factories.MyListsPageObjectFactory;
import lib.ui.factories.NavigationUIFactory;
import lib.ui.factories.SearchPageObjectFactory;
import org.junit.Test;

public class Lecture4 extends CoreTestCase {
    private final String name_of_folder = "Learning programming";

    private static final String
            login = "SemenovPavelNickolaevich",
            password = "Rjcvjltcfyn1987-";


    @Test
    public void testSaveTwoArticles() throws InterruptedException {

        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
        if (!Platform.getInstance().isMW()) {
            SearchPageObject.skipFirstPage();
        }
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Java");
        SearchPageObject.clickByArticleWithSubstring("bject-oriented programming language");

        ArticlePageObject ArticlePageObject = ArticlePageObjectFactory.get(driver);
        ArticlePageObject.waitForTitleElement();
        String article_title = ArticlePageObject.getArticleTitle();
        if (Platform.getInstance().isAndroid()) {
            ArticlePageObject.addArticleToMyList(name_of_folder);
        } else {
            ArticlePageObject.addArticlesTiMySaved();
        }
        Thread.sleep(2000);
        if (Platform.getInstance().isMW()) {
            AuthorizationPageObject Auth = new AuthorizationPageObject(driver);
            Auth.clickAuthButton();
            Auth.enterLoginData(login, password);
            Auth.submitForm();

            ArticlePageObject.waitForTitleElement();

            assertEquals("We are not on the same page after login",
                    article_title,
                    ArticlePageObject.getArticleTitle()
            );
            ArticlePageObject.addArticlesTiMySaved();
            SearchPageObject.initSearchInput();
            SearchPageObject.typeSearchLine("Java");
            SearchPageObject.clickByArticleWithSubstring("High-level programming language");
            ArticlePageObject.addArticlesTiMySaved();
        }
//        ArticlePageObject.addArticleToMyList(name_of_folder);
//        ArticlePageObject.closeArticleOneClick();
//        SearchPageObject.clickByArticleWithSubstring("High-level programming language");
//        ArticlePageObject.addSecondArticleToMyList();
        ArticlePageObject.closeArticle();

        NavigationUi NavigationUi = NavigationUIFactory.get(driver);
        NavigationUi.openNavigation();
        NavigationUi.ClickMyLists();
        Thread.sleep(5000);

//        NavigationUi NavigationUi = NavigationUIFactory.get(driver);
//        NavigationUi.clickBackButton();
//        NavigationUi.ClickMyLists();
//
        MyListPageObject MyListPageObject = MyListsPageObjectFactory.get(driver);
        //  MyListPageObject.openFolderByName(name_of_folder);
        MyListPageObject.swipeByArticleToDelete(article_title);
        Thread.sleep(1000);
        ArticlePageObject.assertArticleExists();


    }

    @Test
    public void testAssertTitle() {

        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
        SearchPageObject.skipFirstPage();
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Java");
        SearchPageObject.clickByArticleWithSubstring("Object-oriented programming language");
        ArticlePageObject ArticlePageObject = ArticlePageObjectFactory.get(driver);
        ArticlePageObject.assertTitlePresentWithoutTimeOut();


    }

}
