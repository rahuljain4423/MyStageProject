package com.MyStageProject.pageobjects;

import com.MyStageProject.actiondriver.Action;
import com.MyStageProject.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToBagPage extends BaseClass {
    Action action = new Action();
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement AddToBag;

    @FindBy(xpath = "(//span[@class='size ng-binding'])[1]")
    private WebElement AddToSelectSize;

    @FindBy(xpath = "(//button[text()='Add to bag'])[1]")
    private WebElement AddToBagButton;

    @FindBy(xpath = "//a[text()='VIEW BAG (1)']")
    private WebElement ViewBagBtn;

    @FindBy(xpath="//a[text()='Checkout now']")
    private  WebElement CheckoutNowBtn;

    public AddToBagPage(){
        PageFactory.initElements(getDriver(),this);
    }

    public void clickOnAddToBag(){
        action.click(getDriver(), AddToBag);
    }
    public void clickOnAddToSelectSize(String Size){
        action.click(getDriver(), AddToSelectSize);
    }
    public void clikOnAddToBagButton(){
        action.click(getDriver(),AddToBagButton);
    }
    public void clickOnViewBagBtn(){
        action.click(getDriver(),ViewBagBtn);
    }
    public LoginPage clickOnCheckNowBtn() throws InterruptedException {
        action.click(getDriver(),CheckoutNowBtn);
        Thread.sleep(3000);
        return new LoginPage();

    }

}

