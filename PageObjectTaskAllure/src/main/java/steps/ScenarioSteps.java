package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();

    MarketPageSteps marketPageSteps = new MarketPageSteps();

    CategoryPageSteps categoryPageSteps = new CategoryPageSteps();

    SubcategoryPageSteps subcategoryPageSteps = new SubcategoryPageSteps();

    AllFiltersPageSteps allFiltersPageSteps = new AllFiltersPageSteps();


    @When("^выбран пункт меню \"(.+)\"$")
    public void openSection(String itemName){
        mainPageSteps.openSection(itemName);
    }

    @When("^выбран пункт меню Маркета \"(.+)\"$")
    public void openCategoryPage(String itemName){ marketPageSteps.openCategoryPage(itemName);
    }

    @When("^выбран подпункт \"(.+)\" в разделе \"(.+)\"$")
    public void openSubcategory(String subcategory, String category){ categoryPageSteps.openSubcategory(subcategory, category);}

    @When("^осуществлен переход в расширенный поиск \"Перейти ко всем фильтрам\"$")
    public void openAllFilters(){ subcategoryPageSteps.openAllFilters();}

    @When("^задан параметр поиска от \"(.+)\" рублей$")
    public void setFromValue(String value){ allFiltersPageSteps.setFromValue(value);}

    @When("^выбран производитель \"(.+)\"$")
    public void choiceManufacturer(String itemName){ allFiltersPageSteps.choiceManufacturer(itemName);}

    @When("^нажата кнопка \"Показать подходящие\"$")
    public void acceptFilters(){ allFiltersPageSteps.acceptFilters();}

    @Then("^проверить, что элементов на странице больше или равно \"(.+)шт\"$")
    public void checkElementsCount(int count){ subcategoryPageSteps.checkElementsCount(count);}

    @Then("^запомнить первый элемент в списке$")
    public void remFirstElement(){ subcategoryPageSteps.remFirstElement();}

    @Then("^ввести в поисковую строку запомненное значение$")
    public void fillSearchWithRemValue(){ subcategoryPageSteps.fillSearchWithRemValue();}

    @Then("^найти и проверить, что наименование товара соответствует запомненному значению$")
    public void findProductAndCompare(){ subcategoryPageSteps.findProductAndCompare();}

}
