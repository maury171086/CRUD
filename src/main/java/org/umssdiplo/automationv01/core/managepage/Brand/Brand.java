package org.umssdiplo.automationv01.core.managepage.Brand;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.dialogo.RegistroDialogo;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Brand extends BasePage {

    @FindBy(xpath = "/html/body/app-root/app-shell/div/mat-sidenav-container/mat-sidenav-content/app-home/mat-list/div/div/button/span/mat-icon")
    private WebElement newBrandBtn;

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-brand-form/form/mat-dialog-content/div/mat-form-field/div/div[1]/div[3]")
    private WebElement containerMat;

    @FindBy(id = "name")
    private WebElement brandNameField;

    @FindBy(xpath = "//*[@id=\"save\"]/span")
    private WebElement saveBrandBtn;

    public RegistroDialogo clickPlusIcon() {
        CommonEvents.clickButton(newBrandBtn);
        CommonEvents.waitWebElementVisible(containerMat);
      //  CommonEvents.clickButton(saveBrandBtn);
        return new RegistroDialogo();
    }

    public RegistroDialogo clickPlusIcon2() {
        CommonEvents.clickButton(saveBrandBtn);
        CommonEvents.waitWebElementVisible(containerMat);
        return new RegistroDialogo();
    }

}
