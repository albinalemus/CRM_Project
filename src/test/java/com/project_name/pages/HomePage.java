package com.project_name.pages;

import com.project_name.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div[class='user-block']")
    public WebElement userProfile;
    @FindBy(xpath = "//div[@style='display: block;']//*[@class='menu-popup-item menu-popup-no-icon ']")
    public List<WebElement> myProfileBox;



}
