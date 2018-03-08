package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainPageSteps {
    @Step("открыт сайт \"www.ozon.ru\"")
    public void openOzonPage(){
        new MainPage().openOzonPage();
    }

    @Step("развернуто окно на весь экран")
    public void windowMaximize(){
        new MainPage().windowMaximize();
    }

    @Step("выбран пункт меню – {0}")
    public void selectMenuItem(String itemName){
        new MainPage().selectMenuItem(itemName);
    }

}
