package steps;

import pages.CartPage;
import pages.ProductPage;
import ru.yandex.qatools.allure.annotations.Step;

public class CartPageSteps {

    @Step("проверить, что в корзине есть добавленный товар")
    public void checkItemInCart(){
        new CartPage().checkItemInCart();
    }

    @Step("нажата кнопка - удалить все")
    public void removeAll(){
        new CartPage().removeAll();
    }

    @Step("проверить, что корзина пуста")
    public void checkCart(){
        new CartPage().checkCart();
    }
}
