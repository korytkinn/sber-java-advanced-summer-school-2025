package oop.part1.objects;

/*
Задание №7: Класс Location
Создайте класс с именем Location для нахождения наибольшего элемента и его позиции в двумерном массиве. Класс должен содержать public-поля row, column и maxValue, в которых будут храниться наибольший элемент типа double и его индексы в двумерном массиве со строчками и столбцами типа int.

Напишите следующий метод, который возвращает позицию наибольшего элемента в двумерном массиве:

public static Location locateLargest(double[][] a)
Возвращаемое значение должно быть типа Location. Напишите клиент этого класса — программу, которая предлагает пользователю ввести двумерный массив и отображает позицию наибольшего элемента в этом массиве. Пример выполнения программы:

Введите количество строчек и столбцов массива: 3 4
Введите массив:
23.5 35 2 10
4.5 3 45 3.5
35 44 5.5 9.6
Наибольший элемент массива, равный 45.0, находится в позиции (1, 2)

 */

public class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location() {
        this.row = 0;
        this.column = 0;
        this.maxValue = 0.0;
    }

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] a) {
        double maxValue = a[0][0];
        int maxRow = 0;
        int maxColumn = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    maxRow = i;
                    maxColumn = j;
                }

            }
        }
        return new Location(maxRow, maxColumn, maxValue);
    }
}
