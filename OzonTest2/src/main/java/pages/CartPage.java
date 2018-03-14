package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BasePageSteps;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CartPage extends BasePage {

    public CartPage(){
        PageFactory.initElements(BasePageSteps.getDriver(), this);
    }

    @FindBy(xpath = ".//span[@class='eCartItem_nameValue']")
    private List<WebElement> cartItemsList;

    @FindBy(xpath = ".//div[contains(@class, 'eCartControls_buttons')]")
    private WebElement removeAllBtn;

    @FindBy(xpath = ".//div[contains(@class, 'eCartTotal_infoCount')]")
    private WebElement cartInfo;

    @FindBy(xpath = ".//div[contains(@class, 'eDYRecomendContainer')]")
    private WebElement recomendWindow;

    @FindBy(xpath = ".//div[@class='eCartPage_title']//span[contains(text(), 'Корзина') and contains(text(), 'пуста')]")
    private WebElement emptyCartMsg;
    
    public void checkItemInCart(){
        for (WebElement item: cartItemsList) {
            if (item.getText().equalsIgnoreCase(ProductPage.name)){
                return;
            }
        }
        Assert.fail("Не найден добавленный товар - " + ProductPage.name);

    }

    public void removeAll() {
        waitForElement(recomendWindow, 10);
        if(waitForElement(cartInfo, 10)){
            removeAllBtn.click();
        }

    }

    public void checkCart(){
        Assert.assertTrue("Корзина не пуста", waitForElement(emptyCartMsg, 10));
    }

}
