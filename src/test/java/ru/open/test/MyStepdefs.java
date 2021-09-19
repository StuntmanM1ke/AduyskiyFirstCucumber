package ru.open.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import driver.WebDriverManager;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class MyStepdefs extends Steps {
    @Given("Перейти в гугл и ввести в поле поиска '(.*)'")
    public void перейтиВГуглИВвестиВПолеПоискаОткрытие(String string) {
        GooglePageWithSearch googlePageWithSearch = new GooglePageWithSearch(WebDriverManager.getCurrentDriver(), string);
    }

    @Then("Найти среди результатов нужную ссылку '(.*)'")
    public void найти_среди_результатов_нужную_ссылку_и_перейти(String string) {
        GooglePageWithSearch googlePageWithSearch = new GooglePageWithSearch(WebDriverManager.getCurrentDriver());
        List<Map<String, Object>> resultSearch = googlePageWithSearch.getSearchResults();
        googlePageWithSearch.goPage("Банк Открытие: Частным клиентам");
    }


    @Then("Проверить что курс продажи меньше курса покупки")
    public void проверитьЧтоКурсПродажиМеньшеКурсаПокупки() {
        OpenPage openPage = new OpenPage(WebDriverManager.getCurrentDriver());
        List<Map<String, String>> collectExchangeRates = openPage.getCollectExchangeRates();
        Assert.assertTrue(
                Double.parseDouble(
                        collectExchangeRates.stream()
                                .filter(x -> x.get("Валюта обмена").contains("USD"))
                                .findFirst()
                                .get().get("Банк покупает").replace(",", ".")
                )
                        < Double.parseDouble(
                        collectExchangeRates.stream()
                                .filter(x -> x.get("Валюта обмена").contains("USD"))
                                .findFirst()
                                .get().get("Банк продает").replace(",", ".")
                )
        );
    }
}
