package ru.bellintegrator.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.runtime.junit.Assertions;
import driver.WebDriverManager;
import org.junit.Assert;

public class MyStepdefs extends Steps {
    @Given("перейти на сайт '(.*)'")
    public void перейти_на_сайт(String url) {
        WebDriverManager.getCurrentDriver().get(url);
    }

    @Then("заголовок равен '(.*)'")
    public void заголовок_равен(String header) {
        String title = WebDriverManager.getCurrentDriver().getTitle();
        Assert.assertTrue(title.contains(header));
    }
}
