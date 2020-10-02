package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
    private WebDriver driver;
    private By selectproduct = By.cssSelector(".brandSprite.brandSprite_bosch");


    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public ListerPage clickProduct() {
        driver.findElement(selectproduct).click();
        return new ListerPage(driver);
    }

}


