package ListerPage;
import base.BaseTests;
import org.testng.annotations.Test;
import pages.ListerPage;
import pages.SearchResultPage;

import static org.testng.Assert.assertEquals;

public class ListerPageTests extends BaseTests {

    @Test
    public void testPageTitleIsDisplayed(){
       SearchResultPage searchResultPage= homePage.SearchProduct();
       ListerPage listerPage= searchResultPage.clickProduct();
       listerPage.selectProductColour();
       assertEquals(listerPage.confirmtitlepage(), "Silver Bosch Washing Machines",
               "Title Page Incorrect");

    }

}
