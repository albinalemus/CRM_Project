package com.project_name.step_definitions;

import com.project_name.pages.DesktopOptions;
import com.project_name.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US04_StepDefs {
    DesktopOptions desktop = new DesktopOptions();
    @Then("verify the users see flowing three desktop options:")
    public void verify_the_users_see_flowing_three_desktop_options(List<String> expected_DesktopOptions) {
        List<String> actualOption = BrowserUtils.getElementsText(desktop.DesktopDownload);
        Assert.assertEquals(actualOption,expected_DesktopOptions);

    }


}