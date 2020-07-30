package com.automationpractice.certification.definitions;

import com.automationpractice.certification.pages.MyAccount;
import com.automationpractice.certification.steps.*;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.List;


public class MyAccountDefinition {
    @Steps
    MyAccountStep myAccountStep;

    @When("^I click the My Addresses button$")
    public void i_click_the_My_Addresses_button() throws Exception {
        myAccountStep.clickOnMyAddresses();
    }

    @When("^I click the Add a new address button$")
    public void i_click_the_Add_a_new_address_button() throws Exception {
        myAccountStep.clickOnAddNewAddresses();
    }

    @When("^I enter the address data$")
    public void i_enter_the_address_data(List<List<String>> table) throws Exception {
        myAccountStep.insertDataNewAddresses(table);

    }

    @When("^I click the Save button$")
    public void i_click_the_Save_button() throws Exception {
        myAccountStep.clickOnSave();
    }

    @Then("^I register the address \"([^\"]*)\"$")
    public void i_register_the_address(String alias) throws Exception {
        Assert.assertTrue("Unregistered address", myAccountStep.nameResgistreAddress(alias));

    }


}
