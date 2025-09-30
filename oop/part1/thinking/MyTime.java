package oop.part1.thinking;

/*
Задание №8: Класс MyTime
Создайте класс MyTime для представления времени. Класс MyTime должен содержать:

Поля данных hour, minute и second, которые представляют время.
Безаргументный конструктор, который создает объект типа MyTime для текущего времени. (Значения полей данных этого объекта представляют текущее время.)
Конструктор, который создает объект типа MyTime с указанным временем в миллисекундах, прошедших с 00:00, 1 января 1970 г. (Значения полей данных этого объекта будут представлять это время.)
Конструктор, который создает объект типа MyTime с указанными часами, минутами и секундами.
Три getter-метода для полей данных hour, minute и second соответственно.
Метод с именем setTime(long elapseTime), который присваивает объекту новое время с помощью прошедшего времени. Например, если прошедшее время равно 555550000 миллисекундам, то hour равно 10, minute равно 19, а second равно 10.
Нарисуйте UML-диаграмму класса MyTime, а затем реализуйте этот класс. Напишите клиент этого класса — программу, которая создает три объекта типа MyTime (с помощью new MyTime(), new MyTime(555550000) и new MyTime(5, 23, 55)) и отображает значениях их полей данных hour, minute и second в формате часы:минуты:секунды.

(Подсказка: первые два конструктора извлекут значения hour, minute и second из прошедшего времени. Для безаргументного конструктора текущее время может быть получено с помощью метода System.currentTimeMillis(), как было показано в программе ShowCurrentTime из курса «Основы Java-программирования». Пусть время будет GMT.)


 */

public class MyTime {
    int hour;
    int minute;
    int second;

    public MyTime() {
        setTime(System.currentTimeMillis());
    }

    public MyTime(long elapseTime) {
        setTime(elapseTime);
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        long totalSeconds = elapseTime / 1000;
        this.second = (int) totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        this.minute = (int) totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        this.hour = (int) totalHours % 24;

    }
}
