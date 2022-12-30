package ru.yandex.prakticum.tests;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.prakticum.BaseTest;

@DisplayName("Тесты главной страницы")
public class TestMainPage extends BaseTest {

    @Before
    @DisplayName("Открываю главную страницу без авторизации")
    public void setupMainPage() {
        mainPage.open();
    }

    @Test
    @DisplayName("Раздел Булки")
    @Description("Выбираю раздел Булки и проверяю заголовок")
    public void chooseBunsTabTest() {
        mainPage.checkActiveSectionIs("Булки");
    }

    @Test
    @DisplayName("Раздел Начинки")
    @Description("Выбираю раздел Булки и проверяю заголовок")
    public void chooseFillingsTabTest() {
        mainPage.chooseFillingsTab()
                .checkActiveSectionIs("Начинки");
    }

    @Test
    @DisplayName("Раздел Соусы")
    @Description("Выбираю раздел Соусы и проверяю заголовок")
    public void chooseSaucesTabTest() {
        mainPage.chooseSaucesTab()
                .checkActiveSectionIs("Соусы");
    }
}
