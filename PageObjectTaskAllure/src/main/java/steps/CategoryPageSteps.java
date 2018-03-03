package steps;

import pages.CategoryPage;
import ru.yandex.qatools.allure.annotations.Step;

public class CategoryPageSteps {
    @Step("выбран пункт меню Маркета раздела Электроника {0}")
    public void openSubcategory(String subcategory){ new CategoryPage().openSubcategory(subcategory);}
}
