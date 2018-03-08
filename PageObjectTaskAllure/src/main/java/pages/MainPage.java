package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BasePageSteps;

public class MainPage extends BasePage{

    public MainPage() {
        PageFactory.initElements(BasePageSteps.getDriver(), this);
    }

    @FindBy(xpath = ".//a[@data-id='market']")
    private WebElement yandexMarketBtn;

    public void openMarketPage() {
        yandexMarketBtn.click();
    }
}
