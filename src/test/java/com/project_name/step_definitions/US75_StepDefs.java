package com.project_name.step_definitions;

import com.project_name.pages.MenuConfigurationPage_Amal;
import com.project_name.pages.MobileAppOptionsPage;
import com.project_name.utilities.BrowserUtils;
import com.project_name.utilities.ConfigurationReader;
import com.project_name.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import java.util.Arrays;
import java.util.List;

public class US75_StepDefs {
    MobileAppOptionsPage page = new MobileAppOptionsPage();
    @Given("users on the main page")
    public void users_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Then("verify the users can see folowing two options:")
    public void verify_the_users_can_see_folowing_two_options(List<String>expected_app_options) {
        List<String> elementsText = BrowserUtils.getElementsText(page.mobileAppOptions);
        Assert.assertEquals(elementsText,expected_app_options);
    }
}

