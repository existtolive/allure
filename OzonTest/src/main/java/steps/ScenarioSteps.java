package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {
    MainPageSteps mainPageSteps = new MainPageSteps();

    CategoryPageSteps categoryPageSteps = new CategoryPageSteps();

    AllFiltersPageSteps allFiltersPageSteps = new AllFiltersPageSteps();

    ProductPageSteps productPageSteps = new ProductPageSteps();

    CartPageSteps cartPageSteps = new CartPageSteps();

    @When("^открыт сайт \"www.ozon.ru\"$")
    public void openOzonPage(){
        mainPageSteps.openOzonPage();
    }

    @When("^развернуто окно на весь экран$")
    public void windowMaximize(){
        mainPageSteps.windowMaximize();
    }

    @When("^выбран пункт меню – (.+)$")
    public void selectMenuItem(String itemName){
        mainPageSteps.selectMenuItem(itemName);
    }

    @When("^выбрана категория – (.+)$")
    public void selectCategory(String itemName){
        categoryPageSteps.selectCategory(itemName);
    }

    @When("^выбран производитель – (.+)$")
    public void selectBrand(String itemName){
        allFiltersPageSteps.selectBrand(itemName);
    }

    @When("^заполнена цена - (.+)$")
    public void setFromPrice(String price){
        allFiltersPageSteps.setFromPrice(price);
    }

    @When("^добавлен первый товар в корзину, запомнены название и цена$")
    public void addFirstElementToCartRemNameAndPrice(){
        allFiltersPageSteps.selectFirstElelement();
        productPageSteps.addToCartRemNameAndPrice();
    }

    @When("^осуществлен переход в корзину$")
    public void openCart(){
        productPageSteps.openCart();
    }


    @Then("^проверить, что в корзине есть добавленный товар$")
    public void checkItemInCart(){
        cartPageSteps.checkItemInCart();
    }

    @When("^нажата кнопка - удалить все$")
    public void removeAll(){
        cartPageSteps.removeAll();
    }

    @Then("^проверить, что корзина пуста$")
    public void checkCart(){
        cartPageSteps.checkCart();
    }
}
