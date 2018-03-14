package steps;

import pages.ProductPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ProductPageSteps {

    @Step("добавлен первый товар в корзину, запомнено название и цена")
    public void addToCartRemNameAndPrice(){
        new ProductPage().addToCart();
        new ProductPage().remNameAndPrice();
    }

    @Step("осуществлен переход в корзину")
    public void openCart(){
        new ProductPage().openCart();
    }

}
