package base;


import org.testng.annotations.Test;
import pages.ListerPage;
import pages.SearchResultPage;


public class ListerPageTests extends BaseTests {

    public void testPageTitleisDisplayed(){
    SearchResultPage searchResultPage= homePage.SearchProduct();
    searchResultPage.clickProduct();

    }


}
