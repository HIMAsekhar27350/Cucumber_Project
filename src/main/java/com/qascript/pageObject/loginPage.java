package com.qascript.pageObject;

import com.qascript.baseClass;

public class loginPage extends baseClass {
    private static String txtEmail="//input[@id='input-email']";
    private static String txtPassword="//input[@id='input-password']";
    private static String txtLogin="//input[@value='Login']";
    private static String linkForgotPassword="(//a[text()='Forgotten Password'])[1]";
}
