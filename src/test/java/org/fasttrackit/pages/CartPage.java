package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?post_type=product")
public class CartPage extends PageObject {
    @FindBy(css = ".first.instock.downloadable.virtual.taxable.purchasable.product-type-simple > a.button.product_type_simple.add_to_cart_button.ajax_add_to_cart")
    private WebElementFacade addFirstProduct;
    @FindBy(css = "#menu-item-124 > a")
    private WebElementFacade viewShopingCart;
    @FindBy(css = "td.product-name > a")
    private WebElementFacade product;
    @FindBy(css = " td.product-name > a")
    private WebElementFacade textName;
    @FindBy(css = " tr:nth-child(2) > td.product-name > a")
    private WebElementFacade secondProductName;
    @FindBy(css = "td.product-remove > a")
    private WebElementFacade deleteButton;
    @FindBy(css = "div.woocommerce-message")
    private WebElementFacade confirmationMessage;
    @FindBy(id = "coupon_code")
    private WebElementFacade couponFeald;
    @FindBy(css = " div > input.button")
    private WebElementFacade applyButton;
    @FindBy(css = "#post-118 > div > div > ul > li")
    private WebElementFacade alertMessage;

    public void clickFirstProduct() {
        waitFor(addFirstProduct);
        clickOn(addFirstProduct);
    }

    public void clickCart() {
        waitFor(viewShopingCart);
        clickOn(viewShopingCart);
    }

    public String checkProduct() {
        return product.getText();
    }

    public void clickDelete() {
        clickOn(deleteButton);
    }

    public String checkConfirmationMessage() {
        return confirmationMessage.getText();
    }

    public void typeIntoCouponFeald(String cuponCode) {
        typeInto(couponFeald, cuponCode);
    }

    public void clickApplyButton() {
        clickOn(applyButton);
    }

    public String checkMessage() {
        return alertMessage.getText();
    }
}
