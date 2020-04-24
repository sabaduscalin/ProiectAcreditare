package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;
import org.fasttrackit.utils.Constants;
import org.junit.Assert;

public class LoginSteps {
    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;


    @Step
    public void navigateToHomePage() {
        homePage.open();
        homePage.clickMyAccount();
    }

    @Step
    public void setCredential() {

        loginPage.setEmail(Constants.USER_EMAIL);
        loginPage.setPasswardFeald(Constants.USER_PASS);
        loginPage.clickLoginButton();

    }

    @Step
    public void checkWellcomeMessage(String expected) {
        String message = myAccountPage.getWelcomeMessage();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void setCredentialWhitInvalifPass() {
        loginPage.setEmail(Constants.USER_EMAIL);
        loginPage.setPasswardFeald("asvasvsv");
        loginPage.clickLoginButton();

    }

    @Step
    public void checkErrorMessage(String expected) {
        String message = myAccountPage.getErrorMessage();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void login() {
        navigateToHomePage();
        setCredential();
    }
}
