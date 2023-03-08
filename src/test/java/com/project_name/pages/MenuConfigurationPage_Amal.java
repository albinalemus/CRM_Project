package com.project_name.pages;

import com.project_name.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuConfigurationPage_Amal {

    public MenuConfigurationPage_Amal(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@id='left-menu-settings']")
    public WebElement configurationMenu;

    @FindBy(xpath = "//span[.=\"Configure menu items\"]")
    public WebElement configure_menu_items;

    @FindBy(xpath = "//span[.=\"Collapse menu\"]")
    public WebElement collapseMenu;

    @FindBy(xpath = "//span[.=\"Remove current page from left menu\"]")
    public WebElement Remove_current_page_from_left_menu;

    @FindBy(xpath = "//span[.=\"Add custom menu item\"]")
    public WebElement Add_custom_menu_item;

    @FindBy(xpath = "//span[.=\"Change primary tool\"]")
    public WebElement Change_primary_tool;

    @FindBy(xpath = "//span[.=\"Reset menu\"]")
    public WebElement Reset_menu;







}

