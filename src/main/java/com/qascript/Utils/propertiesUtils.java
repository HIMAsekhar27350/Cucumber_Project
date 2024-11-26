package com.qascript.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesUtils {

    public static Properties properties=new Properties();
    static FileInputStream fis=null;
    public static Properties loadApplicationProperties() throws IOException {
        try {
            fis =new FileInputStream("src/test/resources/config/application.properties");
            properties.load(fis);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return properties;
    }
    public static Properties loadframeworkProperties() throws IOException {
        try {
            fis =new FileInputStream("src/test/resources/config/framework.properties");
            properties.load(fis);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return properties;
    }
    public static Properties loaduserProperties() throws IOException {
        try {
            fis =new FileInputStream("src/test/resources/config/user.properties");
            properties.load(fis);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return properties;
    }
}
