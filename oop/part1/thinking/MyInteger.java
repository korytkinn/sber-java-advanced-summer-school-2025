package oop.part1.thinking;

/*
Задание №9: Класс MyInteger
Создайте класс с именем MyInteger, который должен содержать:

Поле данных value типа int, в котором хранится целочисленное значение, представленное этим объектом.
Конструктор, который создает объект типа MyInteger для указанного значения типа int.
Getter-метод, который возвращает значение типа int.
Методы isEven(), isOdd() и isPrime(), которые возвращают значение true, если значение типа int в этом объекте является четным, нечетным или простым соответственно.
Статические методы isEven(int), isOdd(int) и isPrime(int), которые возвращают значение true, если указанное значение является четным, нечетным или простым соответственно.
Статические методы isEven(MyInteger), isOdd(MyInteger) и isPrime(MyInteger), которые возвращают значение true, если указанное значение является четным, нечетным или простым соответственно.
Методы equals(int) и equals(MyInteger), которые возвращают значение true, если значение типа int в этом объекте равняется указанному значению.
Статический метод parseInt(char[]), который преобразует массив числовых символов в значение типа int.
Статический метод parseInt(String), который преобразует строку в значение типа int.
Нарисуйте UML-диаграмму класса MyInteger, а затем реализуйте этот класс. Напишите клиент этого класса — программу, которая проверяет все методы этого класса.


 */
public class MyInteger {
    int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    boolean isEven() {
        return value % 2 == 0;
    }

    boolean isOdd() {
        return value % 2 != 0;
    }

    boolean isPrime() {
        if (value <= 1) return false;
        if (value == 2) return true;
        if (value % 2 == 0) return false;

        for (int i = 3; i * i <= value; i += 2) {
            if (value % i == 0) return false;
        }
        return true;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isEven(MyInteger n) {
        return n.isEven();
    }

    static boolean isOdd(MyInteger n) {
        return n.isOdd();
    }

    static boolean isPrime(MyInteger n) {
        return n.isPrime();
    }

    boolean equals(int n) {
        return value == n;
    }

    boolean equals(MyInteger n) {
        return value == n.value;
    }

    static int parseInt(char[] input) {
        return Integer.parseInt(new String(input));
    }

    static int parseInt(String input) {
        return Integer.parseInt(input);
    }


}
