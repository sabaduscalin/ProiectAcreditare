package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.pages.SearchPage;
import org.junit.Assert;

public class CartSteps {
    private HomePage homePage;
    private CartPage cartPage;

    @Step
    public void addProductToCart() {
        homePage.open();
        homePage.clickShop();
        cartPage.clickFirstProduct();
        cartPage.clickCart();
    }

    @Step
    public void checkIfProductIsAddToCart(String expected) {
        String messege = cartPage.checkProduct();
        Assert.assertEquals(messege, expected);
    }

    @Step
    public void clickDelete() {
        cartPage.clickDelete();
    }

    @Step
    public void checkConfirmationMessage(String expected) {
        String messsage = cartPage.checkConfirmationMessage();
        Assert.assertEquals(messsage, expected);
    }

    @Step
    public void typeInCouponFeald(String cuponCode) {
        cartPage.typeIntoCouponFeald(cuponCode);
    }

    @Step
    public void clickApplyCoupon() {
        cartPage.clickApplyButton();
    }

    @Step
    public void checkMessage(String expected) {
        String messsage = cartPage.checkMessage();
        Assert.assertEquals(messsage, expected);
    }


}


