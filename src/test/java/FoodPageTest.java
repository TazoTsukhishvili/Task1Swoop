import Steps.FoodPageSteps;
import org.testng.annotations.Test;

public class FoodPageTest extends SwoopConfiguration{

    FoodPageSteps foodPageSteps = new FoodPageSteps();
    @Test(description = "test4 - validate the 1st iteam's info from food")
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
