package steps;

import pages.MainPage;
import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketPageSteps {

    @Step("выбран пункт меню Маркета{0}")
    public void openElectronicsCategoryPage(){ new MarketPage().openElectronicsCategoryPage(); }

}
