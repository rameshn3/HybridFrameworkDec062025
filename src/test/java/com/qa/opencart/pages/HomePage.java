package com.qa.opencart.pages;

import com.aventstack.chaintest.plugins.ChainTestListener;
import com.qa.opencart.utilities.WebDriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends WebDriverUtils{
    WebDriver driver;
    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="logo")
    private WebElement openCartLogo;
    @FindBy(xpath="//span[normalize-space()='My Account']")
    private WebElement myAccountMenu;
    @FindBy(linkText="Register")
    private WebElement registerLink;
    @FindBy(linkText="Login")
    private WebElement loginLink;
    @FindBy(xpath="//div[contains(@class,'product-layout')]")
    private List<WebElement> featuredProductList;



    public boolean isOpencartLogoExists(){
        return openCartLogo.isDisplayed();
    }

    public void clickMyAccountMenu() throws InterruptedException{
        ChainTestListener.log("opening the my account menu");
        click(myAccountMenu);
    }

    public void navigateToRegister() throws InterruptedException{
        ChainTestListener.log("clicking on Register link");
        clickMyAccountMenu();
        click(registerLink);
    }

    public void navigateToLogin() throws InterruptedException{
        ChainTestListener.log("click on login link");
        clickMyAccountMenu();
        click(loginLink);
    }

    public int getFeaturedProductsCount(){
        return featuredProductList.size();
    }

}
