package com.heuristics.pages;

import com.heuristics.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AdminDashboardPage {
    public AdminDashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//a[.='Admin']")
    public WebElement topMenuModule_Admin;

    @FindBy(xpath = "//a[.='Members']")
    public WebElement menuDropdown_Members;

    @FindBy(xpath = "//select[@id='model_RoleId']")
    public WebElement selectDropdown_Role;

    @FindBy(xpath = "//select[@id='model_MemberRoleStatusId']")
    public WebElement selectDropdown_Status;

    @FindBy (xpath = "//input[@id='submit']")
    public WebElement filterButton;


    @FindBy (xpath = "//tbody/tr/td[3]")
    public List<WebElement> memberNames;

    @FindBy (xpath = "//tbody/tr/td[6]")
    public List<WebElement> memberRoles;

    @FindBy (xpath = "//tbody/tr/td[7]")
    public List<WebElement> memberStatuses;
}
