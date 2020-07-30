package com.automationpractice.certification.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/myAccount.feature",
        glue = {"com.automationpractice.certification.definitions"}
)
public class MyAccount {
}
