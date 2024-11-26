package com.qascript.StepDefs;

import com.qascript.Utils.propertiesUtils;
import com.qascript.baseClass;
import com.qascript.pageObject.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;


public class login1StepDefs extends baseClass {
    Properties properties=propertiesUtils.loadApplicationProperties();

    public login1StepDefs() throws IOException {
    }

    @Given("user enters valid username in the email field")
    public void userEntersValidUsernameInTheEmailField() throws InterruptedException, IOException {
        String username=properties.getProperty("username");
        loginPage.enterUsername(username);
    }
    @And("user enters valid password in the email_password field")
    public void userEntersValidPasswordInTheEmail_passwordField() throws InterruptedException {
        String password=properties.getProperty("password");
        loginPage.enterPassword(password);
    }
    @When("user clicks on the Login button")
    public void userClicksOnTheLoginButton() {
        loginPage.clickLogin();
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
