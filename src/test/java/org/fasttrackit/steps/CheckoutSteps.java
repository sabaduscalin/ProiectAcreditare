package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductPage;
import org.junit.Assert;

public class CheckoutSteps {
    private CheckoutPage checkoutPage;
    private HomePage homePage;
    private ProductPage productPage;

    @Step
    public void procedCheckout() {
        checkoutPage.clickProcedCheckout();
        checkoutPage.clickPlaceOrder();
    }

    @Step
    public void checkConffirmationMessage(String expected) {
        String message = checkoutPage.checkConfirmation();
        Assert.assertEquals(message, expected);
    }

    @Step
    public void clickProcedToCheckout() {
        checkoutPage.clickProcedCheckout();
    }

    @Step
    public void completBillingDetails() {
        checkoutPage.setFirstName("sabadus");
        checkoutPage.setLastName("Calin");
        checkoutPage.setStreet("Arinilor");
        checkoutPage.setCity("Cluj");
        checkoutPage.setZip("55456");
        checkoutPage.setPhone("0788878888");
        checkoutPage.setEmail("sabadus.calin@manilinator.com");
        checkoutPage.clickPlaceOrder();
    }

    @Step
    public void clickShop() {
        homePage.clickShop();
    }

    @Step
    public void clickDropDown() {
        productPage.setClickDropdown();
    }

    @Step
    public void addToCartSunglasses() {
        productPage.clickAddToCartSunglasses();
    }

    @Step
    public void clickCheckout() {
        homePage.clickCheckout();
    }
}