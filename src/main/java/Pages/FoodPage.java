package Pages;

import Data.FoodPageData;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FoodPage {
    FoodPageData foodPageData = new FoodPageData();
    public ElementsCollection
            locationsList = $$(".ms-drop ul li"),
            offeredItems = $$(".container.deal-container.category-offers .special-offer");
    public SelenideElement
            headerSwoop = $(byClassName("HeaderMenu")),
            foodButton = headerSwoop.$(byAttribute("href", "/category/15/restornebi-da-barebi")),
            leftBar = $("#sidebar"),
            locations = leftBar.$(".ms-choice"),
            prefferedLocation = locationsList.filterBy(text("ვაკე")).first(),
            deleteButton = leftBar.$(".delete-search-button"),
            allLocationsInput = locations.$(Selectors.byText(foodPageData.allLocationsExpectedInput)),
            firstOfferedItem = offeredItems.first(),
            voucherActions = $(".checkoutSection"),
            addItemButton = voucherActions.$(".amount-box-button.amount-box-add"),
            addInBasketButton = voucherActions.$(".addBasket img"),
            basket = $(byAttribute("href","/basket")),
            itemInfo = $(".basket-item-info"),
            restaurantName = itemInfo.$(byAttribute("href","/merchant/774558")),
            itemPrice = $("#basket_item_price"),
            itemCount = $("#basket_item_count");

}
