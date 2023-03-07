package com.project_name.pages;

import com.project_name.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeAndReportsPage_Qamar {

    public TimeAndReportsPage_Qamar(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Time and Reports']")
    public WebElement timeAndReportModule;

    @FindBy(xpath = "(//span[.='Absence Chart'])[1]")
    public WebElement AbsenceChart;

    @FindBy(xpath = "(//span[.='Worktime'])[1]")
    public WebElement Worktime;

    @FindBy(xpath = "(//span[.='Bitrix24.Time'])[1]")
    public WebElement Bitrix24_Time;

    @FindBy(xpath = "(//span[.='Work Reports'])[1]")
    public WebElement workReports;

    @FindBy(xpath = "(//span[.='Meetings and Briefings'])[1]")
    public WebElement meetingsAndBriefings;



}
