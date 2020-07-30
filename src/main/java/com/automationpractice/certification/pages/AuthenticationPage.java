package com.automationpractice.certification.pages;

import com.automationpractice.certification.utils.Constants;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class AuthenticationPage extends PageObject {


    public void insertEmail(String email) {
        find(By.id("email")).sendKeys(email);
    }

    public void insertPassword(String password) {
        find(By.id("passwd")).sendKeys(password);
    }

    public void clickOnSignInButton() {
        find(By.id("SubmitLogin")).click();
    }

}
