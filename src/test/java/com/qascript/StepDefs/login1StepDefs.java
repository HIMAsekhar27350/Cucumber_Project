package com.qascript.StepDefs;

import com.qascript.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class login1StepDefs extends baseClass {
    @Given("user enters valid username in the email field")
    public void userEntersValidUsernameInTheEmailField() throws InterruptedException {
        driver.findElement(By.id("input-email")).sendKeys("himasekhar123@gmali.com");
        Thread.sleep(2000);
    }

    @And("user enters valid password in the email_password field")
    public void userEntersValidPasswordInTheEmail_passwordField() throws InterruptedException {
        driver.findElement(By.id("input-password")).sendKeys("123456");
        Thread.sleep(2000);
    }

    @When("user clicks on the Login button")
    public void userClicksOnTheLoginButton() {
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @Then("user is logged successfull")
    public void userIsLoggedSuccessfull() {
    }

    @Given("user enters invalid username in the email field")
    public void userEntersInvalidUsernameInTheEmailField() {
    }

    @And("user enters invalid password in the email_password field")
    public void userEntersInvalidPasswordInTheEmail_passwordField() {
    }

    @Then("error message is displayed")
    public void errorMessageIsDisplayed() {
    }
}
