package oop.part1.objects;

import java.util.Random;

/*
Задание №4: Класс Random
Напишите программу, которая создает объект типа Random с начальным (случайным) значением 1000 и отображает первые 50 случайных целых чисел между 0 и 100 с помощью метода nextInt(100).
 */

public class RandomClient {
    public static void main(String[] args) {
        Random randomNumber = new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.println(randomNumber.nextInt(100));
        }
    }
}
