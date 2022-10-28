package com.symund.step_definitions;

import com.symund.pages.LoginPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ClickForgotPassword_AC5 {

    @When("User click to forget password button")
    public void user_click_to_forget_password_button() {
        LoginPage loginPage = new LoginPage();
        loginPage.ButtonForgotPassword.click();

    }
    @Then("User should be display reset password page")
    public void user_should_be_display_reset_password_page() {
        LoginPage loginPage =new LoginPage();
        Assert.assertTrue(loginPage.RessetPasswordButton.isDisplayed());
        Driver.closeDriver();
    }



}
