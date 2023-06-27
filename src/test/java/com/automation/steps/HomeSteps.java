package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Then;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Then("verify user is navigated to homepage")
    public void verify_user_is_navigated_to_homepage() {
        homePage.verifyHomePage();
    }
}
