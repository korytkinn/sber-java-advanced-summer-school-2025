package oop.part1.objects;

/*
Задание №2: Класс Stock
По примеру класса Circle, создайте класс Stock для представления акций компании. Класс Stock должен содержать:

Строковое поле данных с именем symbol для обозначения акций.
Строковое поле данных с именем name для наименования акций.
Поле данных previousClosingPrice типа double, в котором хранится стоимость акций на момент закрытия предыдущего дня.
Поле данных currentPrice типа double, в котором хранится стоимость акций в настоящий момент.
Конструктор, создающий акции с указанными обозначением и наименованием.
Метод с именем getChangePercent(), который возвращает процент изменения стоимости акций с previousClosingPrice на currentPrice.
Нарисуйте (на бумаге или в графическом редакторе) UML-диаграмму класса Stock,
а затем реализуйте этот класс. Напишите клиент этого класса — программу,
которая создает объект типа Stock с обозначением SBER, именем ПАО Сбербанк,
стоимостью акций на момент закрытия предыдущего дня, равной 281.50.
Задайте новую стоимость акций в настоящий момент, равную 282.87,
и отобразите процент изменения стоимости акций.
 */

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock() {
    }

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent() {
        return (((currentPrice - previousClosingPrice) / previousClosingPrice) * 100);
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setpreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
