package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void loginValidCredentials() {
        loginSteps.navigateToHomePage();
        loginSteps.setCredential();
        loginSteps.checkWellcomeMessage("Hello sabadus.calin (not sabadus.calin? Log out)");
    }

    @Test
    public void loginWhithInvalidPassword() {
        loginSteps.navigateToHomePage();
        loginSteps.setCredentialWhitInvalifPass();
        loginSteps.checkErrorMessage("ERROR");
    }

}
