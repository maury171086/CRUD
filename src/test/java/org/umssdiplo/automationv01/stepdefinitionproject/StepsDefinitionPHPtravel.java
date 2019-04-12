package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.dialogo.RegistroDialogo;
import org.umssdiplo.automationv01.core.managepage.Brand.Brand;
import org.umssdiplo.automationv01.core.utils.LoadBrandPage;

public class StepsDefinitionPHPtravel {
    private Brand Brand;
    private RegistroDialogo registerDialog;
    private RegistroDialogo editDialog;


    @Given("^'Brand' page is loaded$")
    public void brandPageIsLoaded() throws Throwable {
        Brand = LoadBrandPage.brandPage();
    }

    @And("^click on 'new brand' button in 'Brand' page$")
    public void clickOnNewBrandButtonInBrandPage() {
        registerDialog = Brand.clickPlusIcon();
    }

    @And("^insert \"([^\"]*)\" brand name field in 'Dialog Brand' page$")
    public void insertBrandNameFieldInDialogBrandPage(String nameBrand) throws Throwable {
        registerDialog.insertBrandName(nameBrand);
    }


    @And("^click on 'save' button in 'Dialog Brand' page$")
    public void clickOnSaveButtonInDialogBrandPage() {
        registerDialog.clickSave();
    }

    @And("^edit \"([^\"]*)\" brand name field in 'Edit Dialog Brand' page$")
    public void editBrandNameFieldInDialogBrandPage(String brandName) throws Throwable {
        editDialog.insertBrandName(brandName);
    }


    @And("^click on 'save' button in 'Edit Dialog Project' page$")
    public void clickOnEditButtonInDialogBrandPage() {
        editDialog.clickSave();
    }

    @And("^click edit brand \"([^\"]*)\" in 'Brand' page$")
    public void clickEditBrandInBrandPage(String brandName) throws Throwable {
        editDialog = Brand.clickEditIcon(brandName);
    }

}
