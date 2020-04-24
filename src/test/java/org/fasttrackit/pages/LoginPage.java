package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?page_id=120")
public class LoginPage extends PageObject {

    @FindBy(css = "#username")
    private WebElementFacade emailFeald;
    @FindBy(css = "#password")
    private WebElementFacade passwardFeald;
    @FindBy(css = " div.u-column1.col-1 > form > p:nth-child(3) > button")
    private WebElementFacade login;

    public void setEmail(String email) {
        waitFor(emailFeald);
        typeInto(emailFeald, email);
    }

    public void setPasswardFeald(String pass) {
        typeInto(passwardFeald, pass);
    }

    public void clickLoginButton() {
        clickOn(login);
    }

}
