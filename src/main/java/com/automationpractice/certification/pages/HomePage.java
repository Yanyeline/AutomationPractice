package com.automationpractice.certification.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import com.automationpractice.certification.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

@DefaultUrl(Constants.URL_AUTOMATION_PRACTICE)

public class HomePage extends PageObject {


    public void clickOnSignIn() {
        $("//a[@class='login']").click();
    }




}
