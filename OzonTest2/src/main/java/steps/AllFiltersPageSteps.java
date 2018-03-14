package steps;

import pages.AllFiltersPage;
import ru.yandex.qatools.allure.annotations.Step;

public class AllFiltersPageSteps {

    @Step("выбран производитель – {0}")
    public void selectBrand(String itemName){
        new AllFiltersPage().selectBrand(itemName);
    }

    @Step("заполнена цена - {0}")
    public void setFromPrice(String price){
        new AllFiltersPage().setFromPrice(price);
    }

    @Step("добавлен первый товар в корзину, запомнены название и цена")
    public void selectFirstElelement(){
        new AllFiltersPage().selectFirstElelement();
    }
}
