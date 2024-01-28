import Steps.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.*;
public class SwoopConfiguration {
    LoginSteps loginSteps = new LoginSteps();
//    Steps.registrationSteps registrationSteps = new registrationSteps();
//    Steps.restPageSteps restPageSteps = new restPageSteps();

    @BeforeTest
    public void openChrome(){
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }
    @BeforeMethod
    public void openSwoop(){
        open("https://www.swoop.ge/");
    }
    @AfterTest
    public void closeChrome(){
        WebDriverRunner.getWebDriver().quit();
    }
}
