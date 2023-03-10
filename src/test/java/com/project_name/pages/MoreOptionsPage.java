package com.project_name.pages;

import com.project_name.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MoreOptionsPage {
    public MoreOptionsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-more']")

    public WebElement MoreOptionsPage ;

    @FindBy(xpath = "//span[@class='menu-popup-item-text']")

    public List<WebElement> ActualOptions;
}
