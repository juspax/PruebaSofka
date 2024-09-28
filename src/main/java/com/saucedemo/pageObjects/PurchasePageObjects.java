package com.saucedemo.pageObjects;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.Base.url")
public class PurchasePageObjects extends PageObject {

    public static final By TXT_USERNAME = By.xpath("//input[@id='user-name']");
    public static final By TXT_PASSWORD = By.xpath("//input[@id='password']");
    public static final By BTN_LOGIN = By.xpath("//input[@id='login-button']");
    public static final By BTN_BOLT = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
    public static final By BTN_FLEECE = By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
    public static final By BTN_SHOPPING_CART = By.xpath("//a[@class='shopping_cart_link']");
    public static final By BTN_CHECKOUT = By.xpath("//button[@id='checkout']");
    public static final By TXT_FIRST_NAME = By.xpath("//input[@id='first-name']");
    public static final By TXT_LAST_NAME = By.xpath("//input[@id='last-name']");
    public static final By TXT_ZIP_CODE = By.xpath("//input[@id='postal-code']");
    public static final By BTN_CONTINUE = By.xpath("//input[@id='continue']");
    public static final By BTN_FINISH = By.xpath("//button[@id='finish']");
    public static final By LABEL_NAME = By.xpath("(//h2[normalize-space()='Thank you for your order!'])[1]");







    public void writeUserName(String userName) {getDriver().findElement(TXT_USERNAME).sendKeys(userName);}
    public void writePassword(String password) {getDriver().findElement(TXT_PASSWORD).sendKeys(password);}
    public void clickLogin() {getDriver().findElement(BTN_LOGIN).click();}
    public void clicBolt(){getDriver().findElement(BTN_BOLT).click();}
    public void clicFleece() {getDriver().findElement(BTN_FLEECE).click();}
    public void clicShopping() {getDriver().findElement(BTN_SHOPPING_CART).click();}
    public void clicCheckout() {getDriver().findElement(BTN_CHECKOUT).click();}
    public void writeFirstName(String firstName) {getDriver().findElement(TXT_FIRST_NAME).sendKeys(firstName);}
    public void writeLastName(String lastName ) {getDriver().findElement(TXT_LAST_NAME).sendKeys(lastName);}
    public void writeZipCode(String postalCode) {getDriver().findElement(TXT_ZIP_CODE).sendKeys(postalCode);}
    public void clicContinue() {getDriver().findElement(BTN_CONTINUE).click();}
    public void clicFinish() {getDriver().findElement(BTN_FINISH).click();}

    public String getTextElement() {
        String message = getDriver().findElement(LABEL_NAME).getText();
        return message;
    }

}
