package com.automationpractice.certification.steps;

import com.automationpractice.certification.pages.AuthenticationPage;
import com.automationpractice.certification.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Before;

public class HomeStep {

    HomePage homePage;


    @Step
    public void openPage() {
        homePage.open();
    }

    @Step
    public void closePage() {
        homePage.getDriver().quit();
    }

    @Step
    public void clickOnSignIn() {
        homePage.clickOnSignIn();
    }


}
