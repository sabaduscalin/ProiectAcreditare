package org.fasttrackit.steps.admin;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.admin.HomePage;
import org.fasttrackit.pages.admin.LoginPage;
import org.junit.Assert;

public class LoginSteps {
    private LoginPage loginPage;
    private HomePage homePage;
    @Step
    public void navigateToHomePage(){
        homePage.open();
    }
   @Step
    public void setCredential(){
       loginPage.setUserNameFeald("admin");
       loginPage.setPasswordFeald("parola11");
   }
   @Step
    public void clickLogin(){
       loginPage.clickLogIn();
   }
   @Step
    public void checkMessage(String expected){
        String message = loginPage.checkMessage();
       Assert.assertEquals(message,expected);
   }
   @Step
    public void login(){
        homePage.open();
        loginPage.setUserNameFeald("admin");
        loginPage.setPasswordFeald("parola11");
        loginPage.clickLogIn();
   }
}
