package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.NoSuchElementException;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?post_type=product")
public class ProductPage extends PageObject {

    @FindBy(css = "#primary > form > select")
    private WebElementFacade clickDropdown;
    @FindBy(css = " li.post-62.product.type-product.status-publish.has-post-thumbnail.product_cat-accessories-clothing.first.instock.featured.taxable.shipping-taxable.purchasable.product-type-simple > a.button.product_type_simple.add_to_cart_button.ajax_add_to_cart")
    private WebElementFacade addToCartSunglasses;
    @FindBy(css = "#primary > header > h1")
    private WebElementFacade textMessage;

    public void setClickDropdown() {
        clickDropdown.selectByValue("price-desc");
    }

    public void clickAddToCartSunglasses() {
        clickOn(addToCartSunglasses);
    }

    public String checkMessage() {
        return textMessage.getText();
    }
}


