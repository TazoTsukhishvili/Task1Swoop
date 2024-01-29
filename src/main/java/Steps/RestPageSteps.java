package Steps;

import Data.RestPageData;
import Pages.RestPage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import com.codeborne.selenide.ElementsCollection;

public class RestPageSteps {
    RestPage restPage = new RestPage();
    RestPageData restPageData = new RestPageData();
    public RestPageSteps clickRestButton(){
        restPage.restButton.click();
        return this;
    }
    public RestPageSteps scrollDownLeftBar(){
        restPage.leftBar.scrollIntoView(true);
        return this;
    }
    public RestPageSteps setMinPrice(){
        restPage.minPriceInput.setValue(restPageData.minPrice);
        return this;
    }
    public RestPageSteps setMaxPrice(){
        restPage.maxPriceInput.setValue(restPageData.maxPrice);
        return this;
    }
    public RestPageSteps clickSearchLeftBar(){
        restPage.searchOnLeftBar.click();
        return this;
    }
    public RestPageSteps checkPriceRange() {
        ElementsCollection voucherPrices = restPage.voucherPrices;
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
        return this;
    }
}
