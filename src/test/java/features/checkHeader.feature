Feature: Проверка заголовка

  @otlad
  Scenario: Проверка BellIntegrator
    Given перейти на сайт 'https://bellintegrator.ru/'
    Then заголовок равен 'Bell Integrator'
