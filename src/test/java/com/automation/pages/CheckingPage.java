package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckingPage extends BasePage {

    @FindBy(id = "Standard Checking")
    WebElement checkingtype;

    @FindBy(id = "Individual")
    WebElement accountownership;

    @FindBy(id = "name")
    WebElement accountName;

    @FindBy(id = "openingBalance")
    WebElement amount;

    @FindBy(id = "newCheckingSubmit")
    WebElement submitbtn;

    @FindBy(id = "page-title")
    WebElement checkingpage;

    public void verifyCheckingPage() {
        Assert.assertTrue(accountName.isDisplayed());
    }

    public void checkingDetails() {
        checkingtype.click();
        accountownership.click();
        accountName.sendKeys("Aidai");
        amount.sendKeys("2020");
    }

    public void clickSubmitbtn() {
        submitbtn.click();
    }


}
