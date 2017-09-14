package com.prodigious.automation1.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    public static final  String PAGE_URL = "http://prodigi.byprodigious.com";
    WebElement jugarCta = driver.findElement (By.xpath("//*[@id=\"game\"]/div/a"));
    WebElement scheduleLess = driver.findElement (By.xpath("//*[@id=\"schedule\"]/div/div/div[2]"));
    WebElement scheduleMore = driver.findElement (By.xpath("//*[@id=\"schedule\"]/div/div/div[1]"));
    WebElement inscriptionField = driver.findElement (By.xpath("//*[@id=\"conversational-form\"]/div/cf-input/textarea"));
    WebElement contactMessage = driver.findElement (By.xpath("//*[@id=\"contact\"]/div/div/a[1]/i"));
    WebElement contactPhone = driver.findElement (By.xpath("//*[@id=\"contact\"]/div/div/a[2]/i"));
    WebElement headerJuego = driver.findElement (By.xpath("/html/body/div/div/nav/ul/li[1]/a"));
    WebElement headerSchedule = driver.findElement (By.xpath("/html/body/div/div/nav/ul/li[2]/a"));
    WebElement headerExpositores = driver.findElement (By.xpath("/html/body/div/div/nav/ul/li[3]/a"));
    WebElement headerContact = driver.findElement (By.xpath("/html/body/div/div/nav/ul/li[4]/a"));
    WebElement headerInscription = driver.findElement (By.xpath("/html/body/div/div/nav/ul/li[5]/a"));
    WebElement heroTitle= driver.findElement (By.xpath("/html/body/section[1]/div[2]/div/h2"));
    WebElement heroCopy= driver.findElement (By.xpath("/html/body/section[1]/div[2]/div/div/p"));
    WebElement scheduleTitle= driver.findElement (By.xpath("//*[@id=\"schedule\"]/div/h2"));
    WebElement scheduleCopy= driver.findElement (By.xpath("//*[@id=\"schedule\"]/div/p"));
    WebElement expositoresTitle= driver.findElement (By.xpath("//*[@id=\"speakers\"]/div/h2"));
    WebElement expositoresCopy= driver.findElement (By.xpath("//*[@id=\"speakers\"]/div/p"));
    WebElement inscriptionTitle= driver.findElement (By.xpath("//*[@id=\"register\"]/div/h2"));
    WebElement inscriptionCopy= driver.findElement (By.xpath("//*[@id=\"register\"]/div/p"));
    WebElement contactTitle= driver.findElement (By.xpath("//*[@id=\"contact\"]/div/h2"));
    WebElement contactCopy= driver.findElement (By.xpath("//*[@id=\"contact\"]/div/p"));

}


