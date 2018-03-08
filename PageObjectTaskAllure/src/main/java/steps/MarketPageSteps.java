package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketPageSteps {

    @Step("выбран пункт меню Маркета \"Электроника\"")
    public void openElectronicsCategoryPage(){ new MarketPage().openElectronicsCategoryPage(); }

}
