package Steps;

import Data.LoginData;
import Pages.LoginPage;
import com.codeborne.selenide.Condition;

public class LoginSteps {

    LoginData loginData = new LoginData();
    LoginPage loginPage = new LoginPage();

    public LoginSteps clickLoginButton() {
        loginPage.loginButton.click();
        return this;
    }
    public LoginSteps fillEmailInput() {
        loginPage.emailInput.setValue(loginData.randomEmailText);
        return this;
    }
    public LoginSteps fillPasswordInput() {
        loginPage.passwordInput.setValue(loginData.randomPasswordText);
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
