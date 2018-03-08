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
    public List<WebElement> brandsList;

    @FindBy(xpath = ".//div[@id='price_filter']//input[@class='eFromToInput_InputField mFrom']")
    public WebElement fromPrice;

    @FindBy(xpath = ".//div[@id='price_filter']//div[contains(@class, 'bFlatButton ')]")
    public WebElement acceptPriceBtn;

    @FindBy(xpath = ".//*[contains(@class,'bOneTile inline')]")
    public WebElement firstElement;

    public void selectBrand(String itemName){
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
