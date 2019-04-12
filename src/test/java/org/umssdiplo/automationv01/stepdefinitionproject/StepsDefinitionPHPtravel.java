package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Brand.Brand;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.dialogo.RegistroDialogo;
import org.umssdiplo.automationv01.core.utils.LoadBrandPage;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Brand brand;
    private RegistroDialogo registroDialogo;

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

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
}
