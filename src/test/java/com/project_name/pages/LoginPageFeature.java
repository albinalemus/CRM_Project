package com.project_name.pages;

import com.project_name.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFeature {

    public LoginPageFeature(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//label")
    public WebElement rememberMeBox;



}
