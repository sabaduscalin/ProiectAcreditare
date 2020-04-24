package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.fasttrackit.utils.Constants;
import org.junit.Assert;
import org.yecht.Data;

public class SearchSteps {
    private SearchPage searchPage;
    private HomePage homePage;
    private ProductPage productPage;

    @Step
    public void openHomePage() {
        homePage.open();
    }

    @Step
    public void searchForProduct(String text) {
        searchPage.clickSearchButton();
        searchPage.tipeInSearchFeald(text);
        searchPage.clickToSearchProduct();
    }

    @Step
    public void checkIfIsTheSearchProduct(String expected) {
        String message = searchPage.checkText();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void checkResult() {
        String message = searchPage.seeResult();
        Assert.assertTrue(true);
    }

    @Step
    public void verifyProductIsFound(String name) {
        Assert.assertTrue(searchPage.setProductInList(name));

    }

    @Step
    public void selectProduct(String name) {
        homePage.open();
        homePage.clickShop();
        searchPage.selectProductInList("Logo Collection");
        searchPage.checkTextParagraf();
    }

    @Step
    public void checkText(String name) {
        String message = searchPage.checkText();
        Assert.assertEquals(message, name);
    }

    @Step
    public void checkSearchResult(String expected) {
        String message = productPage.checkMessage();
        Assert.assertEquals(message, expected);
    }

}
