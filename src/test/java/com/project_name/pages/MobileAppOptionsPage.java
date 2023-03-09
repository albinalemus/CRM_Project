package com.project_name.pages;

import com.project_name.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MobileAppOptionsPage {
    public MobileAppOptionsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//div[@class='b24-app-block-content'])[2]//a")
    public List<WebElement> mobileAppOptions;

}
















