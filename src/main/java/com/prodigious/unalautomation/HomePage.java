package com.prodigious.unalautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    // Init of Driver
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Init of variables


    // URL for testing
    public static final  String PAGE_URL = "http://puppies.herokuapp.com/";


    // Map of elements

    //***** Hero *****
    WebElement heroLogo = driver.findElement(By.xpath("//*[@id=\"sb_top\"]/div/a/img")); // Error
    WebElement heroSearch = driver.findElement(By.xpath("//*[@id=\"header\"]/input")); // It isn't working
    WebElement heroEmail = driver.findElement(By.xpath("//*[@id=\"header\"]/a/img")); // Page doesn't exist


    //***** Menu *****
    WebElement menuAdoptPuppies = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[4]/form/div/input"));
    WebElement MenuLern = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[4]/form/div/input"));
    WebElement MenuAnimalShelters = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[4]/form/div/input"));
    WebElement MenuClassifieds = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[4]/form/div/input"));
    WebElement MenuMessageBoards = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[4]/form/div/input"));
    WebElement MenuPetNews = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[4]/form/div/input"));



    //***** Puppy List - Page 1 *****
    WebElement detailsBrook = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[4]/form/div/input"));
    WebElement detailsHanna = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div[4]/form/div/input"));
    WebElement detailsMaggieMae = driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div/div[4]/form/div/input"));
    WebElement detailsRubySue = driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/div/div[4]/form/div/input"));

    //***** Puppy List - Page 2 *****
    WebElement detailsSparky = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[4]/form/div/input"));
    WebElement detailsSpud = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div[4]/form/div/input"));
    WebElement detailsTipsy = driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div/div[4]/form/div/input"));
    WebElement detailsTopsy = driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/div/div[4]/form/div/input"));

    //***** Puppy List - Page 3 *****
    WebElement detailsTwinkie = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[4]/form/div/input"));

    //***** Pagination Buttons below Puppy List - *****
    WebElement buttonPrevious = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/a[1]"));
    WebElement buttonOne = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/a[2]"));
    WebElement buttonTwo = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/a[3]"));
    WebElement buttonThree = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/em"));
    WebElement buttonNext = driver.findElement(By.xpath("//*//*[@id=\"content\"]/div[3]/span"));

    //***** Adopt a Puppy - Page ****** HomePage


    //***** Learn - Page ****** Error


    //***** Animal Shelters - Page ****** Error


    //***** Classifieds - Page ****** Error


    //***** Message Boards - Page ****** Error


    //***** Pet News - Page ****** Error

    //***** Brook Step 1 - View Details ***** Verify:  image, copy , CTAs
    WebElement brookImage = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/img"));
    WebElement brookH2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/h2"));
    WebElement brookH3 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/h3"));
    WebElement brookDescriptionCopy = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/p"));
    WebElement brookPriceCopy = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/span"));
    WebElement brookAdoptMe = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/div/input[1]"));
    WebElement brookReturn= driver.findElement(By.xpath("//*[@id=\"content\"]/a"));


    //***** Brook - Adopt Me - Page ******


    //***** Return To List - Functionality ****** Go to Home
    WebElement brookAdoptTitle = driver.findElement(By.xpath("//*[@id=\"content\"]/h2"));

    WebElement brookAdoptImage = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[1]/img"));
    WebElement brookAdoptName = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[2]/h2"));
    WebElement brookAdoptDescription = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[3]/h2"));
    WebElement brookAdoptPrice = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[4]/h2"));

    WebElement brookAdoptAdditional = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[2]/td[2]/h3"));
    WebElement brookAdoptAdditionalCollar = driver.findElement(By.xpath("//*[@id=\"collar\"]"));
    WebElement brookAdoptAdditionalToy = driver.findElement(By.xpath("//*[@id=\"toy\"]"));
    WebElement brookAdoptAdditionalCarrier = driver.findElement(By.xpath("//*[@id=\"carrier\"]"));
    WebElement brookAdoptAdditionalVet = driver.findElement(By.xpath("//*[@id=\"vet\"]"));

    WebElement brookAdoptTotal= driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[7]/td[3]/h2"));

    WebElement brookAdoptCompleteAdoption = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/form[1]/div/input"));
    WebElement brookAdoptAnotherPuppy = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/form[2]/div/input[1]"));
    WebElement brookAdoptChange = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/form[3]/div/input[2]"));


    //***** Brook - Complete the adoption - Page ****** Form
    WebElement FormTitle = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/fieldset/legend"));
    WebElement FormName = driver.findElement(By.xpath("//*[@id=\"order_name\"]"));
    WebElement FormAddress= driver.findElement(By.xpath("//*[@id=\"order_address\"]"));
    WebElement FormEmail = driver.findElement(By.xpath("//*[@id=\"order_email\"]"));
    WebElement FormPayType = driver.findElement(By.xpath("//*[@id=\"order_pay_type\"]"));
    WebElement FormPayTypeCheck = driver.findElement(By.xpath("//*[@id=\"order_pay_type\"]/option[2]"));
    WebElement FormPayTypeCredit = driver.findElement(By.xpath("//*[@id=\"order_pay_type\"]/option[3]"));
    WebElement FormPayTypePurchase = driver.findElement(By.xpath("//*[@id=\"order_pay_type\"]/option[4]"));
    WebElement FormPlaceHolder = driver.findElement(By.xpath("//*[@id=\"new_order\"]/div[6]/input"));
    WebElement FormPlaceHolderError = driver.findElement(By.xpath("//*[@id=\"error_explanation\"]"));
    WebElement FormPlaceHolderSuccess = driver.findElement(By.xpath("//*[@id=\"notice\"]")); //Homepage


    //***** Brook - Adopt Another Puppy - Page ****** HomePage


    //***** Brook - Adopt Change your mind - Page ****** Popup: Cancel (Stay on the same page) or Ok (Go to HomePage)
    WebElement popupCancel = driver.findElement(By.xpath(""));
    WebElement popupOk = driver.findElement(By.xpath(""));
}
