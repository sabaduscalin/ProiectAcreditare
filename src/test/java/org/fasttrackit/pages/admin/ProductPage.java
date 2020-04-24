package org.fasttrackit.pages.admin;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageObject {
    @FindBy(css =" p.stock.in-stock")
    private WebElementFacade stockSize;
    @FindBy(css = ".entry-summary > h1")
    private WebElementFacade productName;

    public String setStockSize(){return stockSize.getText();}
    public String setProductName(){return productName.getText();}
}

