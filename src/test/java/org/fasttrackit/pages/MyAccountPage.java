package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?page_id=120")
public class MyAccountPage extends PageObject {
    @FindBy(css = "p:nth-child(1)")
    private WebElementFacade welcomeMessage;
    @FindBy(css = "strong:nth-child(1)")
    private WebElementFacade errorMessagePassl;

    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }

    public String getErrorMessage() {
        return errorMessagePassl.getText();
    }
}
