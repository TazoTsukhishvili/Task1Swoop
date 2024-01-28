package Steps;

import Data.RandomGenerator;
import Data.RegistrationData;
import Pages.RegistrationPage;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationSteps {
    RandomGenerator randomGenerator = new RandomGenerator();
    RegistrationData registrationData = new RegistrationData();
    RegistrationPage registrationPage = new RegistrationPage();

    public RegistrationSteps clickLoginButton() {
        registrationPage.loginButton.click();
        return this;
    }
    public RegistrationSteps clickCreateButton() {
        registrationPage.createButton.click();
        return this;
    }
    public RegistrationSteps checkRegistrationTitle() {
        registrationPage.registrationTitle.isDisplayed();
        return this;
    }
    public RegistrationSteps fillEmailInput() {
        registrationPage.emailInput.sendKeys(randomGenerator.randomEmail);
        return this;
    }
    public RegistrationSteps fillPasswordInput() {
        registrationPage.passwordInput.sendKeys(randomGenerator.randomPassword);
        return this;
    }
    public RegistrationSteps fillRepeatPasswordInput() {
        registrationPage.repeatPasswordInput.sendKeys(randomGenerator.randomPassword);
        return this;
    }
    public RegistrationSteps selectGender() {
        registrationPage.maleRadio.click();
        registrationPage.femaleRadio.click();
        return this;
    }
    public RegistrationSteps fillNameInput() {
        registrationPage.nameInput.sendKeys(randomGenerator.randomName);
        return this;
    }
    public RegistrationSteps fillSurnameInput() {
        registrationPage.surnameInput.sendKeys(randomGenerator.randomSurname);
        return this;
    }
    public RegistrationSteps setBirthYear() {
        registrationPage.birthYearDropdown.selectOption(27);
        return this;
    }
    public RegistrationSteps scrollDown() {
        executeJavaScript("window.scrollBy(0, 300);");
        return this;
    }
    public RegistrationSteps confirmConditions() {
        registrationPage.conditions.get(0).click();
        registrationPage.conditions.get(1).click();
        return this;
    }
    public RegistrationSteps clickRegistrationButton() {
        registrationPage.registrationButton.click();
        return this;
    }
    public RegistrationSteps checkPhoneErrorMsgText() {
        registrationPage.phoneErrorMsg.shouldHave(Condition.text(registrationData.phoneErrorMsgText));
        registrationPage.phoneErrorMsg.isDisplayed();
        return this;
    }
    public RegistrationSteps checkSmsCodeErrorMsgText() {
        registrationPage.smsCodeErrorMsg.shouldHave(Condition.text(registrationData.smsCodeErrorMsgText));
        registrationPage.smsCodeErrorMsg.isDisplayed();
        return this;
    }
}
