package com.project_name.step_definitions;

import com.project_name.pages.LogOutPage;
import com.project_name.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogOut_StepDefinition {
    LogOutPage logOutPage = new LogOutPage();

    @Given("user is on any page of the app")
    public void user_is_on_any_page_of_the_app() {

    }
    @When("users click the user profile name")
    public void users_click_the_user_profile_name() {
        logOutPage.userProfileName.click();

    }
    @When("users select the “Log Out” option")
    public void users_select_the_log_out_option() {
        logOutPage.logOutBtn.click();

    }
    @Then("verify the user back to the login page")
    public void verify_the_user_back_to_the_login_page() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle ="Authorization";

        Assert.assertEquals(expectedTitle,actualTitle);

    }
}
