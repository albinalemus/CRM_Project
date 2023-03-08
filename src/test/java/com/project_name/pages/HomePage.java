package com.project_name.pages;

import com.project_name.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div[class='user-block']")
    public WebElement userProfile;
    @FindBy(css = "div[class='menu-popup-items']")
    public WebElement myProfileBox;
    @FindBy(xpath = "//a[.='Edit Profile Settings']")
    public WebElement EditeProfileSettBox;
    @FindBy(xpath = "//a[.='Edit Profile Settings']")
    public WebElement ThemesBox;
    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[4]")
    public WebElement configurationNotBox;
    @FindBy(xpath = "//a[.='Log out']")
    public WebElement LogOutBox;


}
