package ru.yandex.Tests;

import org.junit.Test;
import ru.yandex.pageObject.MainPage;

import static org.junit.Assert.assertEquals;


public class DropdownQuestionsAboutImportantTest extends BaseUiTest {

     @Test
    public void CheckingTextInQuestionAboutCost(){
         driver.get(MainPage.URL);
         MainPage page = new MainPage(driver);
         assertEquals ("Текст не соответствует ожидаемому","Сколько это стоит? И как оплатить?",page.getQuestionAboutCost().getText());
     }

    @Test
    public void CheckingTextInQuestionAboutMassRental(){
        driver.get(MainPage.URL);
        MainPage page = new MainPage(driver);
        assertEquals ("Текст не соответствует ожидаемому","Хочу сразу несколько самокатов! Так можно?",page.getQuestionAboutMassRental().getText());
    }

    @Test
    public void CheckingTextInQuestionAboutRentalTime(){
        driver.get(MainPage.URL);
        MainPage page = new MainPage(driver);
        assertEquals ("Текст не соответствует ожидаемому","Как рассчитывается время аренды?",page.getQuestionAboutRentalTime().getText());
    }

    @Test
    public void CheckingTextInQuestionAboutOrderForToday(){
        driver.get(MainPage.URL);
        MainPage page = new MainPage(driver);
        assertEquals ("Текст не соответствует ожидаемому","Можно ли заказать самокат прямо на сегодня?",page.getQuestionAboutOrderForToday().getText());
    }

    @Test
    public void CheckingTextInQuestionAboutRenewalAndRefund(){
        driver.get(MainPage.URL);
        MainPage page = new MainPage(driver);
        assertEquals ("Текст не соответствует ожидаемому","Можно ли продлить заказ или вернуть самокат раньше?",page.getQuestionAboutRenewalAndRefund().getText());
    }

    @Test
    public void CheckingTextInQuestionAboutCharger(){
        driver.get(MainPage.URL);
        MainPage page = new MainPage(driver);
        assertEquals ("Текст не соответствует ожидаемому","Вы привозите зарядку вместе с самокатом?",page.getQuestionAboutCharger().getText());
    }

    @Test
    public void CheckingTextInQuestionAboutOrderCancellation(){
        driver.get(MainPage.URL);
        MainPage page = new MainPage(driver);
        assertEquals ("Текст не соответствует ожидаемому","Можно ли отменить заказ?",page.getQuestionAboutOrderCancellation().getText());
    }

    @Test
    public void CheckingTextInQuestionAboutDelivery(){
        driver.get(MainPage.URL);
        MainPage page = new MainPage(driver);
        assertEquals ("Текст не соответствует ожидаемому","Я жизу за МКАДом, привезёте?",page.getQuestionAboutDelivery().getText());
    }
}
