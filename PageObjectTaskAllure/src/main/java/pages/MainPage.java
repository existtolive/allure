package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BasePageSteps;

import java.util.List;

public class MainPage extends BasePage{

    public MainPage() {
        PageFactory.initElements(BasePageSteps.getDriver(), this);
    }

    @FindBy(xpath = ".//div[@class='home-arrow__tabs']//a")
    private List<WebElement> sectionList;

    public void openSection(String itemName) {
        selectFromCollection(itemName, sectionList);
    }
}
