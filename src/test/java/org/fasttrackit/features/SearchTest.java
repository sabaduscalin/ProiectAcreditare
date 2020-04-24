package org.fasttrackit.features;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class SearchTest extends BaseTest {
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private SearchSteps searchSteps;


    @Test
    public void searchProduct() {
        loginSteps.navigateToHomePage();
        loginSteps.setCredential();
        searchSteps.searchForProduct("belt");
        searchSteps.checkIfIsTheSearchProduct("BELT");
    }

    @Test
    public void checkSearchFealdToSeeIfIsLimitateeCaracters() {
        loginSteps.navigateToHomePage();
        loginSteps.setCredential();
        searchSteps.searchForProduct("ovinoivosivoisnvoviovnonvovnonvoeovnoenvoenvoinvoienvoneovinevneoovinoivosivoisnvoviovnonvovnonvoeovnoenvoenvoinvoienvoneovinevneoovinoivosivoisnvoviovnonvovnonvoeovnoenvoenvoinvoienvoneovinevneoovinoivosivoisnvoviovnonvovnonvoeovnoenvoenvoinvoienvoneovinevneo");
        searchSteps.checkResult();
    }

    @Test
    public void verifyProductIsFoundInList() {
        loginSteps.navigateToHomePage();
        loginSteps.setCredential();
        searchSteps.searchForProduct("T-Shirt");
        searchSteps.verifyProductIsFound("T-Shirt");

    }

    @Test
    public void viewProductFromList() {

        searchSteps.selectProduct("Logo Collection");
        searchSteps.checkText("LOGO COLLECTION");
    }
}