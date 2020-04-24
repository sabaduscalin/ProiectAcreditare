package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class CartTest extends BaseTest {
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private CartSteps cartSteps;
    @Steps
    private SearchSteps searchSteps;


    @Test
    public void addProductToCart() {
        loginSteps.navigateToHomePage();
        loginSteps.setCredential();
        cartSteps.addProductToCart();
        cartSteps.checkIfProductIsAddToCart("Album");
    }

    @Test
    public void addProductToCartAndDeleteBeforeCheckout() {
        loginSteps.login();
        cartSteps.addProductToCart();
        cartSteps.clickDelete();
        cartSteps.checkConfirmationMessage("“Album” removed. Undo?");

    }

    @Test
    public void applyInvalidCupon() {
        loginSteps.login();
        cartSteps.addProductToCart();
        cartSteps.typeInCouponFeald("FakeCoupon");
        cartSteps.clickApplyCoupon();
        cartSteps.checkMessage("Coupon \"fakecoupon\" does not exist!");

    }

}
