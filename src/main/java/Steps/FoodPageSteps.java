package Steps;

import Data.FoodPageData;
import Pages.FoodPage;
import com.codeborne.selenide.Condition;

public class FoodPageSteps {
    FoodPage foodPage = new FoodPage();
    FoodPageData foodPageData = new FoodPageData();
    public FoodPageSteps clickFoodButton() {
        foodPage.foodButton.click();
        return this;
    }
    public FoodPageSteps chooseLocation() {
        foodPage.leftBar.scrollIntoView(true);
        foodPage.locations.click();
        foodPage.prefferedLocation.click();
        return this;
    }
    public FoodPageSteps validateLocationDeletion() {
        foodPage.deleteButton.click();
        foodPage.allLocationsInput.isDisplayed();
        return this;
    }
    public FoodPageSteps clickFirstItem() {
        foodPage.firstOfferedItem.click();
        return this;
    }
    public FoodPageSteps addItemTwiceInBasket() {
        foodPage.addItemButton.click();
        foodPage.addInBasketButton.click();
        return this;
    }
    public FoodPageSteps goToBasket() {
        foodPage.basket.click();
        return this;
    }
    public FoodPageSteps validateItemInfo() {
        foodPage.restaurantName.shouldHave(Condition.text(foodPageData.expectedRestaurantName));
        foodPage.itemCount.shouldHave(Condition.text(foodPageData.expectedVoucherCount));
        foodPage.itemPrice.shouldHave(Condition.text(foodPageData.expectedPrice));
        return this;
    }
}
