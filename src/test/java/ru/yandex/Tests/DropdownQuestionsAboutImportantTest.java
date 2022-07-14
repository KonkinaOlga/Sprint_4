package ru.yandex.Tests;

import org.junit.Test;
import ru.yandex.pageObject.MainPage;

import static org.junit.Assert.assertEquals;


public class DropdownQuestionsAboutImportantTest extends BaseUiTest {

     @Test
    public void firstElement(){
         driver.get(MainPage.URL);
         MainPage page = new MainPage(driver);
         assertEquals ("Текст не соответствует ожидаемому","Сколько это стоит? И как оплатить?",page.getFirstQuestion().getText());
     }

    @Test
    public void secondElement(){
        driver.get(MainPage.URL);
        MainPage page = new MainPage(driver);
        assertEquals ("Текст не соответствует ожидаемому","Хочу сразу несколько самокатов! Так можно?",page.getSecondQuestion().getText());
    }

    @Test
    public void thirdElement(){
        driver.get(MainPage.URL);
        MainPage page = new MainPage(driver);
        assertEquals ("Текст не соответствует ожидаемому","Как рассчитывается время аренды?",page.getThirdQuestion().getText());
    }

    @Test
    public void fourthElement(){
        driver.get(MainPage.URL);
        MainPage page = new MainPage(driver);
        assertEquals ("Текст не соответствует ожидаемому","Можно ли заказать самокат прямо на сегодня?",page.getFourthQuestion().getText());
    }

    @Test
    public void fifthElement(){
        driver.get(MainPage.URL);
        MainPage page = new MainPage(driver);
        assertEquals ("Текст не соответствует ожидаемому","Можно ли продлить заказ или вернуть самокат раньше?",page.getFifthQuestion().getText());
    }

    @Test
    public void sixthElement(){
        driver.get(MainPage.URL);
        MainPage page = new MainPage(driver);
        assertEquals ("Текст не соответствует ожидаемому","Вы привозите зарядку вместе с самокатом?",page.getSixthQuestion().getText());
    }

    @Test
    public void seventhElement(){
        driver.get(MainPage.URL);
        MainPage page = new MainPage(driver);
        assertEquals ("Текст не соответствует ожидаемому","Можно ли отменить заказ?",page.getSeventhQuestion().getText());
    }

    @Test
    public void eighthElement(){
        driver.get(MainPage.URL);
        MainPage page = new MainPage(driver);
        assertEquals ("Текст не соответствует ожидаемому","Я жизу за МКАДом, привезёте?",page.getEighthQuestion().getText());
    }
}
