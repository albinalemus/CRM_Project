package com.project_name.pages;

import com.project_name.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DriveModulePage {
    public DriveModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@title='Drive']")
    public WebElement driveBtn;

    @FindBy(xpath = "//span[@class='main-buttons-item-text-title']")
    public List<WebElement> actualDriverOption;
}
