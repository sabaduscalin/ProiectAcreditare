package org.fasttrackit.pages.admin;

import com.ibm.icu.impl.UResource;
import net.bytebuddy.agent.builder.AgentBuilder;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("http://qa4.fasttrackit.org:8008/wp-admin/edit.php")
public class DashBoardPage extends PageObject {
    @FindBy(css = "#menu-posts-product > a > div.wp-menu-image.dashicons-before.dashicons-admin-post")
    private WebElementFacade product;
    @FindBy(css = "#menu-posts-product > ul > li:nth-child(3) > a")
    private WebElementFacade addNewProduct;
    @FindBy(id = "title")
    private WebElementFacade productName;
    @FindBy(id = "_regular_price")
    private WebElementFacade priceFeald;
    @FindBy(css = " li.inventory_options.inventory_tab.show_if_simple.show_if_variable.show_if_grouped.show_if_external > a > span")
    private WebElementFacade productCategori;
    @FindBy(css = ".show_if_external > a")
    private WebElementFacade inventary;
    @FindBy(css = ".active > a > span")
    private WebElementFacade clickSKU;
    @FindBy(id = "_sku")
    private WebElementFacade skuFeald;
    @FindBy(id = "_manage_stock")
    private WebElementFacade manageStock;
    @FindBy(id = "_stock")
    private WebElementFacade stockSize;
    @FindBy(id = "post-preview")
    private WebElementFacade preview;
    @FindBy(id = "publish")
    private WebElementFacade publish;
    @FindBy(id = "content-html")
    private WebElementFacade text;
    @FindBy(id = "content")
    private WebElementFacade content;
    @FindBy(id = "wpbody-content")
    private List<WebElementFacade> bodyContent;
    @FindBy(css = "#menu-posts-product > a > div.wp-menu-name")
    private WebElementFacade getProduct;
    @FindBy(id = "post-search-input")
    private WebElementFacade searchFeald;
    @FindBy(id = "search-submit")
    private WebElementFacade searchButton;

    @FindBy(css = ".column-primary > strong > a")
    private WebElementFacade clickOnProduct;
    @FindBy(css = ".is-dismissible> p >a")
    private WebElementFacade viewProdictButton;
    @FindBy(css = "#submitdiv > button > span.toggle-indicator")
    private WebElementFacade publishBox;
    @FindBy(css = "#menu-posts-product > a > div.wp-menu-name")
    private WebElementFacade goToProduct;
    @FindBy(id = "cb-select-all-1")
    private WebElementFacade selectAll;
    @FindBy(id = "bulk-action-selector-top")
    private WebElementFacade actions;
    @FindBy(css = "#bulk-action-selector-top > option:nth-child(3)")
    private WebElementFacade trash;
    @FindBy(id = "doaction")
    private WebElementFacade applyButton;


    public void clickAdminPost() {
        waitFor(product);
        clickOn(product);
    }

    public void clickAddNewProduct() {
        clickOn(addNewProduct);
    }

    public void setName(String name) {
        typeInto(productName, name);
    }

    public void setPrice(String price) {
        typeInto(priceFeald, price);
    }

    public void setProductCategori() {
        clickOn(productCategori);
    }

    public void clickInventary() {
        clickOn(inventary);
    }

    public void clickSKU() {
        clickOn(clickSKU);
    }

    public void typeSku(String sku) {
        typeInto(skuFeald, sku);
    }

    public void clickManageStock() {
        if (manageStock.isDisabled())
            clickOn(manageStock);
    }

    public void enableManageStock() {
        clickOn(manageStock);
    }


    public void setStockSize(String size) {
        typeInto(stockSize, size);
        stockSize.sendKeys(Keys.ENTER);
    }

    public void clickPublish() {
        clickOn(publish);
    }

    public void clickProduct() {
        clickOn(getProduct);
    }

    public void typeProduct(String name) {
        typeInto(searchFeald, name);
    }

    public void clickSearchButton() {
        clickOn(searchButton);
    }

    public void setClickOnProduct() {
        clickOn(clickOnProduct);
    }

    public void clickViewProdictButton() {
        clickOn(viewProdictButton);
    }

    public void clickPublishBox() {
        clickOn(publishBox);
    }

    public void clickProductCategory() {
        clickOn(goToProduct);
    }

    public void clickSelectAll() {
        clickOn(selectAll);
    }

    public void clickActions() {
        clickOn(actions);
    }

    public void clickTrash() {
        clickOn(trash);
    }

    public void clickApply() {
        clickOn(applyButton);
    }
}
