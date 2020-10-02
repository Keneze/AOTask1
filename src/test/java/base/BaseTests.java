package base;

import org.openqa.selenium.*;
import pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://ao.com/");
        driver.manage().deleteAllCookies();

        homePage = new HomePage(driver);
    }
    @AfterClass
    public void tearDown(){
        //driver.quit();
    }
}



