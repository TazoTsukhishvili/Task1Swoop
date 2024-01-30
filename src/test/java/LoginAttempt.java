import Steps.LoginSteps;
import org.testng.annotations.Test;

public class LoginAttempt extends SwoopConfiguration{

    LoginSteps loginSteps = new LoginSteps();

    @Test (description = "test1 - validate loginPage while using the random creds")
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
