package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RestPage {
    public SelenideElement
            headerSwoop = $(byClassName("HeaderMenu")),
            restButton = headerSwoop.$(byAttribute("href", "/category/24/dasveneba")),
            leftBar = $("#sidebar"),
            minPriceInput = leftBar.$("#minprice"),
            maxPriceInput = leftBar.$("#maxprice"),
            searchOnLeftBar = leftBar.$(byText("ძებნა"));
}
