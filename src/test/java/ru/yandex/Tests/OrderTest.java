package ru.yandex.Tests;


import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
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
                {new OrderForm("Оля","Конкина", "Питер дом1", "Сокольники", "+79277765376","13.07.2022","сутки", "Серый","Коммент", true)},
                {new OrderForm("Толя","Иванова", "Москва дом2", "Сокольники", "+79277760000","15.07.2022","сутки", "Черный","Коммент", false)},
        };
    }

    @Test
    public void checkOrderFlow() {
        driver.get(MainPage.URL);
        MainPage page = new MainPage(driver);
        OrderPage orderPage;
        if (form.getIsTopButton())
            orderPage = page.clickButtonOrderAbove();
        else
            orderPage = page.clickButtonOrderBelow();

        String result = orderPage
                .setName(form.getName())
                .setSurname(form.getSurname())
                .setAddress(form.getAddress())
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

        // т.к. assertThat, который используется в курсе, deprecated
        // Assert.assertThat(result, containsString("Заказ оформлен"));
        // делаю через assertTrue
        Assert.assertTrue("Заказ не оформлен",result.contains("Заказ оформлен"));
    }

}
