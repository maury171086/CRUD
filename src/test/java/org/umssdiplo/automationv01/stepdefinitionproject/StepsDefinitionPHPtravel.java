package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Brand.Brand;
import org.umssdiplo.automationv01.core.managepage.dialogo.RegistroDialogo;
import org.umssdiplo.automationv01.core.utils.LoadBrandPage;

public class StepsDefinitionPHPtravel {
    private Brand brand;
    private RegistroDialogo registroDialogo;

    @Given("^'Brand' page is loaded$")
    public void brandPageIsLoaded() throws Throwable {
        brand = LoadBrandPage.brandPage();
    }

    @And("^click on 'new brand' button in 'Brand' page$")
    public void clickOnNewBrandButtonInBrandPage() {
        registroDialogo = brand.clickPlusIcon();
    }

    @And("^insert \"([^\"]*)\" brand name field in 'Dialog Brand' page$")
    public void insertBrandNameFieldInDialogBrandPage(String name) throws Throwable {
        registroDialogo.insertBrandName(name);
    }

    @And("^click on 'save brand' button in 'Brand' page$")
    public void clickOnSaveBrandButtonInBrandPage() {
     //   registroDialogo.saveBrandName();
        registroDialogo = brand.clickPlusIcon2();
    }
}
