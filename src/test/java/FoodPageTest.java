import org.testng.annotations.Test;

public class FoodPageTest extends SwoopConfiguration{
    @Test(description = "validate the 1st iteam's info from food")
    public void foodInfo() {
        foodPageSteps
                .clickFoodButton()
                .chooseLocation()
                .validateLocationDeletion()
                .clickFirstItem()
                .addItemTwiceInBasket()
                .goToBasket()
                .validateItemInfo();
    }
}
