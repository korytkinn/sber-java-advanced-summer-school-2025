package oop.part1.objects;

import java.util.Random;


public class StopWatchClient {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int arraySize = 100000;
        int maxValue = 10;
        int[] data = randomArrayGenerator(arraySize, maxValue);

        int[] sorted_data = new int[data.length];

        stopWatch.start();
        sorted_data = selectionSort(data);
        stopWatch.stop();

        System.out.printf("Вычисление времени сортировки %d чисел\n", arraySize);
        System.out.println("Время начала работы: " + stopWatch.getStartTime() + " мс");
        System.out.println("Время окончания работы: " + stopWatch.getEndTime() + " мс");
        System.out.println("Время выполнения работы: " + stopWatch.getElapsedTime() / 1000.0 + " секунд");

        System.out.println("\nПроверка.");
        System.out.println("Первые 5 элементов массива:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", sorted_data[i]);
        }
        System.out.println();
        System.out.println("\nПоследние 5 элементов массива:");
        for (int i = arraySize - 5; i < arraySize; i++) {
            System.out.printf("%d ", sorted_data[i]);
        }
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int pos = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    pos = j;
                    min = arr[j];
                }
            }
            arr[pos] = arr[i];
            arr[i] = min;
        }
        return arr;
    }

    public static int[] randomArrayGenerator(int size, int maxValue) {
        int[] data = new int[size];

        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(maxValue);
        }
        return data;
    }
}
