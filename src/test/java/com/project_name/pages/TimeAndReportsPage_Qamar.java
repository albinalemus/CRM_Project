package com.project_name.pages;

import com.project_name.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimeAndReportsPage_Qamar {

    public TimeAndReportsPage_Qamar(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Time and Reports']")
    public WebElement timeAndReportModule;

    @FindBy(xpath = "//div[@data-top-menu-id='top_menu_id_timeman']")
    public List<WebElement> timeAndReportsModules;




}
