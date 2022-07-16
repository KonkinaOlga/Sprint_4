package ru.yandex.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OrderPage extends BasePage {

    //локатор инпута "Имя" * Имя
    private final By inputName = By.xpath(".//input[@placeholder='* Имя']");

    // локатор инпута "Фамилия"
    private final By inputSurname = By.xpath(".//input[@placeholder='* Фамилия']");

    // локатор инпута "Адрес"
    private final By inputAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

    // локатор инпута "Станция метро"
    private final By inputMetroStation = By.xpath(".//input[@placeholder='* Станция метро']");

    // локатор инпута "Телефон"
    private final By inputPhone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    // локатор кнопки "Далее" НЕ РАБОТАЕТ
    private final By buttonNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    // локатор инпута "Когда привезти"
    private final By inputOrderDate = By.xpath(".//div[@class ='react-datepicker__input-container']/input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");

    // локатор для чек-бокса "черный" rentalPeriod
    private final By checkBoxBlack = By.id("black");

    // локатор для инпута длительность
    private final By dropdownOrderPeriod = By.className("Dropdown-control");

    // локатор элемента в списке выбора периода
    private final By elementDropdownOrderPeriod = By.xpath(".//div[text() ='двое суток']");

    // локатор для чек-бокса "серый" rentalPeriod
    private final By checkBoxGrey = By.id("grey");

    // локатор кнопки "Комментарий" comment
    private final By inputComment = By.xpath(".//input[@placeholder='Комментарий для курьера']");

    // локатор инпута "Заказать"
    private final By buttonBuy = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");

    // локатор попапа "Хотите оформить заказ?" Order_ModalHeader__3FDaJ
    private final By orderModalWindow = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ']");

    // локатор кнопки "Да"
    private final By buttonOrderYes = By.xpath(".//button[text() ='Да']");

    // локатор текста "Заказ оформлен"
    private final By orderModalHeader = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ']");


    //конструктор
    public OrderPage (WebDriver driver){
        super(driver);
    }

    // заполнить Имя
    public OrderPage setName(String name){
        driver.findElement(inputName).sendKeys(name);
        return this;
    }

    // заполнить Фамилию
    public OrderPage setSurname(String surname){
        driver.findElement(inputSurname).sendKeys(surname);
        return this;
    }

    // заполнить Адрес
    public OrderPage setAddress(String address){
        driver.findElement(inputAddress).sendKeys(address);
        return this;
    }

    // заполнить Станцию метро (хак со стрелочкой сперла из обсуждения, адов ад)
    public OrderPage setMetroStation(String metroStation){
        driver.findElement(inputMetroStation).sendKeys(metroStation + Keys.ARROW_DOWN + Keys.ENTER);
        return this;
    }

    // заполнить Телефонный номер
    public OrderPage setPhoneNumber(String phoneNumber){
        driver.findElement(inputPhone).sendKeys(phoneNumber);
        return this;
    }

    // нажать "Далее"
    public OrderPage clickButtonNext(){
        driver.findElement(buttonNext).click();
        return this;
    }
    // заполнить дату доставки
    public OrderPage  setOrderDate(String orderDate) {
        driver.findElement(inputOrderDate).sendKeys(orderDate + Keys.ARROW_DOWN + Keys.ENTER);
        return this;
    }

    // заполнить срок аренды
    public OrderPage selectRentalPeriod() {
        driver.findElement(dropdownOrderPeriod).click();
        driver.findElement(elementDropdownOrderPeriod).click();
        return this;
    }

    // выбрать цвет
    public OrderPage selectScooterColour(String scooterColour){
        if (scooterColour.equals("Серый")){
            driver.findElement(checkBoxGrey);
        }
        driver.findElement(checkBoxBlack);
        return this;
    }

    //заполнить комментарий
    public OrderPage setOderComment(String orderComment) {
        driver.findElement(inputComment).sendKeys(orderComment);
        return this;
    }

    //кликнуть кнопку "Заказать"
    public OrderPage clickButtonBy() {
        driver.findElement(buttonBuy).click();
        return this;
    }

    // подтвердить оформление заказа
    public OrderPage clickButtonOrderYes() {
        driver.findElement(buttonOrderYes).click();
        return this;
    }
    // получение текста "Статус заказа"
    public String getTextInOrderModalHeader (){
        return  driver.findElement(orderModalHeader).getText();
    }

}

