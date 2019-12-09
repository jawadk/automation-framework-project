package com.ssu;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    BaseTest() throws IOException {

        PropertyHandler propertyHandler = new PropertyHandler();
        propertyHandler.readProperty();
    }
}
