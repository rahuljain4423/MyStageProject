package com.MyStageProject.pageobjects;

import com.MyStageProject.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class ShippingAddressPage extends BaseClass {

    @FindBy(id = "emailAddressShippingAddress")
    private WebElement mailAddressBox;

    @FindBy(id= "firstnameShippingAddress")
    private WebElement firstName;

    @FindBy(id= "lastnameShippingAddress")
    private WebElement lastName;

    @FindBy(id = "streetAddressShippingAddress")
    private WebElement streetAddress;

    @FindBy(name= "suiteOrAptNumber")
    private WebElement SuiteNo;

    @FindBy(id= "cityShippingAddress")
    private WebElement cityName;

    @FindBy(name = "state")
    private WebElement selectState;

    @FindBy(id= "zipCodeShippingAddress")
    private WebElement postCode;

    @FindBy(id= "telephoneShippingAddress")
    private WebElement phoneNo;

    @FindBy(xpath = "//button[text()='NEXT']")
    private WebElement NextBtn;

    @FindBy(xpath= "(//a[text()='USE my entry'])[1]")
    private WebElement clickOnUseMyEntery;

    @FindBy(xpath= "//label[@class='semibold']/../div")
    private WebElement checkOutPayment;

    public ShippingAddressPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public void setMailAddressBox(WebElement mailAddressBox) {
        this.mailAddressBox = mailAddressBox;
    }

    public void setFirstName(WebElement firstName,String username) {
        this.firstName = firstName;
        firstName.sendKeys(username);
    }
    public void setLastName(WebElement lastName,String password) {
        this.lastName = lastName;
        lastName.sendKeys(password);
    }

    public void setStreetAddress(WebElement streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setSuiteNo(WebElement suiteNo) {
        this.SuiteNo = suiteNo;
    }

    public void setCityName(WebElement cityName) {
        this.cityName = cityName;
    }
    public void setSelectState(WebElement selectState) {
        this.selectState = selectState;
    }
    public void setPostCode(WebElement postCode) {
        this.postCode = postCode;
    }

    public void setPhoneNo(WebElement phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setNextBtn(WebElement nextBtn) {
       this.NextBtn = nextBtn;
    }

    public void setClickOnUseMyEntery(WebElement clickOnUseMyEntery) {
        this.clickOnUseMyEntery = clickOnUseMyEntery;
    }

    public PaymentPage setCheckOutPayment(WebElement checkOutPayment) {
        this.checkOutPayment= checkOutPayment;
        return new PaymentPage();

    }
}
