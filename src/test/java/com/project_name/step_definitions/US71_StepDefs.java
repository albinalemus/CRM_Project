package com.project_name.step_definitions;

import com.project_name.pages.TimeAndReportsPage_Qamar;
import com.project_name.utilities.BrowserUtils;
import com.project_name.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US71_StepDefs {

    TimeAndReportsPage_Qamar timeAndReportsPage = new TimeAndReportsPage_Qamar();

    @When("users click the Time and Reports module")
    public void users_click_the_time_and_reports_module() {
        timeAndReportsPage.timeAndReportModule.click();

    }
    @Then("verify the users see flowing five options:")
    public void verify_the_users_see_flowing_options(List<String> expectedOptions) {

        List<String> actualOptions = BrowserUtils.getElementsText(timeAndReportsPage.timeAndReportsModules);
        Assert.assertEquals(expectedOptions, actualOptions);
    }


}
