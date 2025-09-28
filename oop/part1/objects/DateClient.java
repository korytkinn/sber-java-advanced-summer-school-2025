package oop.part1.objects;

import java.util.Date;

/*
Задание №3: Класс Date
Напишите программу, которая создает объект Date,
устанавливает у него прошедшее время,
равным 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000 и 100000000000,
и отображает дату и время с помощью метода toString(), соответственно.
 */

public class DateClient {
    public static void main(String[] args) {
        long[] timeLength = {10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 10000000000L, 100000000000L};
        for (int i = 0; i < timeLength.length; i++) {
            Date date = new Date(timeLength[i]);
            System.out.println(date.toString());
        }
    }
}
