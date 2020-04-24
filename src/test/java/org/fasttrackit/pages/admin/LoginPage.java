package org.fasttrackit.pages.admin;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    @FindBy(id = "user_login")
    private WebElementFacade userNameFeald;
    @FindBy(id = "user_pass")
    private WebElementFacade passwordFeald;
    @FindBy(id = "wp-submit")
    private WebElementFacade logInButton;
    @FindBy(css = "#welcome-panel > div > h2")
    private WebElementFacade welcomeMessage;

    public void setUserNameFeald(String userName) {
        typeInto(userNameFeald, userName);
    }

    public void setPasswordFeald(String password) {
        typeInto(passwordFeald, password);
    }

    public void clickLogIn() {
        clickOn(logInButton);
    }

    public String checkMessage() {
        return welcomeMessage.getText();
    }

}

