package ru.yandex.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

    // URL главной странички
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";

    // кнопка "Заказать" вверху странички
    private final By makeOrderButtonAbove = By.cssSelector(".Button_Button__ra12g");

    // кнопка "Заказать" внизу странички
    private final By makeOrderButtonBelow = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");

    // первый вопрос "Сколько стоит? М как оплатить?"
    private final By questionAboutCost = By.id("accordion__heading-0");

    // второй вопрос "Хочу сразу несколько самокатов! Так можно?"
    private final By questionAboutMassRental = By.id("accordion__heading-1");

    // третий вопрос "Как рассчитывается время аренды?"
    private final By questionAboutRentalTime = By.id("accordion__heading-2");

    // четвертый вопрос "Можно ли заказать самокат прямо на сегодня?"
    private final By questionAboutOrderForToday = By.id("accordion__heading-3");

    // пятый вопрос "Можно ли продлить заказ или вернуть самокат раньше?"
    private final By questionAboutRenewalAndRefund = By.id("accordion__heading-4");

    // шестой вопрос "Вы привозите зарядку вместе с самокатом?"
    private final By questionAboutCharger = By.id("accordion__heading-5");

    // седьмой вопрос "Можно ли отменить заказ?"
    private final By questionAboutOrderCancellation = By.id("accordion__heading-6");

    // восьмой вопрос "Я жизу за МКАДом, привезёте?"
    private final By questionAboutDelivery = By.id("accordion__heading-7");


    // конструктор
    public MainPage(WebDriver driver) {
        super(driver);
    }

    //клик по верхней кнопке
    public OrderPage clickButtonOrderAbove() {
        driver.findElement(makeOrderButtonAbove).click();
        return new OrderPage(driver);
    }

    public OrderPage clickButtonOrderBelow() {
        WebElement element = driver.findElement(makeOrderButtonBelow);
        scrollTo(element);
        element.click();
        return new OrderPage(driver);
    }

    //подскроллить к элементу
    private void scrollTo (WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    // достаем текст первого элемента
    public WebElement getQuestionAboutCost() {
        WebElement element = driver.findElement(questionAboutCost);
        scrollTo(element);
        return element;
    }

    // достаем текст второго элемента
    public WebElement getQuestionAboutMassRental() {
        WebElement element = driver.findElement(questionAboutMassRental);
        scrollTo(element);
        return element;
    }

    // достаем текст третьего элемента
    public WebElement getQuestionAboutRentalTime() {
        WebElement element = driver.findElement(questionAboutRentalTime);
        scrollTo(element);
        return element;
    }

    // достаем текст четвертого элемента
    public WebElement getQuestionAboutOrderForToday() {
        WebElement element = driver.findElement(questionAboutOrderForToday);
        scrollTo(element);
        return element;
    }

    // достаем текст пятого элемента
    public WebElement getQuestionAboutRenewalAndRefund() {
        WebElement element = driver.findElement(questionAboutRenewalAndRefund);
        scrollTo(element);
        return element;
    }

    // достаем текст шестого элемента
    public WebElement getQuestionAboutCharger() {
        WebElement element = driver.findElement(questionAboutCharger);
        scrollTo(element);
        return element;
    }

    // достаем текст седьмого элемента
    public WebElement getQuestionAboutOrderCancellation() {
        WebElement element = driver.findElement(questionAboutOrderCancellation);
        scrollTo(element);
        return element;
    }

    // достаем текст восьмого элемента
    public WebElement getQuestionAboutDelivery() {
        WebElement element = driver.findElement(questionAboutDelivery);
        scrollTo(element);
        return element;
    }

    //     клик по нижней кнопке
//    public OrderPage clickButtonOrder2() {
//        driver.findElement(buttonNext2).click();
//        return new OrderPage(driver);
//   }

}
