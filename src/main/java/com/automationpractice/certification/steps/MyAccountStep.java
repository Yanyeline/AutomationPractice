package com.automationpractice.certification.steps;

import com.automationpractice.certification.pages.MyAccount;
import net.thucydides.core.annotations.Step;
import cucumber.api.DataTable;

import java.util.List;

public class MyAccountStep {
    MyAccount myAccount;

    @Step
    public boolean compareTitlePage(String titlePage) {

        if (myAccount.titlePage().equals(titlePage)) {
            return true;
        } else {
            return false;
        }
    }

    @Step
    public void clickOnMyAddresses() {
        myAccount.clickOnMyAddresses();
    }

    @Step
    public void clickOnAddNewAddresses() {
        myAccount.clickOnAddNewAddresses();
    }

    @Step
    public void insertDataNewAddresses(List<List<String>> table) {
        myAccount.insertDataNewAddresses(table);
    }

    @Step
    public void clickOnSave() {
        myAccount.clickOnSave();
    }
    @Step
    public boolean nameResgistreAddress(String alias) {
       return myAccount.nameResgistreAddress(alias);

    }

}
