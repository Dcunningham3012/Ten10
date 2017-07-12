package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Wiki_ResultsPage {
    private static WebElement element;

    public static WebElement header(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id='firstHeading']"));
        return element;
    }

    public static WebElement fullLanguage(WebDriver driver, String language){
        element = driver.findElement(By.xpath("//*[starts-with(@class,'interlanguage-link interwiki-')]//*[contains(@title,'" + language + "')]"));
        return element;
    }

    public static WebElement shortCodeLanguage(WebDriver driver, String shortCode){
        element = driver.findElement(By.xpath("//*[starts-with(@class,'interlanguage-link interwiki-')]//*[contains(@lang,'" + shortCode + "')]"));
        return element;
    }
}
