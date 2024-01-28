import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.testng.Assert;
import org.testng.annotations.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class test extends SwoopConfiguration{


    @Test
    public void loginWithInvalidCredentials() {
        $(Selectors.byText("შესვლა")).click();
        $("#Email").sendKeys("gfgfdgfd@gmail.com");
        $(Selectors.byId("feed-password")).sendKeys("fgdsgsdfhf");
        $(Selectors.byId("AuthBtn")).click();
        $(Selectors.byId("authInfo")).shouldHave(text("მეილი ან პაროლი არასწორია, თუ დაგავიწყდათ პაროლი,გთხოვთ ისარგებლოთ პაროლის აღდგენის ფუნქციით!"));
        Assert.assertTrue($(Selectors.byId("feed-password")).is(empty));
    }

}
