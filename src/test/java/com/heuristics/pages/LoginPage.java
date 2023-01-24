package com.heuristics.pages;

import com.heuristics.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[.='Get Started']")
    public WebElement getStartedButton;


    @FindBy (xpath = "//a[.='Arlene Admin']")
    public WebElement ArleneAdminLink;



}
