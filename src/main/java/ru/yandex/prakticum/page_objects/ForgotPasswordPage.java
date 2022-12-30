package ru.yandex.prakticum.page_objects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yandex.prakticum.framework.Browser;

import static ru.yandex.prakticum.framework.Const.FORGOT;

public class ForgotPasswordPage {
    private final By buttonLogin = By.linkText("Войти");
    private final WebDriver driver = Browser.getInstance();

    @Step("Открыть страницу")
    public void open() {
        driver.get(FORGOT);
    }

    @Step("Нажать кнопку Войти на странице восстановления пароля")
    public LoginPage pressButtonLogin() {
        driver.findElement(buttonLogin).click();
        return new LoginPage();
    }
}
