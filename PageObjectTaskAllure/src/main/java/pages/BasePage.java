package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BasePageSteps;

public class BasePage {
    WebDriver driver = BasePageSteps.getDriver();
    private WebDriverWait wait;

    public BasePage(){
        PageFactory.initElements(driver, this);
    }

    public void waitForElement(WebElement element, int seconds){
        wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
