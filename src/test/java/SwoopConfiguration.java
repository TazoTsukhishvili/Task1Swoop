import Steps.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.*;
public class SwoopConfiguration {
    LoginSteps loginSteps = new LoginSteps();
    RegistrationSteps registrationSteps = new RegistrationSteps();
    RestPageSteps restPageSteps = new RestPageSteps();
    FoodPageSteps foodPageSteps = new FoodPageSteps();

    @BeforeMethod
    public void openChrome(){
        Configuration.timeout = 10000;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        open("https://www.swoop.ge/");
    }
    @AfterMethod
    public void closeChrome(){
        closeWebDriver();
    }
}
