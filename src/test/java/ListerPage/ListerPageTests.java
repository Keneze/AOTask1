package ListerPage;
import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ListerPageTests extends BaseTests {

    @Test
    public void testPageTitleIsDisplayed(){
       var searchResultPage= homePage.SearchProduct();
       var listerPage= searchResultPage.clickProduct();
       listerPage.selectProductColour();
       assertEquals(listerPage.confirmTitlePage(), "Silver Bosch Washing Machines",
               "Title Page Incorrect");

    }

}
