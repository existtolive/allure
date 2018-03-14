package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BasePageSteps;

import java.util.List;

public class AllFiltersPage extends BasePage {

    public AllFiltersPage() {
        PageFactory.initElements(BasePageSteps.getDriver(), this);
    }

    @FindBy(xpath = ".//div[contains(text(),'Бренды')]//following-sibling::div//*[contains(@class,'eFilterList_OptionLink')]")
    private List<WebElement> brandsList;

    @FindBy(xpath = ".//div[contains(@id, 'facetControl_brand')]//div[contains(@class, 'eFilterList_ListFooter')]")
    private List<WebElement> brandsShowAllList;

    @FindBy(xpath = ".//input[contains(@class,'eFilterList_SearchInput')]")
    private List<WebElement> brandsInput;

    @FindBy(xpath = ".//div[@id='price_filter']//input[@class='eFromToInput_InputField mFrom']")
    private WebElement fromPrice;

    @FindBy(xpath = ".//div[@id='price_filter']//div[contains(@class, 'bFlatButton ')]")
    private WebElement acceptPriceBtn;

    @FindBy(xpath = ".//*[contains(@class,'bOneTile inline')]")
    private WebElement firstElement;

    public boolean checkShowAllBtn(List<WebElement> list){
        if(!brandsShowAllList.isEmpty()) {
            brandsShowAllList.get(0).click();
            return true;
        }
        return false;
    }

    public void selectBrand(String itemName){

        if(checkShowAllBtn(brandsList)) {
            brandsInput.get(0).sendKeys(itemName);
        }

        for(WebElement item : brandsList){
            if (item.getText().replaceAll("[\\d]","").replace(" ","").equalsIgnoreCase(itemName)){
                item.click();
                return;
            }
        }
        Assert.fail("Не найден пункт меню - " + itemName);

    }

    public void setFromPrice(String price){
        fromPrice.click();
        fromPrice.clear();
        fromPrice.sendKeys(price);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.TAB).build().perform();
        acceptPriceBtn.click();
    }

    public void selectFirstElelement(){
        firstElement.click();
    }
}
