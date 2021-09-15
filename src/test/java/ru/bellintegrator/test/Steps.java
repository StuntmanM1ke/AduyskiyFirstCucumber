package ru.bellintegrator.test;

import driver.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Steps {

    @Test
    public void открытьХром() {
        WebDriverManager.initChrome();
    }

    @Test
    public void закрытьХром() {
       WebDriverManager.getCurrentDriver().quit();
    }
}
