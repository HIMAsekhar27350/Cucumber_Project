package com.qascript.StepDefs;

import com.qascript.baseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Hooks extends baseClass {

    @Before
    public void setUp() throws IOException {
            initializeDiver();
         }
    @After
    public void close() {
        closeDirver();
    }
}
