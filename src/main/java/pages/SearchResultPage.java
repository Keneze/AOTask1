package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
    private WebDriver driver;
    private By selectproduct = By.xpath("//*[@id=\"brands\"]/li[1]/a");


    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public ListerPage clickProduct() {
        driver.findElement(selectproduct).click();
        return new ListerPage(driver);
    }

}

//*[@id="brands"]/li[1]/a
