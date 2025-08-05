package oop.part1.objects;

public class StockClient {
    public static void main(String[] args) {
        Stock SBER = new Stock("SBER", "ПАО Сбербанк");

        SBER.setpreviousClosingPrice(281.50);
        SBER.setCurrentPrice(282.87);

        System.out.println("Стоимость акций на момент закрытия предыдущего дня = " + SBER.getPreviousClosingPrice());
        System.out.println("Стоимость акций в настоящий момент = " + SBER.getCurrentPrice());
        System.out.println("Процент изменения стоимости акций = " + SBER.getChangePercent() + " %");

    }
}
