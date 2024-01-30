import Steps.RestPageSteps;
import org.testng.annotations.Test;

public class RestPageTest extends SwoopConfiguration{

    RestPageSteps restPageSteps = new RestPageSteps();
    @Test(description = "test3 - set price range")
    public void setPrice(){
        restPageSteps
                .clickRestButton()
                .scrollDownLeftBar()
                .setMinPrice()
                .setMaxPrice()
                .clickSearchLeftBar()
                .checkPriceRange();
    }
}
