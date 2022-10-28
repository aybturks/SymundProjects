package com.symund.step_definitions;

import com.symund.pages.LoginPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PasswordTextType_Text_AC4 {
    @When("click to eyes button")
    public void click_to_eyes_button() {
        LoginPage loginPage = new LoginPage();
        loginPage.ButtonChangeTypePassword.click();

    }


    @Then("User can see the password in form of text")
    public void user_can_see_the_password_in_form_of_text() {

        LoginPage loginPage =new LoginPage();
        String password = loginPage.password.getAttribute("type");
        Assert.assertEquals(password,"text");
        Driver.closeDriver();
    }




}
