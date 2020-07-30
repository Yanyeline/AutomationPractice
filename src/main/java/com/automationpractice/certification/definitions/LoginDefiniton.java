package com.automationpractice.certification.definitions;

import com.automationpractice.certification.steps.*;
import cucumber.api.java.After;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;


public class LoginDefiniton {

    @Steps
    HomeStep homeStep;
    @Steps
    AuthenticationStep authenticationStep;
    @Steps
    MyAccountStep myAccountStep;

    @Given("^Im on the home page$")
    public void im_on_the_home_page() throws Exception {
        homeStep.openPage();
    }

    @When("^Im enter in Authentication page$")
    public void im_enter_in_Authentication_page() throws Exception {
        homeStep.clickOnSignIn();

    }

    @When("^I enter email \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void i_enter_email_and_Password(String email, String password) throws Exception {
        authenticationStep.insertEmail(email);
        authenticationStep.insertPassword(password);
    }


    @When("^I click the Sign In button$")
    public void i_click_the_Sign_In_button() throws Exception {
        authenticationStep.clickOnSignInButton();
    }

    @Then("^I go to the \"([^\"]*)\" page$")
    public void i_go_to_the_page(String titlePage) throws Exception {
        Assert.assertTrue(
                "page found is not the same as the expected one", myAccountStep.compareTitlePage(titlePage));

    }

    @After
    public void end() {
        homeStep.closePage();
    }
}
