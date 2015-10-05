import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.thoughtworks.selenium.SeleneseTestBase.fail;

public class Functions {
    public String FunctionsSendKey(WebDriver driver, String elementType, String element, String strValue) {
        if (elementType.equals("name")) {
            driver.findElement(By.name(element)).sendKeys(strValue);
            return "Pass";
        } else if (elementType.equals("id")){
            driver.findElement(By.id(element)).sendKeys(strValue);
            return "Pass";
        }else{
            return "Fail - No elementtype associated";
        }

    }

    public String FunctionsClick(WebDriver driver,String elementType, String element ){
        if (elementType.equals("name")) {
            driver.findElement(By.name(element)).click();
            return "Pass";
        } else if (elementType.equals("id")){
            driver.findElement(By.id(element)).click();
            return "Pass";
        }else{
            return "Fail - No elementtype associated";
        }
    }

    public String FunctionsCheck (WebDriver driver,String elementType, String element, String strExpectedValue){
        String strValue;
        if (elementType == "name") {
            strValue = driver.findElement(By.name(element)).getText();
        } else if (elementType.equals("id")){
            strValue = driver.findElement(By.id(element)).getText();
        }else{
            return "Fail - No elementtype associated";
        }

        if (strValue.equals(strExpectedValue)){
            return "Pass";
        } else return ("Fail - Actual message = " + strValue);

    }

    public void  FunctionsScreenGrab(WebDriver driver, String testID){

        String date = new SimpleDateFormat("HH_mm_ss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot)driver;
        byte[] image = ts.getScreenshotAs(OutputType.BYTES);

        try {
            File screenshot = new File("C:/temp/" + testID + "_myscreenshot" + date + ".png");
            FileOutputStream fos = new FileOutputStream(screenshot);
            fos.write(image);
            fos.close();
        } catch (IOException ex) {
            fail("Failed to write screenshot");
        }

    }
}
