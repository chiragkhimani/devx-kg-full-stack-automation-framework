package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewCheckingAccountPage extends BasePage {

    @FindBy(id = "new-account-msg")
    WebElement confirmationMessage;

    public void verifycheckingAccountPageisDisplayed() {
        Assert.assertTrue(confirmationMessage.isDisplayed());
    }

    public void successMessage() {
        Assert.assertTrue(confirmationMessage.isDisplayed());
    }
}
