package com.ssu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyHandler {

    static Properties prop;

    public void readProperty() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\config\\application-qa.properties");
        prop = new Properties();
        prop.load(fileInputStream);
    }

    static String getProperty(String propertyName){
        return prop.getProperty(propertyName);
    }
}
