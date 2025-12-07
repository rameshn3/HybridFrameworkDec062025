package com.qa.opencart.testcases;

import com.aventstack.chaintest.plugins.ChainTestListener;
import com.qa.opencart.factory.TestBase;
import com.qa.opencart.pages.HomePage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.PageFactoryManager;
import com.qa.opencart.pages.RegisterPage;
import com.qa.opencart.utilities.Constants;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase{
    private HomePage homePage;
    private LoginPage loginPage;
    private RegisterPage registerPage;

    @BeforeClass
    public void pageClassesSetup(){
        PageFactoryManager pageFactoryManager = new PageFactoryManager(driver);
        homePage = pageFactoryManager.getHomePage();
        loginPage = pageFactoryManager.getLoginPage();
        registerPage = pageFactoryManager.getRegisterPage();

    }

    @Test(description="TC01_Verify the opencart home page title")
    public void TC01_Verify_the_opencart_home_page_title_test(){
        ChainTestListener.log("TC01_Verify the opencart home page title");
        ChainTestListener.log("home page title is:"+driver.getTitle());
        Assert.assertEquals(driver.getTitle(),Constants.HOME_PAGE_TITLE);
    }


    @Test(description="TC02_Verify the opencart logo test")
    public void TC02_Verify_the_opencart_logo_test(){
        ChainTestListener.log("TC02_Verify the opencart logo test");
        Assert.assertTrue(homePage.isOpencartLogoExists(),"opencart logo doesnot exists");
    }

    @Test(description="TC03_Verify_opencart_Featured_section_cards_count_test")
    public void TC03_Verify_opencart_Featured_section_cards_count_test(){
        ChainTestListener.log("TC03_Verify_opencart_Featured_section_cards_count_test");
        Assert.assertTrue(homePage.getFeaturedProductsCount()==4,"featured section cards count is mismatched");

    }


    @Test(description="TC04_Verify_navigate to register page from homepage test")
    public void TC04_Verify_navigate_to_register_page_from_homepage_test() throws InterruptedException{
        ChainTestListener.log("TC04_Verify_navigate_to_register_page_from_homepage_test");
        homePage.navigateToRegister();
        registerPage.waitForPageLoad(1000);
        ChainTestListener.log("Verify register page title");
        Assert.assertEquals(registerPage.getRegisterPageTitle(),Constants.REGISTRATION_PAGE_TITLE);
        ChainTestListener.log("navigate back to home page");
        registerPage.navigateToHomePage();
    }

    @Test(description="TC05_Verify_navigate to login page from homepage test")
    public void TC05_Verify_navigate_to_login_page_from_homepage_test() throws InterruptedException{
        ChainTestListener.log("TC05_Verify_navigate to login page from homepage test");
        homePage.navigateToLogin();
       loginPage.waitForPageLoad(1000);
        ChainTestListener.log("Verify login page title");
        Assert.assertEquals(loginPage.getLoginPageTitle(),Constants.LOGIN_PAGE_TITLE);
        ChainTestListener.log("navigate back to home page");
        loginPage.navigateToHomePage();
    }


}
