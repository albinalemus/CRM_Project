package com.project_name.step_definitions;

import com.project_name.pages.DriveModulePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class DriveModule_StepDefinition {
    DriveModulePage driveModulePage = new DriveModulePage();
    @Given("users are on the homepage")
    public void users_are_on_the_homepage() {

    }
    @When("users click the Drive module")
    public void users_click_the_drive_module() {
       driveModulePage.driveBtn.click();

    }

    @Then("verify the users see flowing six options")
    public void verifyTheUsersSeeFlowingSixOptions(List<String> expectedDriveOptions) {

        for (int i = 0; i <expectedDriveOptions.size() ; i++) {
            Assert.assertEquals(driveModulePage.actualDriverOption.get(i).getText(), expectedDriveOptions.get(i));
        }


    }
}
