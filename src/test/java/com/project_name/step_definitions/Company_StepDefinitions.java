package com.project_name.step_definitions;

import com.project_name.pages.HomePage;
import com.project_name.utilities.BrowserUtils;
import com.project_name.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Company_StepDefinitions {

    HomePage homePage = new HomePage();

    @When("users click the Company module")
    public void usersClickTheCompanyModule() {
        homePage.companyBox.click();
    }

    @Then("verify the users see flowing seven options:")
    public void verifyTheUsersSeeFlowingOptions(List<String> expctList) {

        List<String> actualList = BrowserUtils.getElementsText( homePage.companyModules);

        Assert.assertEquals(actualList, expctList);

    }

    @Given("users are on the homepage")
    public void usersAreOnTheHomepage() {

    }
}
