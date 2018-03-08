package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BasePageSteps;

import java.util.List;

public class AllFiltersPage extends BasePage {
    public AllFiltersPage() {
        PageFactory.initElements(BasePageSteps.getDriver(), this);
    }

    @FindBy(xpath = ".//input[@id='glf-pricefrom-var']")
    private WebElement setFromValueBtn;

    @FindBy(xpath = ".//span[text()='Показать подходящие']//..")
    private WebElement acceptBtn;

    @FindBy(xpath = "//span[contains(text(),'Производитель')]//..//..//..//label")
    private List<WebElement> manufacturerList;

    public void setFromValue(String value) {
        setFromValueBtn.sendKeys(value);
    }

    public void choiceManufacturer(String itemName) {
        for(WebElement item : manufacturerList){
            if (item.getText().equalsIgnoreCase(itemName)){
                item.click();
                return;
            }
        }
        Assert.fail("Не найден производитель - " + itemName);

    }

    public void acceptFilters() {
        acceptBtn.click();
    }

}
