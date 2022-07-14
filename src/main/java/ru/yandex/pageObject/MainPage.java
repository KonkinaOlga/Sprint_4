package ru.yandex.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

    // URL главной странички
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";

    // кнопка "Заказать" вверху странички
    private final By buttonNext = By.xpath(".//button[@class='Button_Button__ra12g']");

    // первый вопрос "Сколько стоит? М как оплатить?"
    private final By firstQuestion = By.id("accordion__heading-0");

    // второй вопрос "Хочу сразу несколько самокатов! Так можно?"
    private final By secondQuestion = By.id("accordion__heading-1");

    // третий вопрос "Как рассчитывается время аренды?"
    private final By thirdQuestion = By.id("accordion__heading-2");

    // четвертый вопрос "Можно ли заказать самокат прямо на сегодня?"
    private final By fourthQuestion = By.id("accordion__heading-3");

    // пятый вопрос "Можно ли продлить заказ или вернуть самокат раньше?"
    private final By fifthQuestion = By.id("accordion__heading-4");

    // шестой вопрос "Вы привозите зарядку вместе с самокатом?"
    private final By sixthQuestion = By.id("accordion__heading-5");

    // седьмой вопрос "Можно ли отменить заказ?"
    private final By seventhQuestion = By.id("accordion__heading-6");

    // восьмой вопрос "Я жизу за МКАДом, привезёте?"
    private final By eighthQuestion = By.id("accordion__heading-7");


    // конструктор
    public MainPage(WebDriver driver) {
        super(driver);
    }

    //клик по верхней кнопке
    public OrderPage clickButtonOrder() {
        driver.findElement(buttonNext).click();
        return new OrderPage(driver);
    }

    //подскроллить к элементу
    private void scrollTo (WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    // достаем текст первого элемента
    public WebElement getFirstQuestion() {
        WebElement element = driver.findElement(firstQuestion);
        scrollTo(element);
        return element;
    }

    // достаем текст второго элемента
    public WebElement getSecondQuestion() {
        WebElement element = driver.findElement(secondQuestion);
        scrollTo(element);
        return element;
    }

    // достаем текст третьего элемента
    public WebElement getThirdQuestion() {
        WebElement element = driver.findElement(thirdQuestion);
        scrollTo(element);
        return element;
    }

    // достаем текст четвертого элемента
    public WebElement getFourthQuestion() {
        WebElement element = driver.findElement(fourthQuestion);
        scrollTo(element);
        return element;
    }

    // достаем текст пятого элемента
    public WebElement getFifthQuestion() {
        WebElement element = driver.findElement(fifthQuestion);
        scrollTo(element);
        return element;
    }

    // достаем текст шестого элемента
    public WebElement getSixthQuestion() {
        WebElement element = driver.findElement(sixthQuestion);
        scrollTo(element);
        return element;
    }

    // достаем текст седьмого элемента
    public WebElement getSeventhQuestion() {
        WebElement element = driver.findElement(seventhQuestion);
        scrollTo(element);
        return element;
    }

    // достаем текст восьмого элемента
    public WebElement getEighthQuestion() {
        WebElement element = driver.findElement(eighthQuestion);
        scrollTo(element);
        return element;
    }

    //     клик по нижней кнопке
//    public OrderPage clickButtonOrder2() {
//        driver.findElement(buttonNext2).click();
//        return new OrderPage(driver);
//   }

}
