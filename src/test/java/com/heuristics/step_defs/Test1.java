package com.heuristics.step_defs;

import com.github.javafaker.Faker;
import com.heuristics.pages.AccountRegistrationPage;
import com.heuristics.pages.LoginPage;
import com.heuristics.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class Test1 {

    LoginPage loginPage = new LoginPage();
    String email = "fakeemail@gmail.com";

    AccountRegistrationPage regPage = new AccountRegistrationPage();

    @Given("Click the orange Get Started button in the upper-left part of the login page")
    public void click_the_orange_get_started_button_in_the_upper_left_part_of_the_login_page() {

        loginPage.getStartedButton.click();
    }

    @When("Fill out the registration form and submit it")
    public void fill_out_the_registration_form_and_submit_it() {

        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();

        String password = faker.internet().password(8, 10, true, true, true );

        regPage.inputEmail.sendKeys(email);
        regPage.inputConfirmEmail.sendKeys(email);

        regPage.inputPassword.sendKeys(password);
        regPage.inputConfirmPassword.sendKeys(password);

        regPage.inputFirstName.sendKeys(firstName);
        regPage.inputLastName.sendKeys(lastName);

        regPage.submitButton.click();

    }

    @Then("The test is considered successful if the user is redirected to the {string} page")
    public void the_test_is_considered_successful_if_the_user_is_redirected_to_the_page(String expectedMessage) {

        WebElement emailConfirmationMessage = Driver.getDriver().findElement(By.xpath("//div[@id='responsive-main']//legend"));
        String actualMessage = emailConfirmationMessage.getText();

        Assert.assertEquals(expectedMessage, actualMessage);

    }
}
