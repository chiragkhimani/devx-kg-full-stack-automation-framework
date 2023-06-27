package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//img[@class='user-avatar rounded-circle']")
    WebElement userIcon;

    public void verifyHomePage() {
        Assert.assertTrue(userIcon.isDisplayed());
    }
}
