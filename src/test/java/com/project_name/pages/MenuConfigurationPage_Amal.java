package com.project_name.pages;

import com.project_name.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MenuConfigurationPage_Amal {

    public MenuConfigurationPage_Amal(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@id='left-menu-settings']")
    public WebElement configurationMenu;

    @FindBy(xpath = "//div[@class='menu-popup-items']//span//span[2]")
    public List<WebElement> configurationMenuOptions;










}

