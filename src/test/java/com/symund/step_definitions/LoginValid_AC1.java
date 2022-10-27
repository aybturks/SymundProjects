package com.symund.step_definitions;

import com.symund.pages.LoginPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginValid_AC1 {

    LoginPage loginpage = new LoginPage();


    @Given("User is on to login page")
    public void user_is_on_to_login_page() {
        Driver.getDriver().get("https://qa.symund.com/");
    }

    @When("User enter id")
    public void user_enter_id() {
        loginpage.username.sendKeys("Employee91");
    }
    @When("User enter password")
    public void user_enter_password() {
        loginpage.password.sendKeys("Employee123");
                loginpage.submit.click();
    }
    @Then("User should be able to display dashboard page")
    public void user_should_be_able_to_display_dashboard_page() {
        String actualTittle = Driver.getDriver().getTitle();
        String expectedTittle = "Dashboard - Symund - QA";
        Assert.assertEquals(actualTittle,expectedTittle);
    }

}
