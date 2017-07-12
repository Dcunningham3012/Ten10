import PageObjects.Wiki_ResultsPage;
import PageObjects.Wiki_SearchPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

public class WebFrontEndTest {
    private FirefoxDriver driver;
    private String searchValue = "Test Automation";
    private Languages mainLanguage = Languages.English;
    private Languages additionalLanguage = Languages.French;

    @Test
    public void example4() {
        driver.get("https://www.wikipedia.org/");
        Wiki_SearchPage.homeSearch(driver).sendKeys(searchValue);
        Select oSelect = new Select(Wiki_SearchPage.homeLanguage(driver));
        oSelect.selectByValue(mainLanguage.getShortCode());
        Wiki_SearchPage.homeSubmitBtn(driver).click();
        assertTrue(Wiki_ResultsPage.header(driver).getText().trim().equalsIgnoreCase(searchValue));
        assertTrue(Wiki_ResultsPage.shortCodeLanguage(driver,additionalLanguage.getShortCode()).isDisplayed());
        Wiki_ResultsPage.fullLanguage(driver, additionalLanguage.getLanguage()).click();
        assertTrue(Wiki_ResultsPage.shortCodeLanguage(driver,mainLanguage.getShortCode()).isDisplayed());
    }

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "C:\\libraries\\Gecxko\\geckodriver.exe");
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
