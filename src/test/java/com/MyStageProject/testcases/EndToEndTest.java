package com.MyStageProject.testcases;

import com.MyStageProject.base.BaseClass;
import com.MyStageProject.pageobjects.*;
import com.MyStageProject.utility.Log;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EndToEndTest extends BaseClass {
    private HomePage homePage;
    private AddToBagPage addToBagPage;
    private LoginPage loginPage;
    private ShippingAddressPage shippingAddressPage;
    private PaymentPage paymentPage;

    @Parameters("browser")
    @BeforeMethod(groups = {"Smoke","Sanity","Regression"})
    public void setup(String browser) {
        launchApp(browser);
    }

    @AfterMethod(groups = {"Smoke","Sanity","Regression"})
    public void tearDown() {
        getDriver().quit();
    }

    @Test(groups= "Regression")
    public void endToEndTest(String productName, String Size){
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
        paymentPage=shippingAddressPage.setCheckOutPayment(checkOutpayment);
        paymentPage.setReviewOrder(reviewOrder);
        Log.endTestCase("endToEndTest");
    }


    }


