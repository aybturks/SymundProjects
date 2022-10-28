package com.symund.step_definitions;

import com.symund.pages.LoginPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class VerifyPlaceholder_AC6 {
    @Then("User can see valid placeholders on Username and Password fields on loginpage")
    public void userCanSeeValidPlaceholdersOnUsernameAndPasswordFieldsOnLoginpage() {
        LoginPage loginPage = new LoginPage();
        String usernamePlaceHolder =loginPage.username.getAttribute("placeholder");
        String passwordPlaceHolder  = loginPage.password.getAttribute("placeholder");
        Assert.assertEquals(usernamePlaceHolder,"Username");
        Assert.assertEquals(passwordPlaceHolder,"Password");
        Driver.closeDriver();
    }




}
