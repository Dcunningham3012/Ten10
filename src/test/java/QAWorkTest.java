import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class QAWorkTest extends Functions{
    @Test //Test to complete positive flow through through contact screen
    public void Test1() throws Exception {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("http://www.qaworks.com/contact.aspx"); //Open new browser
            driver.manage().window().maximize();

            //Variables
            String strName = "Joe Bloggs";
            String strEmail = "j.Bloggs@qaworks.com";
            String strText = "please contact me I want to find out more";

            //Code to populate the fields, using reusable functions
            System.out.print(FunctionsSendKey(driver, "name", "ctl00$MainContent$NameBox", strName));
            System.out.print(FunctionsSendKey(driver, "name", "ctl00$MainContent$EmailBox", strEmail));
            System.out.print(FunctionsSendKey(driver, "name", "ctl00$MainContent$MessageBox", strText));
            System.out.print(FunctionsClick(driver, "name", "ctl00$MainContent$SendButton"));
            System.out.print(FunctionsCheck(driver, "id", "ctl00_MainContent_rfvName", ""));
            System.out.print(FunctionsCheck(driver, "id", "ctl00_MainContent_rfvEmailAddress", ""));
            System.out.print(FunctionsCheck(driver, "id", "ctl00_MainContent_rfvMessage", ""));
            driver.close();
        } catch (Exception e) { //Error handling to capture any errors
            System.out.print(e);
            FunctionsScreenGrab(driver, "Test_1"); //Capture screenshot of the error
            driver.close();
    }
}

    @Test
    public void Test2() throws Exception {//Test to check wanring for a blank mesage box
            WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("http://www.qaworks.com/contact.aspx");
            driver.manage().window().maximize();
            String strName = "Joe Bloggs";
            String strEmail = "j.Bloggs@qaworks.com";
            String strText = "please contact me I want to find out more";


            System.out.print(FunctionsSendKey(driver, "name", "ctl00$MainContent$NameBox", strName));
            System.out.print(FunctionsSendKey(driver, "name", "ctl00$MainContent$EmailBox", strEmail));
            System.out.print(FunctionsSendKey(driver, "name", "ctl00$MainContent$MessageBox", ""));
            System.out.print(FunctionsClick(driver, "name", "ctl00$MainContent$SendButton"));
            System.out.print(FunctionsCheck(driver, "id", "ctl00_MainContent_rfvMessage", "Please Type your message"));
            System.out.print(FunctionsSendKey(driver, "name", "ctl00$MainContent$MessageBox", strText));
            System.out.print(FunctionsClick(driver, "name", "ctl00$MainContent$SendButton"));
            System.out.print(FunctionsCheck(driver, "id", "ctl00_MainContent_rfvName", ""));
            System.out.print(FunctionsCheck(driver, "id", "ctl00_MainContent_rfvEmailAddress", ""));
            System.out.print(FunctionsCheck(driver, "id", "ctl00_MainContent_rfvMessage", ""));
            driver.close();
        }catch (Exception e) {
            System.out.print(e);
            FunctionsScreenGrab(driver, "Test_2");
            driver.close();
        }
    }
    @Test
    public void Test3() {// Test to check name is required
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("http://www.qaworks.com/contact.aspx");
            driver.manage().window().maximize();
            String strName = "Joe Bloggs";
            String strEmail = "j.Bloggs@qaworks.com";
            String strText = "please contact me I want to find out more";

            System.out.print(FunctionsSendKey(driver, "name", "ctl00$MainContent$NameBox", ""));
            System.out.print(FunctionsSendKey(driver, "name", "ctl00$MainContent$EmailBox", strEmail));
            System.out.print(FunctionsSendKey(driver, "name", "ctl00$MainContent$MessageBox", strText));
            System.out.print(FunctionsClick(driver, "name", "ctl00$MainContent$SendButton"));
            System.out.print(FunctionsCheck(driver, "id", "ctl00_MainContent_rfvName", "Your name is required"));
            System.out.print(FunctionsSendKey(driver, "name", "ctl00$MainContent$NameBox", strName));
            System.out.print(FunctionsClick(driver, "name", "ctl00$MainContent$SendButton"));
            System.out.print(FunctionsCheck(driver, "id", "ctl00_MainContent_rfvName", ""));
            System.out.print(FunctionsCheck(driver, "id", "ctl00_MainContent_rfvEmailAddress", ""));
            System.out.print(FunctionsCheck(driver, "id", "ctl00_MainContent_rfvMessage", ""));
            driver.close();
        } catch (Exception e) {
            System.out.print(e);
            FunctionsScreenGrab(driver, "Test_3");
            driver.close();
        }
    }
    @Test
    public void Test4() { // Test to check invalid characters in email box, can be expanded upon - Issue with your screen server error
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("http://www.qaworks.com/contact.aspx");
            driver.manage().window().maximize();
            String strName = "Joe Bloggs";
            String strEmail = "j.Bloggs@qaworks.com";
            String strText = "please contact me I want to find out more";


            System.out.print(FunctionsSendKey(driver, "name", "ctl00$MainContent$NameBox", strName));
            System.out.print(FunctionsSendKey(driver, "name", "ctl00$MainContent$EmailBox", "@@"));
            System.out.print(FunctionsSendKey(driver, "name", "ctl00$MainContent$MessageBox", strText));
            System.out.print(FunctionsCheck(driver, "id", "ctl00_MainContent_revEmailAddress", "Invalid Email Address"));
            System.out.print(FunctionsClick(driver, "name", "ctl00$MainContent$SendButton"));
            System.out.print(FunctionsSendKey(driver, "name", "ctl00$MainContent$EmailBox", strEmail));
            System.out.print(FunctionsCheck(driver, "id", "ctl00_MainContent_revEmailAddress", ""));
            System.out.print(FunctionsClick(driver, "name", "ctl00$MainContent$SendButton"));
            System.out.print(FunctionsCheck(driver, "id", "ctl00_MainContent_rfvName", ""));
            System.out.print(FunctionsCheck(driver, "id", "ctl00_MainContent_rfvEmailAddress", ""));
            System.out.print(FunctionsCheck(driver, "id", "ctl00_MainContent_rfvMessage", ""));
            driver.close();
        } catch (Exception e) {
            System.out.print(e);
            FunctionsScreenGrab(driver, "Test_4");
            driver.close();
        }
    }

    @Test
    public void Test5() { //Test to confirm email is required
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.get("http://www.qaworks.com/contact.aspx");
            driver.manage().window().maximize();
            String strName = "Joe Bloggs";
            String strEmail = "j.Bloggs@qaworks.com";
            String strText = "please contact me I want to find out more";


            System.out.print(FunctionsSendKey(driver, "name", "ctl00$MainContent$NameBox", strName));
            System.out.print(FunctionsSendKey(driver, "name", "ctl00$MainContent$MessageBox", strText));
            System.out.print(FunctionsSendKey(driver, "name", "ctl00$MainContent$EmailBox", ""));
            System.out.print(FunctionsClick(driver, "name", "ctl00$MainContent$SendButton"));
            System.out.print(FunctionsCheck(driver, "id", "ctl00_MainContent_rfvEmailAddress", "An Email address is required"));
            System.out.print(FunctionsSendKey(driver, "name", "ctl00$MainContent$EmailBox", strEmail));
            System.out.print(FunctionsSendKey(driver, "name", "ctl00$MainContent$MessageBox", ""));
            System.out.print(FunctionsClick(driver, "name", "ctl00$MainContent$SendButton"));
            System.out.print(FunctionsCheck(driver, "id", "ctl00_MainContent_rfvName", ""));
            System.out.print(FunctionsCheck(driver, "id", "ctl00_MainContent_rfvEmailAddress", ""));
            System.out.print(FunctionsCheck(driver, "id", "ctl00_MainContent_rfvMessage", ""));
            driver.close();
        } catch (Exception e) {
            System.out.print(e);
            FunctionsScreenGrab(driver, "Test_5");
            driver.close();
        }
    }


}
