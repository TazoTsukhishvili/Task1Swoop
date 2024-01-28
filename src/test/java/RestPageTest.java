import Steps.RestPageSteps;
import org.testng.annotations.Test;

public class RestPageTest extends SwoopConfiguration{
    @Test(description = "set price range")
    public void setPrice(){
        restPageSteps
                .clickRestButton()
                .scrollDownLeftBar()
                .setMinPrice()
                .setMaxPrice()
                .clickSearchLeftBar();
    }
}
