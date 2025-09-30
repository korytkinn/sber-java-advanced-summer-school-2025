package oop.part1.thinking;

public class MyTimeClient {
    public static void main(String[] args) {
        MyTime first = new MyTime();
        MyTime second = new MyTime(555550000);
        MyTime third = new MyTime(5, 23, 55);

        System.out.printf("Время текущее: %d:%d:%d\n", first.getHour(), first.getMinute(), first.getSecond());
        System.out.printf("Время для 555550000 мс: %d:%d:%d\n", second.getHour(), second.getMinute(), second.getSecond());
        System.out.printf("Время заданное (5:23:55): %d:%d:%d\n", third.getHour(), third.getMinute(), third.getSecond());
    }
}
