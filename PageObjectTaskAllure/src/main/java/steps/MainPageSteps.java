package steps;


import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;


public class MainPageSteps {

    @Step("выбран пункт меню \"{0}\"")
    public void openSection(String itemName){
        new MainPage().openSection(itemName);
    }

}
