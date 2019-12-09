package com.ssu;

import io.restassured.RestAssured;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class StudentFunctionalTest extends BaseTest {

    StudentFunctionalTest() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        /*GLOBAL CONFIGURATIONS*/

        System.out.println(PropertyHandler.prop.getProperty("server.name"));
        /*RestAssured.baseURI = PropertyHandler.getProperty("server.name") + PropertyHandler.getProperty("server.port") ;
        RestAssured.basePath = PropertyHandler.getProperty("app.base.uri");

        System.out.println("");*/





    }


}
