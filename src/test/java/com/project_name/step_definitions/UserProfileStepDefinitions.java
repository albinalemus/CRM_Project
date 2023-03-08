package com.project_name.step_definitions;

import com.project_name.pages.HomePage;
import com.project_name.pages.LoginPage;
import com.project_name.utilities.ConfigurationReader;
import com.project_name.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserProfileStepDefinitions {

HomePage homePage = new HomePage();
LoginPage loginPage = new LoginPage();

    @Given("users are on the homepage")
    public void users_are_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("hr_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("hr_password"));
        loginPage.submit.click();
    }
    @When("users click the profile name")
    public void users_click_the_profile_name() {
        System.out.println(homePage.userProfile.isEnabled());
        homePage.userProfile.click();

    }


    @Then("verify the users see flowing five options")
    public void verifyTheUsersSeeFlowingFiveOptions() {

        Assert.assertTrue(homePage.myProfileBox.isDisplayed());
        Assert.assertTrue(homePage.EditeProfileSettBox.isDisplayed());
        Assert.assertTrue(homePage.ThemesBox.isDisplayed());
        Assert.assertTrue(homePage.configurationNotBox.isDisplayed());
        Assert.assertTrue(homePage.LogOutBox.isDisplayed());

    }
}
