package com.saucedemo.steps;

import com.saucedemo.models.PurchaseModel;
import com.saucedemo.pageObjects.PurchasePageObjects;
import net.thucydides.core.annotations.Step;
import org.hamcrest.MatcherAssert;

import static org.hamcrest.Matchers.containsString;

public class PurchaseStep {

    PurchasePageObjects purchasePageObjects = new PurchasePageObjects();

    @Step
    public void openApplication(){purchasePageObjects.open();}

    @Step
    public void createRecord(PurchaseModel loginUser){

        purchasePageObjects.writeUserName(loginUser.getUsername());
        purchasePageObjects.writePassword(loginUser.getPassword());
        purchasePageObjects.clickLogin();
        purchasePageObjects.clicBolt();
        purchasePageObjects.clicFleece();
        purchasePageObjects.clicShopping();
        purchasePageObjects.clicCheckout();
        purchasePageObjects.writeFirstName(loginUser.getFirstName());
        purchasePageObjects.writeLastName(loginUser.getLastName());
        purchasePageObjects.writeZipCode(loginUser.getPostalCode());
        purchasePageObjects.clicContinue();
        purchasePageObjects.clicFinish();

    }

    @Step
    public void verifyMessage(String message) {
        MatcherAssert.assertThat(purchasePageObjects.getTextElement(), containsString(message));
    }

    public void closebrowser() {
        purchasePageObjects.getDriver().close();
    }
}
