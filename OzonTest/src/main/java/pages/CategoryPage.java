package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BasePageSteps;

import java.util.List;

public class CategoryPage extends BasePage {

    public CategoryPage() {
        PageFactory.initElements(BasePageSteps.getDriver(), this);
    }

    @FindBy(xpath = ".//div[contains(@class, 'bLeftMainMenu')]//a")
    public List<WebElement> categoryList;

    public void selectCategory(String itemName) {
        selectFromCollection(itemName, categoryList);
    }
}
