package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ru.Когда;
import pages.CategoryPage;
import pages.MarketPage;

public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();

    MarketPageSteps dmsSteps = new MarketPageSteps();

    CategoryPageSteps sendAppSteps = new CategoryPageSteps();

    @When("^выбран пункт меню \"Маркет\"$")
    public void openMarketPage(){
        new MainPageSteps().openMarketPage();
    }

    @When("^выбран пункт меню Маркета \"Электроника\"$")
    public void openElectronicsCategoryPage(){ new MarketPage().openElectronicsCategoryPage();
    }

    @When("выбран пункт меню Маркета раздела Электроника \"(.+)\"$")
    public void openSubcategory(String subcategory){ new CategoryPage().openSubcategory(subcategory);}

}
