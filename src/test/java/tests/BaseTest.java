package tests;

import Factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CalculatorPage;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    protected CalculatorPage calculatorPage;

    @BeforeMethod
    public void setDriver(){
       driver= new WebDriverFactory().getWebDriver();

       /* WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();*/
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
        driver.manage().window().maximize();
        calculatorPage = new CalculatorPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver()
    {

        driver.close();
    }
}
