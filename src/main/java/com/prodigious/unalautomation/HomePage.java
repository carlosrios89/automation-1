package com.prodigious.unalautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {


    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public static final  String PAGE_URL = "http://puppies.herokuapp.com/";



    @FindBy (how = How.XPATH,using = "//*[@id=\"sb_top\"]/div/a/img")
            WebElement heroLogo;
    @FindBy (how = How.XPATH, using = "//*[@id=\"header\"]/input")
            WebElement HeroSearch;
    @FindBy (how = How.XPATH, using = "//*[@id=\"header\"]/a/img")
            WebElement heroEmail;
    @FindBy (how = How.XPATH,using = "//*[@id=\"header\"]/input")
            WebElement searchBar;
    @FindBy (how = How.XPATH,using = "//*[@id=\"header\"]/a/img")
            WebElement mailBox;
    @FindBy (how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div/div[4]/form/div/input")
            WebElement detailsBrook;
    @FindBy (how = How.XPATH,using = "//*[@id=\"content\"]/div[3]/div/div[4]/form/div/input")
            WebElement detailsHanna;
    @FindBy (how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div/form/div/input[1]")
            WebElement brookAdoptMe;
    @FindBy (how = How.XPATH, using ="//*[@id=\"carrier\"]")
            WebElement brookAdoptAdditionalCarrier;
    @FindBy (how = How.XPATH, using = "//*[@id=\"vet\"]")
            WebElement brookAdoptAdditionalVet;
    @FindBy (how = How.XPATH, using ="//*[@id=\"content\"]/div[2]/form[1]/div/input")
            WebElement brookAdoptCompleteAdoption;
    @FindBy (how = How.XPATH,using ="//*[@id=\"content\"]/div[2]/form[2]/div/input[1]")
            WebElement brookAdoptAnotherPuppy;
    @FindBy (how = How.XPATH,using = "//*[@id=\"content\"]/div[2]/form[3]/div/input[2]")
            WebElement brookAdoptChange;
    @FindBy (how = How.XPATH,using ="//*[@id=\"order_name\"]")
            WebElement FormName;
    @FindBy (how = How.XPATH,using ="//*[@id=\"order_address\"]")
            WebElement FormAddress;
    @FindBy (how = How.XPATH,using ="//*[@id=\"order_email\"]")
            WebElement FormEmail;
    @FindBy (id = "order_pay_type")
            WebElement FormPayType;
    @FindBy (how = How.XPATH,using = "//*[@id=\"order_pay_type\"]/option[3]")
            WebElement FormpayTypeOption3;
    @FindBy (how = How.XPATH, using = "//*[@id=\"new_order\"]/div[6]/input")
            WebElement FormPlaceOrder;
    @FindBy (how = How.XPATH, using = "//*[@id=\"collar\"]")
            WebElement brookAdoptAdditionalCollar;
    @FindBy (how = How.XPATH, using = "//*[@id=\"toy\"]")
            WebElement brookAdoptAdditionalToy;
    @FindBy (how = How.XPATH, using = "//*[@id=\"content\"]/a")
            WebElement brookReturn;
    @FindBy (how = How.XPATH,using = "//*[@id=\"sb_top\"]/div/a/img")
            WebElement Homepage404;
    @FindBy (how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div/form/div/input[1]")
            WebElement spudAdoptMe;
    @FindBy (how = How.XPATH, using ="//*[@id=\"carrier\"]")
            WebElement spudAdoptAdditionalCarrier;
    @FindBy (how = How.XPATH, using = "//*[@id=\"vet\"]")
            WebElement spudAdoptAdditionalVet;
    @FindBy (how = How.XPATH, using ="//*[@id=\"content\"]/div[2]/form[1]/div/input")
            WebElement spudAdoptCompleteAdoption;
    @FindBy (how = How.XPATH, using = "//*[@id=\"content\"]/div[6]/a[4]")
            WebElement NextPageButton;
    @FindBy (how = How.XPATH, using = "//*[@id=\"content\"]/div[3]/div/div[4]/form/div/input")
            WebElement detailsSpud;


    public void AdoptionProcess(String name, String address, String email){

        new WebDriverWait(driver, 10);
        detailsBrook.click();
        new WebDriverWait(driver, 3);
        brookAdoptMe.click();
        new WebDriverWait(driver, 4);
        brookAdoptAdditionalCarrier.click();
        brookAdoptAdditionalVet.click();
        brookAdoptCompleteAdoption.click();
        new WebDriverWait(driver, 3);
        FormName.sendKeys(name);
        FormAddress.sendKeys(address);
        FormEmail.sendKeys(email);
        FormPayType.click();
        new WebDriverWait(driver, 3);
        FormpayTypeOption3.click();
        FormPlaceOrder.click();
        WebElement success = new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"notice\"]")));
        Assert.assertTrue(success.getText().contains("Thank you for adopting a puppy!"));
        driver.close();

    }

    public void AssertSearchBar(String search){

        new WebDriverWait(driver,10);
        searchBar.click();
        searchBar.sendKeys(search);
        Assert.assertTrue(searchBar.getText().contains(search));
        driver.close();

    }

    public void AdoptionChangeMind(){

        new WebDriverWait(driver, 10);
        detailsBrook.click();
        new WebDriverWait(driver, 3);
        brookAdoptMe.click();
        new WebDriverWait(driver, 4);
        brookAdoptChange.click();
        driver.switchTo().alert().accept();
        new WebDriverWait(driver, 2);
        driver.switchTo().alert().accept();
        new  WebDriverWait(driver, 10);
        driver.getCurrentUrl().equalsIgnoreCase(PAGE_URL);
        driver.close();

    }

    public void AdoptTwoPuppies(String name, String address, String email){

        new WebDriverWait(driver, 10);
        detailsBrook.click();
        new WebDriverWait(driver, 3);
        brookAdoptMe.click();
        new WebDriverWait(driver, 4);
        brookAdoptAnotherPuppy.click();
        new WebDriverWait(driver,5);
        detailsHanna.click();
        new WebDriverWait(driver,5);
        brookAdoptMe.click();
        new WebDriverWait(driver, 3);
        brookAdoptAdditionalCarrier.click();
        brookAdoptAdditionalVet.click();
        brookAdoptCompleteAdoption.click();
        new WebDriverWait(driver, 3);
        FormName.sendKeys(name);
        FormAddress.sendKeys(address);
        FormEmail.sendKeys(email);
        FormPayType.click();
        new WebDriverWait(driver, 3);
        FormpayTypeOption3.click();
        FormPlaceOrder.click();
        WebElement success = new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"notice\"]")));
        Assert.assertTrue(success.getText().contains("Thank you for adopting a puppy!"));
        driver.close();

    }

    public void FormError() {

        new WebDriverWait(driver, 10);
        detailsBrook.click();
        new WebDriverWait(driver, 3);
        brookAdoptMe.click();
        new WebDriverWait(driver, 4);
        brookAdoptAdditionalCollar.click();
        brookAdoptAdditionalToy.click();
        brookAdoptCompleteAdoption.click();
        new WebDriverWait(driver, 3);
        FormPlaceOrder.click();
        WebElement formFieldsError = new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"error_explanation\"]/h2")));
        Assert.assertTrue(formFieldsError.getText().contains("5 errors prohibited this order from being saved:"));
        driver.close();

    }

    public void DetailsReturntoList() {

        new WebDriverWait(driver, 10);
        detailsBrook.click();
        new WebDriverWait(driver, 3);
        brookReturn.click();
        new WebDriverWait(driver, 3);
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://puppies.herokuapp.com/");
        driver.close();

    }

    public void PageNotFound(){

        new WebDriverWait(driver, 10);
        detailsBrook.click();
        new WebDriverWait(driver, 2);
        Homepage404.click();
        new WebDriverWait(driver, 2);
        WebElement success = new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/h1")));
        Assert.assertTrue(success.getText().contains("The page you were looking for doesn't exist."));
        driver.close();

    }


    public void AdoptionPageTwo(String name, String address, String email){

        new WebDriverWait(driver, 3);
        NextPageButton.click();
        new WebDriverWait(driver, 3);
        detailsSpud.click();
        new WebDriverWait(driver, 3);
        spudAdoptMe.click();
        new WebDriverWait(driver, 4);
        spudAdoptAdditionalCarrier.click();
        spudAdoptAdditionalVet.click();
        spudAdoptCompleteAdoption.click();
        new WebDriverWait(driver, 3);
        FormName.sendKeys(name);
        FormAddress.sendKeys(address);
        FormEmail.sendKeys(email);
        FormPayType.click();
        new WebDriverWait(driver, 3);
        FormpayTypeOption3.click();
        FormPlaceOrder.click();
        WebElement success = new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"notice\"]")));
        Assert.assertTrue(success.getText().contains("Thank you for adopting a puppy!"));
        driver.close();
    }


}
