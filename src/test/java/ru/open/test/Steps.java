package ru.open.test;

import driver.WebDriverManager;
import org.junit.Test;

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
