import Steps.LoginSteps;
import org.testng.annotations.Test;

public class LoginAttempt extends SwoopConfiguration{

  //  LoginSteps loginSteps = new LoginSteps();

    @Test (description = "login with a random creds")
    public void loginTest() {
        loginSteps
                .clickLoginButton()
                .fillEmailInput()
                .fillPasswordInput()
                .clickLoginInnerButton()
                .checkLoginErrorMsg()
                .checkResetPasswordUsability();
    }
}
