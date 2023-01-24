package com.heuristics.step_defs;

import com.heuristics.pages.AdminDashboardPage;
import com.heuristics.pages.LoginPage;
import com.heuristics.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

    int memberIndex = 0;
    String expecterRole;
    String expectedStatus;

    AdminDashboardPage adminDashboardPage = new AdminDashboardPage();


    @Given("On the login page, click on Arlene Admin to log in as an administrator")
    public void onTheLoginPageClickOnArleneAdminToLogInAsAnAdministrator() {
        new LoginPage().ArleneAdminLink.click();
    }


    @When("In the main nav bar, click on Admin -> Members")
    public void in_the_main_nav_bar_click_on_admin_members() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(adminDashboardPage.topMenuModule_Admin).perform();
        adminDashboardPage.menuDropdown_Members.click();
    }

    @When("In the Role dropdown, select {string}")
    public void in_the_role_dropdown_select(String roleSelect) {

        Select roleDropdown = new Select(adminDashboardPage.selectDropdown_Role);
        roleDropdown.selectByVisibleText(roleSelect);

        expecterRole = roleSelect;
    }

    @When("In the Status dropdown, select {string}")
    public void in_the_status_dropdown_select(String statusSelect) {

        Select statusDropdown = new Select(adminDashboardPage.selectDropdown_Status);
        statusDropdown.selectByVisibleText(statusSelect);

        expectedStatus = statusSelect;
    }


    @When("Click Filter")
    public void click_filter() {

        adminDashboardPage.filterButton.click();
    }



    @When("{string} is included in the search results")
    public void is_included_in_the_search_results(String memberName) {

        List<String> membersStringName = new ArrayList<>();
        for (WebElement eachMemberName : adminDashboardPage.memberNames) {
           membersStringName.add(eachMemberName.getText());
        }

        Assert.assertTrue(membersStringName.contains(memberName));
        memberIndex = membersStringName.indexOf(memberName);

    }

    @Then("The filter criteria \\(Role and Status) retain their values after the results are shown")
    public void the_filter_criteria_role_and_status_retain_their_values_after_the_results_are_shown() {

        Assert.assertEquals(expecterRole, adminDashboardPage.memberRoles.get(memberIndex).getText());
        Assert.assertEquals(expectedStatus, adminDashboardPage.memberStatuses.get(memberIndex).getText());

    }

}
