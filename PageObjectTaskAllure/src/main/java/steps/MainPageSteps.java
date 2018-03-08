package steps;


import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;


public class MainPageSteps {

    @Step("выбран пункт меню \"Маркет\"")
    public void openMarketPage(){
        new MainPage().openMarketPage();
    }

}
