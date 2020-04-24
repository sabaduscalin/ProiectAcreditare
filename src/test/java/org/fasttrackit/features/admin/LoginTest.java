package org.fasttrackit.features.admin;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.admin.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void loginValidCredential(){
        loginSteps.navigateToHomePage();
        loginSteps.setCredential();
        loginSteps.clickLogin();
        loginSteps.checkMessage("Welcome to WordPress!");
    }
}
