package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BasePageSteps;

import java.util.concurrent.TimeUnit;

public class SubcategoryPage extends BasePage {
    public SubcategoryPage() {
        PageFactory.initElements(BasePageSteps.getDriver(), this);
    }

    public static String firstElement;

    private static boolean listViewMode;

    @FindBy(xpath = ".//a[contains(text(), 'Перейти ко всем фильтрам')]")
    private WebElement openAllFiltersBtn;

    @FindBy(xpath = "//div[contains(@class, 'n-snippet-card2__title')]//a")
    private WebElement elementFromList;

    @FindBy(xpath = "//div[contains(@class, 'n-snippet-cell2__title')]//a")
    private WebElement elementFromCells;

    @FindBy(xpath = "//input[@id='header-search']")
    private WebElement searchInput;

    @FindBy(xpath = ".//span[@class='search2__button']//button")
    private WebElement searchBtn;

    @FindBy(xpath = ".//*[@class='n-title__text']//h1")
    private WebElement productTitle;

    @FindBy(xpath = ".//*[contains(@class, 'radio-button__radio_side_right')]")
    private WebElement listViewBtn;


    public void openAllFilters() {
        openAllFiltersBtn.click();
    }

    public void checkElementsCount( int count){
        listViewMode = listViewBtn.getAttribute("class").contains("checked_yes");
        if(listViewMode)
            Assert.assertTrue("Кол-во элементов менее 12", driver.findElements(By.xpath("//div[contains(@class, 'n-snippet-card2__title')]//a")).size()>=count);
        else
            Assert.assertTrue("Кол-во элементов менее 12", driver.findElements(By.xpath("//div[contains(@class, 'n-snippet-cell2__title')]//a")).size()>=count);
    }

    public void remFirstElement(){
        listViewMode = listViewBtn.getAttribute("class").contains("checked_yes");
        if(listViewMode)
            firstElement = elementFromList.getText();
        else
            firstElement = elementFromCells.getText();
    }

    public void fillSearchWithRemValue(){
        searchInput.sendKeys(firstElement);
    }

    public void findProductAndCompare(){
        searchBtn.click();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
        if(driver.findElements(By.xpath(".//*[@class='n-title__text']//h1")).isEmpty())
            openFirstElement();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertEquals("Первый товар в списке не совпадает с запомненным", firstElement, productTitle.getText());
    }

    public void openFirstElement(){
        if(listViewMode)
            elementFromList.click();
        else
            elementFromCells.click();
    }

}
