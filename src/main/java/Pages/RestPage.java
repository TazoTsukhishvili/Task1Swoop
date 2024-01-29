package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RestPage {
    public SelenideElement
            headerSwoop = $(byClassName("HeaderMenu")),
            restButton = headerSwoop.$(byAttribute("href", "/category/24/dasveneba")),
            leftBar = $("#sidebar"),
            minPriceInput = leftBar.$("#minprice"),
            maxPriceInput = leftBar.$("#maxprice"),
            searchOnLeftBar = leftBar.$(byText("ძებნა"));
    public ElementsCollection voucherPrices = $$(Selectors.byXpath("//section[@class='container deal-container category-offers ']//div[@class='discounted-prices']//p"));

}
