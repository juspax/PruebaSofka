package com.saucedemo.definitions;

import com.saucedemo.models.PurchaseModel;
import com.saucedemo.steps.PurchaseStep;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class PurchaseDefinitions {

    @Steps
    PurchaseStep purchaseStep;

    @Given("I access the initial platform to make the purchase process")
    public void iAccessTheInitialPlatformToMakeThePurchaseProcess() {purchaseStep.openApplication();}
    @When("I enter the platform")
    public void iEnterThePlatform(List<List<String>> listRegister) {
        PurchaseModel loginUser = new PurchaseModel(listRegister);
        purchaseStep.createRecord(loginUser);

    }
    @Then("Verify the correct purchase {string}")
    public void verifyTheCorrectPurchase(String message) {
        purchaseStep.verifyMessage(message);

    }

    @After
    public void closebrowser() {
        purchaseStep.closebrowser();
    }

}
