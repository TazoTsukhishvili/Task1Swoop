package Pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
            loginButton = $(Selectors.byText("შესვლა")),
            emailInput = $("#Email"),
            passwordInput = $("#Password"),
            loginInnerButton = $(Selectors.byText("შესვლა")),
            loginErrorMsgElement = $("#input-error-Password"),
            resetPasswordElement = $(Selectors.byText("პაროლის აღდგენა"));
}
