package com.MyStageProject.testcases;

import com.MyStageProject.base.BaseClass;
import com.MyStageProject.pageobjects.AddToBagPage;
import com.MyStageProject.pageobjects.LoginPage;
import com.MyStageProject.utility.Log;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
    private LoginPage loginPage;
    private AddToBagPage addToBagPage;
    @Parameters("browser")
    @BeforeMethod(groups = {"Smoke", "Sanity", "Regression"})
    public void setup(String browser) {
        launchApp(browser);
    }

    @AfterMethod(groups = {"Smoke", "Sanity", "Regression"})
    public void tearDown() {
        getDriver().quit();
    }

    @Test(groups = {"Smoke","Sanity"})
    public void loginTest(String uname, String pswd, WebElement clickOnSignInBtn) throws Throwable {
        Log.startTestCase("loginTest");
        LoginPage.
        Log.info("user is going to click on SignIn");
        loginPage.setClickOnSignInBtn(clickOnSignInBtn);
        Log.info("Enter Username and Password");
        Log.info("Login is Sucess");
        Log.endTestCase("loginTest");
    }
}
