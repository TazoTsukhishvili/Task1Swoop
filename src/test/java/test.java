import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.*;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.google.common.collect.Range.greaterThan;
import io.qameta.allure.*;



public class test extends SwoopConfiguration{


@Test
    public void restTest() {
    restPageSteps
            .clickRestButton()
            .scrollDownLeftBar()
            .setMinPrice()
            .setMaxPrice()
            .clickSearchLeftBar();

    // interesting part starts from here

    ElementsCollection voucherPrices = $$(Selectors.byXpath("//section[@class='container deal-container category-offers ']//div[@class='discounted-prices']//p"));
    for (int i = 0; i < voucherPrices.size(); i += 2) {
        SelenideElement voucherPrice = voucherPrices.get(i);
        String stringPrice = voucherPrice.getText();
        String intPart = stringPrice.replaceAll("[^0-9]","");
        int intPrice = Integer.parseInt(intPart);

        voucherPrice.shouldHave(text(String.valueOf(intPrice)));
        if (intPrice < 170 || intPrice > 180) {
            throw new AssertionError("Out of range (170, 180): " + intPrice);
        }

    }

}

}
