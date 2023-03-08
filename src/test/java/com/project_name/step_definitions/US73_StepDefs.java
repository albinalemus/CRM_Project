package com.project_name.step_definitions;

import com.project_name.pages.MenuConfigurationPage_Amal;

import com.project_name.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US73_StepDefs {
    MenuConfigurationPage_Amal page = new MenuConfigurationPage_Amal();
    @When("users click the CONFIGURE MENU option")
    public void users_click_the_configure_menu_option() {

        page.configurationMenu.click();

    }


    @Then("verify the users see flowing six options:")
    public void verify_the_users_see_flowing_options(List<String> expected_popup_options) {


        List<String> elementsText = BrowserUtils.getElementsText(page.configurationMenuOptions);
          Assert.assertEquals(elementsText,expected_popup_options);



        }

    }



