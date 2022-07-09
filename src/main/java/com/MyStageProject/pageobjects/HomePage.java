package com.MyStageProject.pageobjects;

import com.MyStageProject.actiondriver.Action;
import com.MyStageProject.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    Action action = new Action();
    @FindBy(xpath = "//img[@title='Burkes Outlet & Bealls Outlet Cobranded Logo']")
    private WebElement MyLogo;
    @FindBy(xpath = "//input[@type='text']/../span")
    private WebElement SearchTextBox;

    @FindBy(xpath = "//a[@class='btn-go']")
    private WebElement SearchTextBtn;

    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public boolean validateMyLogo() {
        return action.isDisplayed(getDriver(), MyLogo);
    }


    public void clickOnSearchTextBox() {
        action.implicitWait(getDriver(), 10);
        action.click(getDriver(), SearchTextBox);
    }
    public AddToBagPage searchProduct(String productName) throws InterruptedException {
        action.type(SearchTextBox, productName);
        action.scrollByVisibilityOfElement(getDriver(), SearchTextBtn);
        action.click(getDriver(), SearchTextBtn);
        Thread.sleep(3000);
        return new AddToBagPage();
    }
    }


















