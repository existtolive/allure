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

public class CartPage extends BasePage {

    public CartPage(){
        PageFactory.initElements(BasePageSteps.getDriver(), this);
    }

    @FindBy(xpath = ".//span[@class='eCartItem_nameValue']")
    public List<WebElement> cartItemsList;

    @FindBy(xpath = ".//div[contains(@class, 'jsRemoveAll')]")
    public WebElement removeAllBtn;

    @FindBy(xpath = ".//div[@class='eCartPage_title']//span[contains(text(), 'Корзина') and contains(text(), 'пуста')]")
    public List<WebElement> emptyCartMsgList;
    
    public void checkItemInCart(){
        for (WebElement item: cartItemsList) {
            if (item.getText().equalsIgnoreCase(ProductPage.name)){
                return;
            }
        }
        Assert.fail("Не найден добавленный товар - " + ProductPage.name);

    }

    public void removeAll() {

        try{
            TimeUnit.SECONDS.sleep(7);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        //if(waitForElement(removeAllBtn, 10))
            removeAllBtn.click();

//        unknown error: Element <div class="bIconButton mRemove mGray jsRemoveAll">...</div> is not clickable at point (853, 321). Other element would receive the click: <div class="bCartPage
//        mBlockActions
//        ">...</div>

    }

    public void checkCart(){
        Assert.assertTrue("Корзина не пуста", !emptyCartMsgList.isEmpty());
    }

}
