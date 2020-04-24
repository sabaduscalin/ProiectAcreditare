package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa4.fasttrackit.org:8008/")
public class HomePage extends PageObject {
    @FindBy(css = "#menu-item-122 > a")
    private WebElementFacade myAccountLink;
    @FindBy(css = "#menu-item-123 > a")
    private WebElementFacade shopLink;
    @FindBy(css = "#menu-item-125 > a")
    private WebElementFacade checkoutLink;

    public void clickMyAccount() {
        clickOn(myAccountLink);
    }

    public void clickShop() {
        clickOn(shopLink);
    }

    public void clickCheckout() {
        clickOn(checkoutLink);
    }


}
