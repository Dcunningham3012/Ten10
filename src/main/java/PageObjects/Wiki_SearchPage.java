package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Wiki_SearchPage {
    private static WebElement element;

    public static WebElement homeSearch(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@name='search']"));
        return element;
    }

    public static WebElement homeLanguage(WebDriver driver){
        element = driver.findElement(By.xpath("//select[@id='searchLanguage']"));
        return element;
    }

    public static WebElement homeSubmitBtn(WebDriver driver){
        element = driver.findElement(By.xpath("//button[@type='submit']"));
        return element;
    }


}
