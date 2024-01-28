package Steps;

import Data.RestPageData;
import Pages.RestPage;

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
}
