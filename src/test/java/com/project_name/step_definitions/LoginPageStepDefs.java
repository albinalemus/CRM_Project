package com.project_name.step_definitions;

import com.project_name.pages.LoginPageFeature;
import com.project_name.utilities.ConfigurationReader;
import com.project_name.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginPageStepDefs {
    LoginPageFeature page =new LoginPageFeature();
    @Given("the users go to the login page")
    public void theUsersGoToTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @Then("Verify the checkbox is clickable")
    public void verifyTheCheckboxIsClickable() {
        Assert.assertTrue(page.rememberMeBox.isEnabled());
    }

    @Then("Verify there is a {string} message displayed")
    public void verifyThereIsARememberMeOnThisComputerMessageDisplayed(String expectedMsg) {
        String actualMsg=page.rememberMeBox.getText();
        Assert.assertEquals(actualMsg,expectedMsg);

    }
}
