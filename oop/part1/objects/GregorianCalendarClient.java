package oop.part1.objects;

import java.util.GregorianCalendar;

/*
Задание №5: Класс GregorianCalendar
У Java API в пакете java.util есть класс GregorianCalendar, который можно использовать для получения года, месяца и дня даты.
Безаргументный конструктор создает объект типа GregorianCalendar для текущей даты,
а методы get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH) и get(GregorianCalendar.DAY_OF_MONTH)
возвращают год, месяц (от 0 до 11) и день. Напишите программу для выполнения следующих двух задач:

1. Отобразите текущий год, месяц и день.

2. У класса GregorianCalendar есть метод setTimeInMillis(long),
который можно использовать для задания указанного времени, прошедшего с 1 января 1970 г.
Установите значение, равное 1234567898765L, и отобразите для него год, месяц и день.
 */
public class GregorianCalendarClient {

    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.printf("Текущий год: %d, месяц: %d, день: %d\n", gc.get(GregorianCalendar.YEAR), gc.get(GregorianCalendar.MONTH), gc.get(GregorianCalendar.DAY_OF_MONTH));
        gc.setTimeInMillis(1234567898765L);
        System.out.printf("Обновленный год: %d, месяц: %d, день: %d\n", gc.get(GregorianCalendar.YEAR), gc.get(GregorianCalendar.MONTH), gc.get(GregorianCalendar.DAY_OF_MONTH));

    }
}
