package com.MyStageProject.pageobjects;

import com.MyStageProject.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseClass {

    private ShippingAddressPage shippingAddressPage;

    @FindBy(id = "email")
    private WebElement emailid;

    @FindBy(id = "passwordSignIn")
    private WebElement pswd;

    @FindBy(xpath = "//button[text()='Sign in']")
    private WebElement clickOnSignInBtn;

    public LoginPage(){
        PageFactory.initElements(getDriver(),this);
    }
    public void setEmailTextBox(WebElement emailid) {
        this.emailid = emailid;
    }

    public void setPasswordtextBox(WebElement pswd) {
        this.pswd = pswd;
    }

    public ShippingAddressPage login(String emailid, String pswd,) throws Throwable {
        action.scrollByVisibilityOfElement(getDriver(), userName);
        action.type(userName, uname);
        action.type(password, pswd);
        action.click(getDriver(), clickOnSignInBtn);
        Thread.sleep(2000);
        return ShippingAddressPage;
    }
}