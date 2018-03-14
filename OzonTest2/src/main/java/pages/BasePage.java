package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BasePageSteps;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class BasePage {
    protected WebDriver driver = BasePageSteps.getDriver();
    private WebDriverWait wait;

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

    public boolean waitForElement(WebElement element, int seconds){
        try {
            wait = new WebDriverWait(driver, seconds);
            wait.pollingEvery(100, TimeUnit.MILLISECONDS);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Элемент не обнаружен - " + element.toString());
            return false;
        }
    }
}
