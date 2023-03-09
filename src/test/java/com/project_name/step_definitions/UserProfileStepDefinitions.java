package com.project_name.step_definitions;

import com.project_name.pages.HomePage;
import com.project_name.pages.LoginPage;
import com.project_name.utilities.BrowserUtils;
import com.project_name.utilities.ConfigurationReader;
import com.project_name.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class UserProfileStepDefinitions {

HomePage homePage = new HomePage();
LoginPage loginPage = new LoginPage();


    @When("users click the profile name")
    public void users_click_the_profile_name() {
        System.out.println(homePage.userProfile.isEnabled());
        homePage.userProfile.click();

    }




    @Then("verify the users see flowing five options:")
    public void verifyTheUsersSeeFlowingFiveOptions(List<String> list1) {

        List<String> list2 = BrowserUtils.getElementsText(homePage.myProfileBox);

        Assert.assertEquals(list2, list1);

    }
}
