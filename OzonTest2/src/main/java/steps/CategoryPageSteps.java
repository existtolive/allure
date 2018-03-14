package steps;

import pages.CategoryPage;
import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class CategoryPageSteps {

    @Step("выбрана категория – {0}")
    public void selectCategory(String itemName){
        new CategoryPage().selectCategory(itemName);
    }
}
