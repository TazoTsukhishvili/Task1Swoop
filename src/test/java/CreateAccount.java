import Steps.RegistrationSteps;
import org.testng.annotations.Test;

public class CreateAccount extends SwoopConfiguration{

    RegistrationSteps registrationSteps = new RegistrationSteps();
    @Test (description = "tes2 - validate phoneNumber while creating a new account")
    public void createAccountTest() {
        registrationSteps
                .clickLoginButton()
                .clickCreateButton()
                .checkRegistrationTitle()
                .fillEmailInput()
                .fillPasswordInput()
                .fillRepeatPasswordInput()
                .selectGender()
                .fillNameInput()
                .fillSurnameInput()
                .setBirthYear()
                .scrollDown()
                .confirmConditions()
                .clickRegistrationButton()
                .checkPhoneErrorMsgText()
                .checkSmsCodeErrorMsgText();
    }
}
