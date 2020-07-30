package com.automationpractice.certification.pages;

import java.util.List;

import cucumber.api.DataTable;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyAccount extends PageObject {

    private List<String> columns;

    public String titlePage() {
        String tab = getDriver().getWindowHandle();
        String name = getDriver().switchTo().window(tab).getTitle();
        return name;
    }

    public void clickOnMyAddresses() {
        $("*//li//a[contains(@title,'Addresses')]").click();
    }

    public void clickOnAddNewAddresses() {
        $("*//div[@class='clearfix main-page-indent']//a[contains(@title,'Add an address')]").click();
    }

    public void insertFirstName(String firstName) {
        WebElement element =
                getDriver().findElement(By.id("firstname"));
        element.clear();
        element.sendKeys(firstName);
    }

    public void insertLastName(String lastName) {
        WebElement element =
                getDriver().findElement(By.id("lastname"));
        element.clear();
        element.sendKeys(lastName);
    }

    public void insertCompany(String company) {
        WebElement element =
                getDriver().findElement(By.id("company"));
        element.clear();
        element.sendKeys(company);
    }

    public void insertAddress1(String address1) {
        WebElement element =
                getDriver().findElement(By.id("address1"));
        element.clear();
        element.sendKeys(address1);
    }

    public void insertAddress2(String address2) {
        WebElement element =
                getDriver().findElement(By.id("address2"));
        element.clear();
        element.sendKeys(address2);
    }

    public void insertCity(String city) {
        WebElement element =
                getDriver().findElement(By.id("city"));
        element.clear();
        element.sendKeys(city);
    }

    public void selectState(String state) {
        $("*//select[@id='id_state']//option[contains(text(),'" + state + "')]").click();
    }

    public void insertPostalCode(String postCode) {
        WebElement element =
                getDriver().findElement(By.id("postcode"));
        element.clear();
        element.sendKeys(postCode);
    }

    public void selectCountry(String country) {
        //Select dropdown = new Select(getDriver().findElement(By.id("id_country")));
        // dropdown.selectByVisibleText(country);
        $("*//select[@id='id_country']//option[contains(text(),'" + country + "')]").click();

    }

    public void insertHomePhone(String homePhone) {
        WebElement element =
                getDriver().findElement(By.id("phone"));
        element.clear();
        element.sendKeys(homePhone);
    }

    public void insertMobilePhone(String mobilephone) {
        WebElement element =
                getDriver().findElement(By.id("phone_mobile"));
        element.clear();
        element.sendKeys(mobilephone);
    }

    public void insertOther(String other) {
        WebElement element =
                getDriver().findElement(By.id("other"));
        element.clear();
        element.sendKeys(other);
    }

    public void insertAlias(String alias) {
        WebElement element =
                getDriver().findElement(By.id("alias"));
        element.clear();
        element.sendKeys(alias);
    }

    public void clickOnSave() {
        find(By.id("submitAddress")).click();
    }


    public void insertDataNewAddresses(List<List<String>> table) {

        //List<List<String>> rows = table.asLists(String.class);

        // for (List<String> columns : rows) {

        insertFirstName(table.get(1).get(0));
        insertLastName(table.get(1).get(1));
        insertCompany(table.get(1).get(2));
        insertAddress1(table.get(1).get(3));
        insertAddress2(table.get(1).get(4));
        insertCity(table.get(1).get(5));
        selectState(table.get(1).get(6));
        insertPostalCode(table.get(1).get(7));
        selectCountry(table.get(1).get(8));
        insertHomePhone(table.get(1).get(9));
        insertMobilePhone(table.get(1).get(10));
        insertOther(table.get(1).get(11));
        insertAlias(table.get(1).get(12));
        //  }

    }

    public boolean nameResgistreAddress(String alias) {
        WebElement element =
                getDriver().findElement(By.xpath("*//div[@class='addresses']//ul//li//h3[contains(text(),'" + alias + "')]"));
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }

    }

}
