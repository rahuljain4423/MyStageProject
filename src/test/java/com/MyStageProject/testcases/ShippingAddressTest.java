package com.MyStageProject.testcases;

import com.MyStageProject.base.BaseClass;
import com.MyStageProject.pageobjects.AddToBagPage;
import com.MyStageProject.pageobjects.HomePage;
import com.MyStageProject.pageobjects.LoginPage;
import com.MyStageProject.pageobjects.ShippingAddressPage;
import com.MyStageProject.utility.Log;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ShippingAddressTest extends BaseClass {
    private HomePage homePage;
    private AddToBagPage addToBagPage;
    private LoginPage loginPage;
    private ShippingAddressPage shippingAddressPage;

    @Parameters("browser")
    @BeforeMethod(groups = {"Smoke", "Sanity", "Regression"})
    public void setup(String browser) {
        launchApp(browser);
    }

    @AfterMethod(groups = {"Smoke", "Sanity", "Regression"})
    public void tearDown() {
        getDriver().quit();
    }

    @Test(groups = "Regresssion")
    public void shippingAddressTest(String productName, String Size, WebElement mailAddressBox,WebElement emailid,WebElement pswd) throws InterruptedException {
        Log.startTestCase("shippingAddressTest");
        homePage = new HomePage();
        addToBagPage = homePage.searchProduct(productName);
        addToBagPage.clickOnAddToBag();
        addToBagPage.clikOnAddToBagButton();
        addToBagPage.clickOnAddToSelectSize(Size);
        addToBagPage.clickOnViewBagBtn();
        loginPage = addToBagPage.clickOnCheckNowBtn();
        shippingAddressPage.setMailAddressBox(mailAddressBox);
        shippingAddressPage.setFirstName(emailid);
        shippingAddressPage.setLastName(pswd);
        shippingAddressPage.setStreetAddress(streetAddress);
        shippingAddressPage.setCityName();
        shippingAddressPage.setSuiteNo();
        shippingAddressPage.setCityName();
        shippingAddressPage.setSelectState();
        shippingAddressPage.setPostCode();
        shippingAddressPage.setPhoneNo();
        shippingAddressPage.setNextBtn();
        shippingAddressPage.setClickOnUseMyEntery();
    }
}
