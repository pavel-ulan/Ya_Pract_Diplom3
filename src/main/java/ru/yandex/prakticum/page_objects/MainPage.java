package ru.yandex.prakticum.page_objects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yandex.prakticum.framework.Browser;

import static ru.yandex.prakticum.framework.Const.MAIN;

public class MainPage {
    By buttonLogin = By.xpath("//*[.='Войти в аккаунт']");
    By buttonMakeOrder = By.xpath("//*[.='Оформить заказ']");
    By buttonPersonalAccount = By.linkText("Личный Кабинет");
    By textTitle = By.xpath("//h1");
    By bunsTitle = By.xpath("//h2[.='Булки']");
    By saucesTitle = By.xpath("//h2[.='Соусы']");
    By fillingsTitle = By.xpath("//h2[.='Начинки']");
    By bunsTab = By.xpath(".//div/span[text()='Булки']");
    By saucesTab = By.xpath(".//div/span[text()='Соусы']");
    By fillingsTab = By.xpath(".//div/span[text()='Начинки']");
    By activeTab = By.className("tab_tab_type_current__2BEPc");
    private final WebDriver driver = Browser.getInstance();

    @Step("Открыть страницу")
    public void open() {
        driver.get(MAIN);
    }

    @Step("Нажимаю кнопку войти в аккаунт на главной странице")
    public LoginPage pressButtonLogin() {
        driver.findElement(buttonLogin).click();
        return new LoginPage();
    }

    @Step("Нажимаю кнопку Личный кабинет")
    public LoginPage pressButtonPersonalAccount() {
        driver.findElement(buttonPersonalAccount).click();
        return new LoginPage();
    }

    @Step("Проверяю что кнопка Оформить заказ доступна")
    public boolean checkEnabledButtonMakeOrder() {
        return driver.findElement(buttonMakeOrder).isDisplayed();
    }

    @Step("Нажимаю кнопку Личный кабинет на главной странице")
    public PersonalAccountPage pressButtonPersonalAccountWithAuth() {
        driver.findElement(buttonPersonalAccount).click();
        return new PersonalAccountPage();
    }

    @Step("Проверяю что видно заголовок Соберите бургер")
    public boolean checkLogoVisible() {
        return driver.findElement(textTitle).isDisplayed();
    }

    @Step("Выбираю раздел Булки")
    public MainPage chooseBunsTab() {
        driver.findElement(bunsTab).click();
        return this;
    }

    @Step("Выбираю раздел Coусы")
    public MainPage chooseSaucesTab() {
        driver.findElement(saucesTab).click();
        return this;
    }

    @Step("Выбираю раздел Начинки")
    public MainPage chooseFillingsTab() {
        driver.findElement(fillingsTab).click();
        return this;
    }

    @Step("Проверяю активный раздел")
    public String getActiveSection() {
        return driver.findElement(activeTab).getText();
    }

    @Step("Проверяю активный раздел")
    public boolean checkActiveSectionIs(String section) {
        return driver.findElement(activeTab).getText().equals(section);
    }
}

