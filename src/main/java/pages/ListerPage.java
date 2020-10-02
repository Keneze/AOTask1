package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListerPage {
    private WebDriver driver;
    private By productColour = By.cssSelector(".facet-type__colour-swatch.fv_silver");
    private By pageTitle = By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/header/h1");


    public ListerPage(WebDriver driver) {
        this.driver = driver;
    }
    public void selectProductColour(){
        driver.findElement(productColour).click();
    }
    public String confirmTitlePage(){
        return driver.findElement(pageTitle).getText();
    }

}


