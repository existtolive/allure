package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class  MarketPage extends BasePage{
    public MarketPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public MarketPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = ".//a[contains(text(), 'Электроника')]")
    private WebElement openElectronicsCategoryBtn;

    public void openElectronicsCategoryPage() {
        openElectronicsCategoryBtn.click();
    }
}
