package com.project_name.step_definitions;

import com.project_name.pages.MoreOptionsPage;
import com.project_name.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class MoreOptionsStepDefinitions {

    MoreOptionsPage page = new MoreOptionsPage();

    @When("users click the MORE tab")
    public void users_click_the_more_tab() {
        page.MoreOptionsPage.click();

    }

    @Then("verify the users see following four options:")
    public void verify_the_users_see_following_four_options(List<String> ExpectedMoreOption) {
        List<String> ActualList = BrowserUtils.getElementsText(page.ActualOptions);
        Assert.assertEquals(ActualList, ExpectedMoreOption);
    }
}
