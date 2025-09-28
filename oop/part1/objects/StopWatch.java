package oop.part1.objects;

/*
Задание №6: Класс StopWatch
Создайте класс с именем StopWatch для представления секундомера. Класс StopWatch должен содержать:

Скрытые поля данных startTime и endTime с getter-методами.
Безаргументный конструктор, который инициализирует startTime с текущим временем.
Метод с именем start(), который сбрасывает startTime до текущего времени.
Метод с именем stop(), который присваивает endTime текущее время.
Метод с именем getElapsedTime(), который возвращает прошедшее время на секундомере в миллисекундах.
Нарисуйте UML-диаграмму класса StopWatch, а затем реализуйте этот класс. Напишите клиент этого класса – программу, которая вычисляет время выполнения сортировки 100 000 чисел методом выбора.
 */

/*
        +----------------------+
        |      StopWatch       |
        +----------------------+
        | - startTime: long    |
        | - endTime: long      |
        +----------------------+
        | + StopWatch()        |
        | + start(): void      |
        | + stop(): void       |
        | + getElapsedTime(): long |
        | + getStartTime(): long  |
        | + getEndTime(): long    |
        +----------------------+
 */

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
