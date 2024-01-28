package Pages;

import Data.RegistrationData;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RegistrationPage {
    RegistrationData registrationData = new RegistrationData();
    public SelenideElement
            loginButton = $(Selectors.byText("შესვლა")),
            createButton = $(Selectors.byText("შექმენი")),
            registrationTitle = $(Selectors.byText(registrationData.registrationExpectedTitle)),
            emailInput = $("#email"),
            passwordInput = $("#password"),
            repeatPasswordInput = $("#PasswordRetype"),
            maleRadio = $(Selectors.byText("მამრობითი")),
            femaleRadio = $(Selectors.byText("მდედრობითი")),
            nameInput = $("#name"),
            surnameInput = $("#surname"),
            birthYearDropdown = $("select[name='birth_year']"),
            registrationButton = $("#registrationBtn"),
            phoneErrorMsg = $("#input-error-phone"),
            smsCodeErrorMsg = $("#input-error-sms_code");
    public ElementsCollection conditions = $$(".checkmark");
}

