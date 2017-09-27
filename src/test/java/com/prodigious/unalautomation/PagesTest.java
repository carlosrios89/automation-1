package com.prodigious.unalautomation;

import com.prodigious.unalautomation.Helper.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static com.prodigious.unalautomation.HomePage.PAGE_URL;

public class PagesTest {

    @Test
    public void adoptionTest(){

        WebDriver driver= BrowserFactory.startBrowser("firefox",PAGE_URL);

        HomePage homePage= PageFactory.initElements(driver, HomePage.class);
        homePage.AdoptionProcess("John Doe", "5141 3rd St, Omaha NB 32422", "john@doe.net");
    }

    @Test
    public void assertSearchBar(){
        WebDriver driver= BrowserFactory.startBrowser("firefox",PAGE_URL);

        HomePage homePage= PageFactory.initElements(driver, HomePage.class);
        homePage.AssertSearchBar("hannah");
    }

    @Test
    public void adoptionChangeMind(){
        WebDriver driver= BrowserFactory.startBrowser("firefox",PAGE_URL);

        HomePage homePage= PageFactory.initElements(driver, HomePage.class);
        homePage.AdoptionChangeMind();
    }

    @Test
    public void adoptTwoPuppies(){
        WebDriver driver= BrowserFactory.startBrowser("firefox",PAGE_URL);

        HomePage homePage= PageFactory.initElements(driver, HomePage.class);
        homePage.AdoptTwoPuppies("John Doe", "5141 3rd St, Omaha NB 32422", "john@doe.net");
    }

    @Test
    public void formTest(){

        WebDriver driver= BrowserFactory.startBrowser("firefox",PAGE_URL);

        HomePage homePage= PageFactory.initElements(driver, HomePage.class);
        homePage.FormError();
    }

    @Test
    public void returnTest(){

        WebDriver driver= BrowserFactory.startBrowser("firefox",PAGE_URL);

        HomePage homePage= PageFactory.initElements(driver, HomePage.class);
        homePage.DetailsReturntoList();
    }

    @Test
    public void PageNotFoundTest(){

        WebDriver driver = BrowserFactory.startBrowser("firefox",PAGE_URL );

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.PageNotFound();
    }

    @Test
    public void AdoptionPageTwoTest(){

        WebDriver driver = BrowserFactory.startBrowser("firefox", PAGE_URL);

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.AdoptionPageTwo("Luis Test", "9571 Congress St, Schenectady NY 12345", "luis@test.net");
    }
}
