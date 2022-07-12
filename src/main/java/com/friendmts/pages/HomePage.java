package com.friendmts.pages;

import com.friendmts.Utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());//creation of log method

    public HomePage() {
        PageFactory.initElements(driver, this);//call page factory class

    }

    @CacheLookup//to store element and memory to run test quicker
    @FindBy(xpath = "//button[@id='cookienote-continue-button']")//locator , with FindBy- find element from web
    WebElement acceptCookies;//object name

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/nav[1]/section[1]/ul[1]/li[2]/a[1]/span[1]")
    WebElement platformProtection;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[2]/nav[1]/section[1]/ul[1]/li[2]/ul[1]/li[4]/a[1]")
    WebElement broadcastId;

    @CacheLookup
    @FindBy(xpath = "//h5[contains(text(),'Protect your broadcast content')]")
    WebElement verifyText;

    public void clickOnAcceptCookies() {//method creation - this method click on accept cookies
        clickOnElement(acceptCookies);
        log.info("Clicking on acceptCookies : " + acceptCookies);
    }

    public void clickOnPlatformProtection() {//method creation for mouse hover on protection platfrom
        mouseHoverToElement(platformProtection);
        log.info("MouseHovering to PlatfromProtection :" + platformProtection);
    }

    public void clickOnBroadCastId() {//method creation - this method mouse hoover and click on boardCast link
        mouseHoverAndClickOnElement(broadcastId);
        log.info("MouseHoverAndClick on broadcastId: " + broadcastId);
    }

    public String getVerifyText() {// this method creation of verfying text
        String message = getTextFromElement(verifyText);
        log.info("Getting text from : " + verifyText.toString());
        return message;
    }

}

