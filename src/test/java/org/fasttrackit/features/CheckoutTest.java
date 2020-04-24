package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.CheckoutSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class CheckoutTest extends BaseTest {
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private CartSteps cartSteps;
    @Steps
    private CheckoutSteps checkoutSteps;

    @Test
    public void procedToCheckout() {
        loginSteps.navigateToHomePage();
        loginSteps.setCredential();
        cartSteps.addProductToCart();
        checkoutSteps.procedCheckout();
        checkoutSteps.checkConffirmationMessage("Thank you. Your order has been received.");

    }

    @Test
    public void checkoutWithoutLogin() {

        cartSteps.addProductToCart();
        checkoutSteps.clickProcedToCheckout();
        checkoutSteps.completBillingDetails();
        checkoutSteps.checkConffirmationMessage("Thank you. Your order has been received.");
    }

    @Test
    public void checkoutProductWhitHigestPrice() {
        loginSteps.login();
        checkoutSteps.clickShop();
        checkoutSteps.clickDropDown();
        checkoutSteps.addToCartSunglasses();
        checkoutSteps.clickCheckout();
        checkoutSteps.completBillingDetails();
        checkoutSteps.checkConffirmationMessage("Thank you. Your order has been received.");


    }
}
