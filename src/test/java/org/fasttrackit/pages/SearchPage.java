package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import javax.xml.bind.annotation.W3CDomHandler;
import java.util.List;

public class SearchPage extends PageObject {
    @FindBy(css = "div.fa.fa-search.header-search-button")
    private WebElementFacade searchButton;
    @FindBy(css = " form > input.search-field")
    private WebElementFacade searchFeald;
    @FindBy(css = "input[type=submit]:nth-child(2)")
    private WebElementFacade searchPtoduct;
    @FindBy(css = ".entry-summary > h1")
    private WebElementFacade text;
    @FindBy(css = "#azera_shop_id_CdWiAFnxU5 > div.azera_shop_grid_col_2.azera_shop_grid_column_2.azera_shop_grid_last > li > a.woocommerce-LoopProduct-link.woocommerce-loop-product__link > h2")
    private WebElementFacade tShortText;
    @FindBy(css = "#azera_shop_id_p8JVgczcFq > div.azera_shop_grid_col_2.azera_shop_grid_column_2.azera_shop_grid_last > li > a.button.product_type_simple.add_to_cart_button.ajax_add_to_cart")
    private List<WebElementFacade> productInList;
    @FindBy(css = "#primary > header")
    private WebElementFacade result;
    @FindBy(css = "body")
    private List<WebElementFacade> shopResult;
    @FindBy(css = ".product-type-grouped > a.button.product_type_grouped")
    private WebElementFacade viewProduct;
    @FindBy(css = "#product-87 > div.summary.entry-summary > h1")
    private WebElementFacade textParagraf;
    @FindBy(css = " li.post-48.product.type-product.status-publish.has-post-thumbnail.product_cat-accessories-clothing.instock.sale.taxable.shipping-taxable.purchasable.product-type-simple > a.button.product_type_simple.add_to_cart_button.ajax_add_to_cart")
    private WebElementFacade addToCart;


    public void clickSearchButton() {
        waitFor(searchButton);
        clickOn(searchButton);
    }

    public void tipeInSearchFeald(String product) {
        clickOn(searchFeald);
        waitFor(searchFeald);
        typeInto(searchFeald, product);
    }

    public void clickToSearchProduct() {
        clickOn(searchPtoduct);
    }

    public String checkText() {
        return text.getText();

    }

    public void selectProductInList(String name) {
        for (WebElementFacade product : productInList) {
            if (product.find(By.cssSelector(".shipping-taxable.product-type-grouped > a.woocommerce-LoopProduct-link.woocommerce-loop-product__link > h2")).getText().equals(name))
                ;

        }
        clickOn(viewProduct);

    }

    public String seeResult() {
        return result.getText();
    }

    public String checkTextParagraf() {
        return textParagraf.getText();
    }


    public boolean setProductInList(String name) {
        for (WebElementFacade product : productInList) {
            if (product.find(By.cssSelector(".first.instock.taxable.shipping-taxable.purchasable.product-type-simple > a.woocommerce-LoopProduct-link.woocommerce-loop-product__link > h2")).getText().equals(name))
                ;
        }
        return true;
    }

}
