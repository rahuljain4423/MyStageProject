package com.MyStageProject.testcases;

import com.MyStageProject.base.BaseClass;
import com.MyStageProject.pageobjects.AddToBagPage;
import com.MyStageProject.pageobjects.HomePage;
import com.MyStageProject.utility.Log;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
    private HomePage homePage;

    @Parameters("browser")
    @BeforeMethod(groups = {"Smoke","Sanity","Regression"})
    public void setup(String browser) {
        launchApp(browser);
    }

    @AfterMethod(groups = {"Smoke","Sanity","Regression"})
    public void tearDown() {
        getDriver().quit();
    }

    @Test(groups = "Smoke")
    public void verifyLogo() throws Throwable {
        Log.startTestCase("verifyLogo");
        homePage = new HomePage();
        boolean result = homePage.validateMyLogo();
        Assert.assertTrue(result);
        Log.endTestCase("verifyLogo");
    }

    @Test(groups = "Smoke")
    public void validateSearchTextBoxTest(){
            Log.startTestCase("validateSearchTextBox");
            Log.endTestCase("validateSearchTextBox");
    }
    @Test(groups = "Smoke")
    public void validateSearchProductTest(String productName) throws InterruptedException {
        Log.startTestCase("searchProductTest");
        homePage = new HomePage();
        homePage.searchProduct(productName);
        Log.endTestCase("searchProductTest");
    }
}



