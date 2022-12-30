package ru.yandex.prakticum.tests;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import ru.yandex.prakticum.BaseTest;

@DisplayName("Тесты страницы логина")

public class TestLoginPage extends BaseTest {

    @Test
    @DisplayName("Логинюсь через кнопку Войти в аккаунт")
    @Description("Залогинюсь через кнопку Войти в аккаунт на главной странице")
    public void loginWithMainPagePositiveTest() {
        mainPage.open();
        mainPage.pressButtonLogin()
                .enterEmail(VALID_EMAIL)
                .enterPassword(VALID_PASSWORD)
                .pressButtonLogin()
                .checkEnabledButtonMakeOrder();
    }

    @Test
    @DisplayName("Логинюсь через кнопку Личный кабинет")
    @Description("Нажимаю кнопку Личный кабинет на главной странице и логинюсь на форме")
    public void loginWithMainPageButtonPersonAccountPositiveTest() {
        mainPage.open();
        mainPage.pressButtonPersonalAccount()
                .enterEmail(VALID_EMAIL)
                .enterPassword(VALID_PASSWORD)
                .pressButtonLogin()
                .checkEnabledButtonMakeOrder();
    }

    @Test
    @DisplayName("Логинюсь с формы регистрации")
    @Description("Залогинюсь через кнопку Войти в аккаунт на странице восстановления пароля")
    public void loginWitRegistrationPagePositiveTest() {
        registrationPage.open();
        registrationPage.pressButtonLogin()
                .enterEmail(VALID_EMAIL)
                .enterPassword(VALID_PASSWORD)
                .pressButtonLogin()
                .checkEnabledButtonMakeOrder();
    }

    @Test
    @DisplayName("Логинюсь с формы восстановления пароля ")
    @Description("Залогинюсь через кнопку Войти в аккаунт на странице восстановления пароля")
    public void loginWithForgotPagePositiveTest() {
        forgotPasswordPage.open();
        forgotPasswordPage.pressButtonLogin()
                .enterEmail(VALID_EMAIL)
                .enterPassword(VALID_PASSWORD)
                .pressButtonLogin()
                .checkEnabledButtonMakeOrder();
    }
}
