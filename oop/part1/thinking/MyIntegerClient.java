package oop.part1.thinking;

import java.util.Arrays;
import java.util.Scanner;

public class MyIntegerClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Введите первое целое число: ");
        int firstNumber = sc.nextInt();

        System.out.println("Введите второе целое число: ");
        int secondNumber = sc.nextInt();

        System.out.println("Введите третье целое число: ");
        String thirdNumber = sc.next();
        sc.close();

        char[] thirdNumberCharArray = thirdNumber.toCharArray();

        MyInteger firstMyInteger = new MyInteger(firstNumber);
        MyInteger secondMyInteger = new MyInteger(secondNumber);

        System.out.printf("MyInteger.isEven(%d) = %b\n", firstNumber, MyInteger.isEven(firstMyInteger));
        System.out.printf("MyInteger.isOdd(%d) = %b\n", firstNumber, MyInteger.isOdd(firstMyInteger));
        System.out.printf("MyInteger.isPrime(%d) = %b\n", firstNumber, MyInteger.isPrime(firstMyInteger));

        System.out.printf("\nMyInteger.isEven(MyInteger(%d)) = %b\n", firstNumber, MyInteger.isEven(firstMyInteger));
        System.out.printf("MyInteger.isOdd(MyInteger(%d)) = %b\n", firstNumber, MyInteger.isOdd(firstMyInteger));
        System.out.printf("MyInteger.isPrime(MyInteger(%d)) = %b\n", firstNumber, MyInteger.isPrime(firstMyInteger));

        System.out.printf("\nMyInteger.isEven(%d) = %b\n", firstNumber, MyInteger.isEven(firstNumber));
        System.out.printf("MyInteger.isOdd(%d) = %b\n", firstNumber, MyInteger.isOdd(firstNumber));
        System.out.printf("MyInteger.isPrime(%d) = %b\n", firstNumber, MyInteger.isPrime(firstNumber));


        System.out.printf("\nЭкземпляр MyInteger(%d) содержит значение = %d", firstNumber, firstMyInteger.getValue());

        System.out.printf("\nЭкземпляр MyInteger(%d).equals(%d) = %b\n", firstNumber, secondNumber, firstMyInteger.equals(secondNumber));
        System.out.printf("\nMyInteger(%d).equals(MyInteger(%d)) = %b\n", firstNumber, secondNumber, firstMyInteger.equals(secondMyInteger));


        System.out.printf("Преобразование %s к виду %d\n", thirdNumber, MyInteger.parseInt(thirdNumber));
        System.out.printf("Преобразование %s к виду %d\n", Arrays.toString(thirdNumberCharArray), MyInteger.parseInt(thirdNumberCharArray));


    }
}
