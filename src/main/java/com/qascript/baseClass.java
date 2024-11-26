package com.qascript;

import com.qascript.Utils.propertiesUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Properties;

public class baseClass {
    public static WebDriver driver;

    public static void initializeDiver() throws IOException {
        Properties properties= propertiesUtils.loadApplicationProperties();
        String url= properties.get("application.url").toString();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
    public static void closeDirver(){
        driver.quit();
    }
}
