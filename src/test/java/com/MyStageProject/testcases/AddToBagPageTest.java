package com.MyStageProject.testcases;

import com.MyStageProject.base.BaseClass;
import com.MyStageProject.pageobjects.AddToBagPage;
import com.MyStageProject.pageobjects.HomePage;
import com.MyStageProject.utility.Log;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class AddToBagPageTest extends BaseClass {
    private HomePage homePage;
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

    @Test(groups = {"Regression", "Sanity"})
    public void AddToBagTest(String productName, String Size) throws InterruptedException {
        Log.startTestCase("addToBagTest");
        homePage = new HomePage();
        addToBagPage = homePage.searchProduct(productName);
        addToBagPage.clickOnAddToBag();
        addToBagPage.clikOnAddToBagButton();
        addToBagPage.clickOnAddToSelectSize(Size);
        addToBagPage.clickOnViewBagBtn();
        Log.endTestCase("addToCartTest");
    }
}
