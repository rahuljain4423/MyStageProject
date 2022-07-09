package com.MyStageProject.pageobjects;

import com.MyStageProject.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BaseClass {

    @FindBy(xpath= "//label[@class='semibold']/../div")
    private WebElement checkOutPayment;

    @FindBy(id= "reviewOrderBtn")
    private WebElement reviewOrder;

    public PaymentPage(){
        PageFactory.initElements(getDriver(),this);
    }

    public void setCheckOutPayment(WebElement checkOutPayment) {
        this.checkOutPayment = checkOutPayment;
    }

    public void setReviewOrder(WebElement reviewOrder) {
        this.reviewOrder = reviewOrder;
    }
}
