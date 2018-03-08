package steps;


import pages.CategoryPage;
import ru.yandex.qatools.allure.annotations.Step;

public class CategoryPageSteps {
    @Step("выбран подпункт \"{0}\" в разделе \"{1}\"")
    public void openSubcategory(String subcategory, String category){ new CategoryPage().openSubcategory(subcategory, category);}
}
