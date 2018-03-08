package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BasePageSteps;

public class ProductPage extends BasePage {

    public static String name;
    public static String price;

    public ProductPage() {
        PageFactory.initElements(BasePageSteps.getDriver(), this);
    }

    @FindBy(xpath = ".//div[contains(@class, 'bSaleBlockButton')]")
    public WebElement addToCartBtn;

    @FindBy(xpath = ".//h1[@class='bItemName']")
    public WebElement itemName;

    @FindBy(xpath = ".//div[@class='bSaleColumn']//span[@class='eOzonPrice_main']")
    public WebElement itemPrice;

    @FindBy(xpath = ".//div[text()='Корзина']")
    public WebElement cartBtn;

    public void addToCart(){
        addToCartBtn.click();
    }

    public void remNameAndPrice(){
        name = itemName.getText();
        price = itemPrice.getText();
    }

    public void openCart(){
        cartBtn.click();
    }
}
