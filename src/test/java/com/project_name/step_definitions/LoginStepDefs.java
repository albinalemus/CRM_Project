package com.project_name.step_definitions;

import com.github.javafaker.Faker;
import com.project_name.pages.LoginPage;
import com.project_name.utilities.ConfigurationReader;
import com.project_name.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username = null;
        String password = null;

        if (userType.equalsIgnoreCase("hr")) {
            username = ConfigurationReader.getProperty("hr_username");
            password = ConfigurationReader.getProperty("hr_password");
        } else if (userType.equalsIgnoreCase("help desk")) {
            username = ConfigurationReader.getProperty("help_desk_username");
            password = ConfigurationReader.getProperty("help_desk_password");
        } else if (userType.equalsIgnoreCase("marketing")) {
            username = ConfigurationReader.getProperty("marketing_username");
            password = ConfigurationReader.getProperty("marketing_password");
        }
        //send username and password and login
        loginPage.login(username, password);
    }




    @And("user clicks the login button")
    public void user_clicks_the_login_button() {
        loginPage.submit.click();
    }

    @Then("verify the user should be at the home page")
    public void verify_the_user_should_be_at_the_home_page() {
        String actual = Driver.getDriver().getCurrentUrl();
        String expected = "https://qa.nextbasecrm.com/stream/?login=yes";

        Assert.assertTrue(actual.equals(expected));

    }

    @When("the user types in invalid credentials")
    public void theUserTypesInInvalidCredentials() {
        Faker faker = new Faker();
        loginPage.userName.sendKeys(faker.internet().emailAddress());
        loginPage.password.sendKeys(faker.internet().password());
        
    }

    @Then("user should see error message")
    public void userShouldSeeErrorMessage() {
        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = loginPage.errorMessage.getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Given("the user is already on the login page")
    public void theUserIsAlreadyOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @And("user then clicks the login button")
    public void userThenClicksTheLoginButton() {

            loginPage.submit.click();
    }
}
