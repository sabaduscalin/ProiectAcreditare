package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?page_id=119")
public class CheckoutPage extends PageObject {
    @FindBy(css = "#post-118 > div > div > div > div > div > a")
    private WebElementFacade procedToCheckoutButton;
    @FindBy(id = "place_order")
    private WebElementFacade placeOrderButton;
    @FindBy(css = ".woocommerce-notice")
    private WebElementFacade confirmationMessage;
    @FindBy(css = "#billing_first_name")
    private WebElementFacade firstName;
    @FindBy(css = "#billing_last_name")
    private WebElementFacade lastName;
    @FindBy(css = "#billing_address_1")
    private WebElementFacade street;
    @FindBy(css = "#billing_city")
    private WebElementFacade city;
    @FindBy(css = "#billing_postcode")
    private WebElementFacade zip;
    @FindBy(css = "#billing_phone")
    private WebElementFacade phone;
    @FindBy(css = "#billing_email")
    private WebElementFacade email;


    public void clickProcedCheckout() {
        waitFor(procedToCheckoutButton);
        clickOn(procedToCheckoutButton);
    }

    public void clickPlaceOrder() {
        waitFor(placeOrderButton);
        clickOn(placeOrderButton);
    }

    public String checkConfirmation() {
        waitFor(confirmationMessage);
        return confirmationMessage.getText();
    }

    public void setFirstName(String textFirstname) {
        waitFor(firstName);
        typeInto(firstName, textFirstname);
    }

    public void setLastName(String textLastname) {
        typeInto(lastName, textLastname);
    }

    public void setStreet(String textStreet) {
        typeInto(street, textStreet);
    }

    public void setCity(String textCity) {
        typeInto(city, textCity);
    }

    public void setZip(String textZip) {
        typeInto(zip, textZip);
    }

    public void setPhone(String textPhone) {
        typeInto(phone, textPhone);
    }

    public void setEmail(String textEmail) {
        typeInto(email, textEmail);
    }
}
