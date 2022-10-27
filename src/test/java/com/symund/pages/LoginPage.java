package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="user")
        public WebElement username;

    @FindBy(id = "password")
    public WebElement password;


    @FindBy(id = "submit-form")
    public WebElement submit;


    @FindBy(xpath = "//*[@id=\"body-login\"]/div[1]/div/main/div/div/form/fieldset/p[3]")
    public WebElement wrongCredentials;



}






