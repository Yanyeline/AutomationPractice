package com.automationpractice.certification.steps;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

import com.automationpractice.certification.pages.AuthenticationPage;
import net.thucydides.core.annotations.Step;

import java.util.List;
import java.util.Map;

public class AuthenticationStep {

    AuthenticationPage authenticationPage;

    @Step
    public void insertEmail(String email) {
        authenticationPage.insertEmail(email);
    }

    @Step
    public void insertPassword(String password) {
        authenticationPage.insertPassword(password);
    }
    @Step
    public void clickOnSignInButton() {
        authenticationPage.clickOnSignInButton();
    }


}
