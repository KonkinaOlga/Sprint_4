package ru.yandex.data;

public class OrderForm {
    private  String name;
    private  String surname;
    private  String address;
    private  String metroStation;
    private  String phoneNumber;
    private  String orderDate ;
    private  String rentalPeriod;
    private  String scooterColour;
    private  String orderComment;

    public OrderForm (String name, String surname, String address, String metroStation, String phoneNumber, String orderDate, String rentalPeriod, String scooterColour, String orderComment) {
        this.setName(name);
        this.setSurname(surname);
        this.setAddress(address);
        this.setMetroStation(metroStation);
        this.setPhoneNumber(phoneNumber);
        this.setOrderDate(orderDate);
        this.setRentalPeriod(rentalPeriod);
        this.setScooterColour(scooterColour);
        this.setOrderComment(orderComment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMetroStation() {
        return metroStation;
    }

    public void setMetroStation(String metroStation) {
        this.metroStation = metroStation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getRentalPeriod() {
        return rentalPeriod;
    }

    public void setRentalPeriod(String rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }

    public String getScooterColour() {
        return scooterColour;
    }

    public void setScooterColour(String scooterColour) {
        this.scooterColour = scooterColour;
    }

    public String getOrderComment() {
        return orderComment;
    }

    public void setOrderComment(String orderComment) {
        this.orderComment = orderComment;
    }
}
