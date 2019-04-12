package org.umssdiplo.automationv01.core.managepage.dialogo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class RegistroDialogo extends BasePage {

    @FindBy(xpath = "/html/body/app-root/app-shell/div/mat-sidenav-container/mat-sidenav-content/app-home/mat-list/div/div/button/span/mat-icon")
    private WebElement newBrandBtn;

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-brand-form/form/mat-dialog-content/div/mat-form-field/div/div[1]/div[3]")
    private WebElement containerDialog;

    @FindBy(id = "name")
    private WebElement brandNameField;

    @FindBy(xpath = "//*[@id=\"save\"]/span")
    private WebElement saveBrandBtn;

    public RegistroDialogo() {
        CommonEvents.waitWebElementVisible(containerDialog);
    }

    public void insertBrandName(String nameBrand){

        String nameB = PropertyAccessor.getInstance().getName();
        CommonEvents.setInputField(brandNameField, nameB);

    }
    public void saveBrandName (){

        CommonEvents.clickButton(saveBrandBtn);

    }
}
