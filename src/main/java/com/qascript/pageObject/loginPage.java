package com.qascript.pageObject;

import com.qascript.baseClass;
import org.openqa.selenium.By;

public class loginPage extends baseClass {
    private static String txtEmail="//input[@id='input-email']";
    private static String txtPassword="//input[@id='input-password']";
    private static String txtLogin="//input[@value='Login']";
    private static String linkForgotPassword="(//a[text()='Forgotten Password'])[1]";

    public static void enterUsername(String username){
        driver.findElement(By.xpath(txtEmail)).sendKeys(username);
    }
    public static void enterPassword(String password){
        driver.findElement(By.xpath(txtEmail)).sendKeys(password);
    }
    public static void clickLogin(){
        driver.findElement(By.xpath(txtLogin)).click();
    }
    public static void clickForgotPassword(){
        driver.findElement(By.xpath(linkForgotPassword)).click();
    }
}
