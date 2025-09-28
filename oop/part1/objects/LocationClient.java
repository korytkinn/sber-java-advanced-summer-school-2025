package oop.part1.objects;

import java.util.Scanner;


public class LocationClient {
    public static void main(String[] args) {
        LocationClient client = new LocationClient();

        System.out.printf("Введите количество строчек и столбцов массива:\n");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        double[][] matrix = new double[row][column];

        System.out.println("\nВведите массив:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                String tmpStr = scanner.next();
                matrix[i][j] = Double.parseDouble(tmpStr);
            }
        }

        Location res = Location.locateLargest(matrix);
        System.out.printf("\nНаибольший элемент массива, равный %.1f, находится в позиции (%d, %d)", res.maxValue, res.row, res.column);

    }
}
