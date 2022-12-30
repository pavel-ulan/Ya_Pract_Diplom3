package ru.yandex.prakticum;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import ru.yandex.prakticum.framework.Browser;
import ru.yandex.prakticum.page_objects.*;

public class BaseTest {
    public static final String VALID_NAME = "User";
    public static final String VALID_EMAIL ="User@yandex.ru";
    public static final String VALID_PASSWORD = "123456";
    public static String randomEmail = RandomStringUtils.randomAlphanumeric(10)+"@yandex.ru";
    public static String randomCorrectPassword = RandomStringUtils.randomAlphanumeric(10);
    public static String randomIncorrectPassword = RandomStringUtils.randomAlphanumeric(3);
    protected final ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
    protected final LoginPage loginPage = new LoginPage();
    protected final MainPage mainPage = new MainPage();
    protected final PersonalAccountPage personalAccountPage = new PersonalAccountPage();
    protected final RegistrationPage registrationPage = new RegistrationPage();

    @After
    public void cleanUp() {
        Browser.closeInstance();
    }
}
