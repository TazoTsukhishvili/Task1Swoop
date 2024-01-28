package Steps;

import Data.LoginData;
import Data.RandomGenerator;
import Pages.LoginPage;
import com.codeborne.selenide.Condition;

import java.util.Random;

public class LoginSteps {
    RandomGenerator randomGenerator = new RandomGenerator();
    LoginData loginData = new LoginData();
    LoginPage loginPage = new LoginPage();

    public LoginSteps clickLoginButton() {
        loginPage.loginButton.click();
        return this;
    }
    public LoginSteps fillEmailInput() {
        loginPage.emailInput.setValue(randomGenerator.randomEmail);
        return this;
    }
    public LoginSteps fillPasswordInput() {
        loginPage.passwordInput.setValue(randomGenerator.randomPassword);
        return this;
    }
    public LoginSteps clickLoginInnerButton() {
        loginPage.loginInnerButton.click();
        return this;
    }
    public LoginSteps checkLoginErrorMsg() {
        loginPage.loginErrorMsgElement.shouldHave(Condition.text(loginData.loginErrorMsgText));
        return this;
    }
    public LoginSteps checkResetPasswordUsability() {
        loginPage.resetPasswordElement.isEnabled();
        return this;
    }

}
