package ru.yandex.prakticum.page_objects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yandex.prakticum.framework.Browser;

import static ru.yandex.prakticum.framework.Const.PERSON;

public class PersonalAccountPage {
    By buttonExit = By.xpath(".//button[text()='Выход']");
    By buttonConstructor = By.linkText("Конструктор");
    By logo = By.className("AppHeader_header__logo__2D0X2");
    private final WebDriver driver = Browser.getInstance();

    @Step("Открыть страницу")
    public void open() {
        driver.get(PERSON);
    }

    @Step("Проверяю доступность кнопки Выход в личном кабинете")
    public boolean checkButtonExitEnabled() {
        return driver.findElement(buttonExit).isEnabled();
    }

    @Step("Нажимаю на кнопку Выход")
    public LoginPage pressButtonExit() {
        driver.findElement(buttonExit).click();
        return new LoginPage();
    }

    @Step("Нажимаю на кнопку Конструктор из Личного кабинета")
    public MainPage pressButtonConstructor() {
        driver.findElement(buttonConstructor).click();
        return new MainPage();
    }

    @Step("Нажимаю на Лого из Личного кабинета")
    public MainPage pressLogo() {
        driver.findElement(logo).click();
        return new MainPage();
    }
}
