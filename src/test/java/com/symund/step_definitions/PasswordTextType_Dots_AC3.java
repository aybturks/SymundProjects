package com.symund.step_definitions;

import com.symund.pages.LoginPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PasswordTextType_Dots_AC3 {






    @Then("User can see the password in form of dots by default")
    public void user_can_see_the_password_in_form_of_fots_by_default() {

        LoginPage loginPage =new LoginPage();
        String password = loginPage.password.getAttribute("type");

        Assert.assertEquals(password,"password");
        Driver.closeDriver();
    }



}
