Feature: Получение и сравнение курсов валют

  Scenario:Получение и сравнение курсов валют с сайта банка Открытие
    Given Перейти в гугл 'https://www.google.ru/'
    Then Ввести в поле поиска 'открытие'
    Then Найти среди результатов нужную ссылку 'Банк Открытие'
    Then Получить информацию о курсах валют