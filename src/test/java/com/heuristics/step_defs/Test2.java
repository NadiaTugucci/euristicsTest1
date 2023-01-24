package com.heuristics.step_defs;

import com.github.javafaker.Faker;
import com.heuristics.pages.AccountRegistrationPage;
import com.heuristics.pages.LoginPage;
import com.heuristics.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test2 {

    LoginPage loginPage = new LoginPage();
    String email = "fakeemail@gmail.com";

    AccountRegistrationPage regPage = new AccountRegistrationPage();

    @When("Fill out the registration form, using an email address that is already in use \\(e.g. listed on the login page)")
    public void fill_out_the_registration_form_using_an_email_address_that_is_already_in_use_e_g_listed_on_the_login_page() {

        regPage.inputEmail.sendKeys(email);
        regPage.submitButton.click();

}

    @Then("The test is considered successful if the user sees an alert message containing a link to the Forgot Password page")
    public void theTestIsConsideredSuccessfulIfTheUserSeesAnAlertMessageContainingALinkToTheForgotPasswordPage() {


        WebElement hereLink = Driver.getDriver().findElement(By.xpath("//*[@id=\"LB_AlertPopupBody\"]/div[1]/a"));
        Assert.assertTrue(hereLink.isDisplayed());
        hereLink.click();

        String messageText = Driver.getDriver().findElement(
                By.xpath("//fieldset[@class='fsView']//legend")).getText();

        Assert.assertEquals("Request Password", messageText);

        Driver.getDriver().navigate().back();



    }

}
