package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By searchField = By.id("siteSearch-input");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public SearchResultPage SearchProduct(){
        driver.findElement(searchField).sendKeys("Washing Machines",(Keys.ENTER));
        return new SearchResultPage(driver);

    }
    public ListerPage clickProduct(){
        clickLink("View Freestanding");
        return new ListerPage(driver);
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}