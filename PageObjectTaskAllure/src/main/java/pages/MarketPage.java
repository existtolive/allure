package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BasePageSteps;

import java.util.concurrent.TimeUnit;

public class  MarketPage extends BasePage{

    public MarketPage() {
        PageFactory.initElements(BasePageSteps.getDriver(), this);
    }

    @FindBy(xpath = ".//span[contains(text(), 'Все категории')]//..")
    private WebElement allCategoriesBtn;

    @FindBy(xpath = ".//*[contains(text(), 'Электроника')]")
    private WebElement openElectronicsCategoryBtn;

    public void openElectronicsCategoryPage() {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        if(!driver.findElements(By.xpath(".//span[contains(text(), 'Все категории')]")).isEmpty()){
            Actions actions = new Actions(driver);
            actions.moveToElement(allCategoriesBtn).build().perform();
            waitForElement(openElectronicsCategoryBtn, 5);
            openElectronicsCategoryBtn.click();
        }
        else
            openElectronicsCategoryBtn.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
