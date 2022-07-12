package com.friendmts.steps;

import com.friendmts.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepDefs {
    @Given("^I am on homepage$")// implementation from feature file
    public void iAmOnHomepage() {
    }

    @And("^I click on accept cookies$")
    public void iClickOnAcceptCookies() {
        new HomePage().clickOnAcceptCookies();//object creation for home page and call the method
    }

    @When("^I mouse hover on platfromprotection link$")
    public void iMouseHoverOnPlatfromprotectionLink() {
        new HomePage().clickOnPlatformProtection();
    }

    @And("^I mouse hover and click to broadcastid tab$")
    public void iMouseHoverAndClickToBroadcastidTab() {
        new HomePage().clickOnBroadCastId();
    }

    @Then("^I should able to verify text$")
    public void iShouldAbleToVerifyText() {
        String expectedMessage = "Protect your broadcast content";
        String actualMessage = new HomePage().getVerifyText();
        Assert.assertEquals("text not displayed", expectedMessage, actualMessage);


    }
}

