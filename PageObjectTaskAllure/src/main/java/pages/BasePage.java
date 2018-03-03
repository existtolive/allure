package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class BasePage {
    WebDriver driver;

    public BasePage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

}
