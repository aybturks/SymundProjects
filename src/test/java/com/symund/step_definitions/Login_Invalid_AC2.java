package com.symund.step_definitions;

import com.github.javafaker.Faker;
import com.symund.pages.LoginPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_Invalid_AC2 {


    @When("User hit enter or click login button without credentials show Alert")
    public void userHitEnterOrClickLoginButtonWithoutCredentialsShowAlert() {
        LoginPage loginPage = new LoginPage();
        String usernameRequired = loginPage.username.getAttribute("required");
        String passwordRequired = loginPage.password.getAttribute("required");
        Assert.assertEquals("true", usernameRequired);
        Assert.assertEquals("true", passwordRequired);

    }


    @When("User enter wrong username")
    public void user_enter_wrong_username() {
        Faker faker = new Faker();
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys(faker.name().username());

    }

    @When("User enter wrong password")
    public void user_enter_wrong_password() {
        Faker faker = new Faker();
        LoginPage loginPage = new LoginPage();
        loginPage.password.sendKeys(faker.name().name());
    }

    @And("User should be click submit button")
    public void userShouldBeClickSubmitButton() {
        LoginPage loginPage = new LoginPage();
        loginPage.submit.click();
    }

    @Then("User should be displayed for invalid credentials")
    public void user_should_be_displayed_for_invalid_credentials() {
        LoginPage loginPage = new LoginPage();
        Assert.assertTrue(loginPage.wrongCredentials.isDisplayed());
        Driver.closeDriver();
    }


}


