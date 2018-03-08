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
    public List<WebElement> bannerCloseBtn;

    public void openOzonPage() {
        driver.get("https://www.ozon.ru/");
    }

    public void windowMaximize() {
        driver.manage().window().maximize();
        closeBanner();
    }

    public void closeBanner(){
        try{
            TimeUnit.SECONDS.sleep(10);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        if(!bannerCloseBtn.isEmpty())
            bannerCloseBtn.get(0).click();

    }

    public void selectMenuItem(String itemName){
        allcategoriesBtn.click();
        selectFromCollection(itemName, menuItemList);
    }


}
