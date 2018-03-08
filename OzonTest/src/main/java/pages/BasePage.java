package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BasePageSteps;

import java.util.List;

public class BasePage {
    WebDriver driver = BasePageSteps.getDriver();
    public WebDriverWait wait;

    public BasePage(){
        PageFactory.initElements(driver, this);
    }

    public void selectFromCollection(String itemName, List<WebElement> collection){
        for(WebElement item : collection){
            if (item.getText().equalsIgnoreCase(itemName)){
                item.click();
                return;
            }
        }
        Assert.fail("Не найден пункт меню - " + itemName);

    }
}
