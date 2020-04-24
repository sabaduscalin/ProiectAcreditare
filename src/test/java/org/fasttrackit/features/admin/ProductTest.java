package org.fasttrackit.features.admin;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.steps.admin.LoginSteps;
import org.fasttrackit.steps.admin.ProductSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class ProductTest extends BaseTest {
    @Steps
    private SearchSteps searchSteps;
    @Steps
    private ProductSteps productSteps;
    @Steps
    private LoginSteps loginSteps;


    @Test
    public void ChangeStockQuantity() {
        loginSteps.navigateToHomePage();
        loginSteps.setCredential();
        loginSteps.clickLogin();
        productSteps.clickProduct();
        productSteps.typeInSearchFeald("polo");
        productSteps.clickSearchButton();
        productSteps.clickOnProduct();
        productSteps.clickInventary();
        productSteps.manageStock();
        productSteps.setStockQuantity("123");
        productSteps.clickViewProduct();
        productSteps.checkStock("123 in stock");
    }


    @Test
    public void CreateNewProduct() {
        loginSteps.login();
        productSteps.addNewProduct();
        productSteps.completProductDetails("Blade", "55", "8989", "123");
        productSteps.clickPublishBox();
        productSteps.clickPublishBox();
        productSteps.clickPublish();
        searchSteps.openHomePage();
        searchSteps.searchForProduct("blade");
        productSteps.checkProductName("BLADE");

    }


    @Test
    public void DeleteProduct() {
        loginSteps.login();
        productSteps.clickProductCategory();
        productSteps.typeInSearchFeald("Blade");
        productSteps.clickSearchButton();
        productSteps.delete();
        searchSteps.openHomePage();
        searchSteps.searchForProduct("Blade");
        searchSteps.checkSearchResult("SEARCH RESULTS: “BLADE”");
    }


}


