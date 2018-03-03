package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public MainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public static MainPage onMainPage(WebDriver driver) {
        return new MainPage(driver);
    }

    @FindBy(xpath = ".//a[@data-id='market']")
    private WebElement yandexMarketBtn;

    public void openMarketPage() {
        yandexMarketBtn.click();
    }
}
