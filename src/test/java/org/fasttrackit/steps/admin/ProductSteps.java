package org.fasttrackit.steps.admin;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.admin.DashBoardPage;
import org.fasttrackit.pages.admin.ProductPage;
import org.junit.Assert;

public class ProductSteps {
    private DashBoardPage dashBoardPage;
    private ProductPage productPage;
    private HomePage homePage;

    @Step
    public void addNewProduct() {
        dashBoardPage.clickAdminPost();
        dashBoardPage.clickAddNewProduct();
    }

    @Step
    public void completProductDetails(String name, String price, String sku, String quantity) {
        dashBoardPage.setName(name);
        dashBoardPage.setPrice(price);
        dashBoardPage.setProductCategori();
        dashBoardPage.clickInventary();
        dashBoardPage.clickSKU();
        dashBoardPage.typeSku(sku);
        dashBoardPage.enableManageStock();
        dashBoardPage.setStockSize(quantity);

    }


    @Step
    public void clickInventary() {
        dashBoardPage.clickInventary();
    }

    @Step
    public void manageStock() {
        dashBoardPage.clickManageStock();
    }

    @Step
    public void setStockQuantity(String quantity) {
        dashBoardPage.setStockSize(quantity);
    }

    @Step
    public void clickPublish() {
        dashBoardPage.clickPublish();
    }

    @Step
    public void clickProduct() {
        dashBoardPage.clickProduct();
    }

    @Step
    public void typeInSearchFeald(String name) {
        dashBoardPage.typeProduct(name);
    }

    @Step
    public void clickSearchButton() {
        dashBoardPage.clickSearchButton();
    }

    @Step
    public void clickOnProduct() {
        dashBoardPage.setClickOnProduct();
    }

    @Step
    public void clickViewProduct() {
        dashBoardPage.clickViewProdictButton();
    }

    @Step
    public void checkStock(String expected) {
        String message = productPage.setStockSize();
        Assert.assertEquals(message, expected);
    }

    @Step
    public void checkProductName(String expected) {
        String message = productPage.setProductName();
        Assert.assertEquals(message, expected);
    }

    @Step
    public void clickPublishBox() {
        dashBoardPage.clickPublishBox();
    }

    @Step
    public void clickProductCategory() {
        dashBoardPage.clickProductCategory();
    }

    @Step
    public void delete() {
        dashBoardPage.clickSelectAll();
        dashBoardPage.clickActions();
        dashBoardPage.clickTrash();
        dashBoardPage.clickApply();
    }
}
