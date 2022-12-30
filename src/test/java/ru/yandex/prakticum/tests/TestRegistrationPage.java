package ru.yandex.prakticum.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.prakticum.BaseTest;

@DisplayName("Тесты страницы регистрации")
public class TestRegistrationPage extends BaseTest {

    @Before
    @Step("Открываю ссылку на странице регистрации")
    public void setupRegistrationPage() {
        registrationPage.open();
    }

    @Test
    @DisplayName("Регестрирую пользователя с корректными данными")
    @Description("Ввожу рандомные данные почты и пароля с корректной длинной полей")
    public void registrationUserPositiveTest() {
        registrationPage.enterName(VALID_NAME)
                .enterEmail(randomEmail)
                .enterPassword(randomCorrectPassword)
                .pressButtonRegistration();
        loginPage.checkVisibleButtonLogin();
    }

    @Test
    @DisplayName("Регестриурю пользователя с некорректным паролем")
    @Description("Ввожу рандомные данные почты и пароля, а пароль некорректной длинны")
    public void registrationUserNegativeTest() {
        registrationPage.enterName(VALID_NAME)
                .enterEmail(randomEmail)
                .enterPassword(randomIncorrectPassword)
                .pressButtonRegistration()
                .checkErrorMessage();
    }
}
