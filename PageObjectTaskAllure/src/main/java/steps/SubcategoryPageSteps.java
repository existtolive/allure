package steps;

import pages.SubcategoryPage;
import ru.yandex.qatools.allure.annotations.Step;

public class SubcategoryPageSteps {
    @Step("осуществлен переход в расширенный поиск \"Перейти ко всем фильтрам\"")
    public void openAllFilters(){ new SubcategoryPage().openAllFilters();}

    @Step("проверить, что элементов на странице больше или равно \"{0}шт\"")
    public void checkElementsCount(int count){ new SubcategoryPage().checkElementsCount(count);}

    @Step("запомнить первый элемент в списке")
    public void remFirstElement(){ new SubcategoryPage().remFirstElement();}

    @Step("ввести в поисковую строку запомненное значение")
    public void fillSearchWithRemValue(){ new SubcategoryPage().fillSearchWithRemValue();}

    @Step("найти и проверить, что наименование товара соответствует запомненному значению")
    public void findProductAndCompare(){ new SubcategoryPage().findProductAndCompare(); }
}
