package ru.yandex.Tests;


import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.data.OrderForm;
import ru.yandex.pageObject.MainPage;
import ru.yandex.pageObject.OrderPage;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class OrderTest extends BaseUiTest {
    private  final OrderForm form;

    public OrderTest(OrderForm form) {
        this.form = form;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {new OrderForm("Оля","Конкина", "Питер дом1", "Сокольники", "+79277765376","13.07.2022","сутки", "Серый","Коммент")},
                {new OrderForm("Толя","Иванова", "Москва дом2", "Сокольники", "+79277760000","15.07.2022","сутки", "Черный","Коммент")},
        };
    }

    @Test
    public void checkOrderFlow() throws InterruptedException {
        driver.get(MainPage.URL);
        MainPage page = new MainPage(driver);
        String result = page
                .clickButtonOrder()
                .setName(form.getName())
                .setSurname(form.getSurname())
                .setАddress(form.getAddress())
                .setMetroStation(form.getMetroStation())
                .setPhoneNumber(form.getPhoneNumber())
                .clickButtonNext()
                .setOrderDate(form.getOrderDate())
                .selectRentalPeriod()
                .selectScooterColour(form.getScooterColour())
                .setOderComment(form.getOrderComment())
                .clickButtonBy()
                .clickButtonOrderYes()
                .getTextInOrderModalHeader();
        assertEquals ("Заказ не оформлен","Заказ оформлен",result);
    }

}
