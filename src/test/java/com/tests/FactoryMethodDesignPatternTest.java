package com.tests;

import factory.BrowserType;
import factory.DriverFactoryWithSupplier;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FactoryMethodDesignPatternTest {

    @Test
    public void factoryMethodTest() {
        WebDriver driver = DriverFactoryWithSupplier.getDriver(BrowserType.CHROME);
        driver.get("https://google.com");
    }


}
