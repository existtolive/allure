package steps;

import pages.AllFiltersPage;
import ru.yandex.qatools.allure.annotations.Step;

public class AllFiltersPageSteps {

    @Step("задан параметр поиска от \"{0}\" рублей")
    public void setFromValue(String value){ new AllFiltersPage().setFromValue(value);}

    @Step("выбран производитель \"{0}\"")
    public void choiceManufacturer(String itemName){ new AllFiltersPage().choiceManufacturer(itemName);}

    @Step("нажата кнопка \"Показать подходящие\"")
    public void acceptFilters(){ new AllFiltersPage().acceptFilters();}
}
