package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BasePageSteps;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPage extends BasePage {

    public MainPage() {
        PageFactory.initElements(BasePageSteps.getDriver(), this);
    }

    @FindBy(xpath = ".//span[@class='eHeaderCatalogButton_Text']")
    public WebElement allcategoriesBtn;

    @FindBy(xpath = ".//span[@class='eOzonCatalog_1LevelLinkText']")
    public List<WebElement> menuItemList;

    @FindBy(xpath = ".//div[contains(@class, 'eDYbanner_close')]")
    public WebElement bannerCloseBtn;

    public void openOzonPage() {
        driver.get(BasePageSteps.properties.getProperty("app.url"));
    }

    public void windowMaximize() {
        driver.manage().window().maximize();
        closeBanner();
    }

    public void closeBanner(){
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        if( waitForElement(bannerCloseBtn, 10))
            bannerCloseBtn.click();
    }

    public void selectMenuItem(String itemName){
        allcategoriesBtn.click();
        selectFromCollection(itemName, menuItemList);
    }


}
