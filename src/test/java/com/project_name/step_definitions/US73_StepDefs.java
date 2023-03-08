package com.project_name.step_definitions;

import com.project_name.pages.MenuConfigurationPage_Amal;

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


    //div[@class='menu-popup-items']//span[i]/span[2]
    @Then("verify the users see flowing {int} options:")
    public void verify_the_users_see_flowing_options(Integer expected_number_popup_options, List<String> expected_popup_options) {

        System.out.println("page.configure_menu_items.getText() = " + page.configure_menu_items.getText());
       List actual_popup_options = new ArrayList<>();

       actual_popup_options.addAll(Arrays.asList(page.configure_menu_items.getText() ,page.collapseMenu.getText() ,page.Remove_current_page_from_left_menu.getText(),
               page.Add_custom_menu_item.getText() ,page.Change_primary_tool.getText() , page.Reset_menu.getText()));



       Integer actual_number_of_options = actual_popup_options.size();
        Assert.assertEquals(actual_number_of_options,expected_number_popup_options);
        Assert.assertEquals(actual_popup_options,expected_popup_options);





        }

    }



