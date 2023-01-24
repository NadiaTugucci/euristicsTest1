package com.heuristics.pages;

import com.heuristics.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPage {

    public AccountRegistrationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@id='Email']")
    public WebElement inputEmail ;

    @FindBy (xpath = "//input[@id='ConfirmEmail']")
    public WebElement inputConfirmEmail ;

    @FindBy (xpath = "//input[@id='Password']")
    public WebElement inputPassword;

    @FindBy (xpath = "//input[@id='ConfirmPassword']")
    public WebElement inputConfirmPassword;

    @FindBy (xpath = "//input[@id='FirstName']")
    public WebElement inputFirstName ;

    @FindBy (xpath = "//input[@id='LastName']")
    public WebElement inputLastName;

    @FindBy (xpath = "//input[@name='Submit']")
    public WebElement submitButton ;



}
