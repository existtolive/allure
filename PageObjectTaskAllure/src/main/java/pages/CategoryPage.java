package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BasePageSteps;

import java.util.List;

public class CategoryPage extends BasePage {

    public CategoryPage() {
        PageFactory.initElements(BasePageSteps.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='catalog-menu__item']//a[contains(text(), 'Телевизоры')]")
    private WebElement openTVSubcategoryBtn;

    @FindBy(xpath = "//*[text()='Портативная техника']//following-sibling::div//a[contains(text(), 'Наушники и')]")
    private WebElement openHeadphonesSubcategoryBtn;

    @FindBy(xpath = "//ul[@id='desktopMenuMain']//li[contains(@class,'menu-item')]")
    public List<WebElement> menuList;

    public void openSubcategory(String subcategory, String category) {
        try{
            driver.findElement(By.xpath(".//a[text()='"+category+"']//following-sibling::div//a[text()='"+subcategory+"']")).click();
        }
        catch(Exception e) {
            Assert.fail("Не найден подпункт - " + subcategory + " в меню - " + category);
        }
    }
}
