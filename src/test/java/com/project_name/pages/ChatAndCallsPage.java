package com.project_name.pages;

import com.project_name.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class ChatAndCallsPage {

    public ChatAndCallsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='bx-desktop-tab-im']")
    public WebElement messages;

    @FindBy(xpath = "//div[@id='bx-desktop-tab-notify']")
    public WebElement notifications;

    @FindBy(xpath = "//div[@id='bx-desktop-tab-config']")
    public WebElement settings;

    @FindBy(xpath = "//div[@id='bx-desktop-tab-im-lf']")
    public WebElement activityStream;

    @FindBy(xpath = "//a[@title='Chat and Calls']")
    public WebElement chatAndCallsModule;

    @FindBy(xpath = "//div[contains(@id,'bx-desktop-tab')]")
    public List<WebElement> callAndChatModules;


}