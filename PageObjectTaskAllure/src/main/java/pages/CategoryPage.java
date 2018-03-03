package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class CategoryPage extends BasePage {
    public CategoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public CategoryPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='catalog-menu__item']//a[contains(text(), 'Телевизоры')]")
    private WebElement openTVSubcategoryBtn;

    @FindBy(xpath = "//*[text()='Портативная техника']//following-sibling::div//a[contains(text(), 'Наушники и')]")
    private WebElement openHeadphonesSubcategoryBtn;

    public void openSubcategory(String subcategory) {
        if(subcategory.equals("Телевизоры"))
            openTVSubcategoryBtn.click();
        if(subcategory.equals("Наушники"))
            openHeadphonesSubcategoryBtn.click();
    }
}
