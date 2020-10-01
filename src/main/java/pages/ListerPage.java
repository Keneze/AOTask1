package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListerPage {
    private WebDriver driver;
    private By productColour = By.id("Colour-facet_fv_silver-Silver");
    private By pageTitle = By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/header/h1");


    public ListerPage(WebDriver driver) {
        this.driver = driver;
    }
    public void selectProductColour(){
        driver.findElement(productColour).click();
    }
    public String confirmtitlepage(){
        return driver.findElement(pageTitle).getText();
    }

}


