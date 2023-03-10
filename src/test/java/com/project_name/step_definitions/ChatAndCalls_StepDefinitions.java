package com.project_name.step_definitions;

import com.project_name.pages.ChatAndCallsPage;
import com.project_name.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class ChatAndCalls_StepDefinitions {

    ChatAndCallsPage chatAndCallsPage = new ChatAndCallsPage();
    @When("user clicks on Chat and Calls")
    public void userClicksOnChatAndCalls() {
       chatAndCallsPage.chatAndCallsModule.click();
    }

    @Then("verify user see the following modules")
    public void verifyUserSeeTheFollowingModules(List<String> expectedModules) {

        List<String> actualModules = new ArrayList<>();

        for (WebElement each : chatAndCallsPage.callAndChatModules) {
            actualModules.add(each.getAttribute("title").trim());
        }
        Assert.assertTrue(actualModules.containsAll(expectedModules));

    }
}
