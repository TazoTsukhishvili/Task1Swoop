import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class SwoopTests {
    @BeforeMethod
    public void openChrome(){
        Configuration.timeout = 10000;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        open("https://www.swoop.ge/");
    }
    @Test (description = "test1 - validate loginPage while using the random creds",
            testName = "Login Page Validation",
            groups = {"Epic: Authentication", "Feature: Login", "Story: Random Credentials"})
    public void LoginAttemptTest() {
        LoginAttempt loginAttempt = new LoginAttempt();
        loginAttempt.loginTest();
    }

    @Test(description = "tes2 - validate phoneNumber while creating a new account",
            dependsOnMethods = "LoginAttemptTest",
            testName = "Phone Number Validation",
            groups = {"Epic: User Registration", "Feature: Account Creation", "Story: Phone Number Validation"})
    public void CreateAccountTest() {
        CreateAccount createAccount = new CreateAccount();
        createAccount.createAccountTest();
    }

    @Test(description = "test3 - set price range",
            dependsOnMethods = "CreateAccountTest",
            testName = "Price Range Setting",
            groups = {"Epic: User Preferences", "Feature: Search", "Story: Price Range"})
    public void RestPageTest() {
        RestPageTest restPageTest = new RestPageTest();
        restPageTest.setPrice();
    }

    @Test(description = "test4 - validate the 1st iteam's info from food",
            testName = "Food Item Info Validation",
            groups = {"Epic: Ordering", "Feature: Category", "Story: voucher Info"})
    public void FoodPageTest() {
        FoodPageTest foodPageTest = new FoodPageTest();
        foodPageTest.foodInfo();
    }
    @AfterMethod
    public void closeChrome(){
        closeWebDriver();
    }
}