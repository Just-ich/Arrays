package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayService {

    //№1 ЗАДАНИЕ
    public static void dlinnoeOrKorotkoe(String[] number, int lenght) {
        int korotkoe = number[0].length();
        int dl = number[0].length();
        String korotkoe1 = number[0];
        String dlinnoe1 = number[0];
        for (int i = 0; i < lenght; i++) {
            if (number[i].length() < korotkoe) {
                korotkoe = number[i].length();
                korotkoe1 = number[i];
            }
            if (number[i].length() > dl) {
                dl = number[i].length();
                dlinnoe1 = number[i];
            }
        }
        System.out.println("Min: " + korotkoe1);
        System.out.println("Max: " + dlinnoe1);
    }


    //№4 and ЗАДАНИЕ
    // ввести 2 массива и создать 3й, который включает и 1й и 2й массивы
    public static void summaMassiwow() {

        // 1й массив
        System.out.println("Введите длину массива№1: ");
        Scanner scanner1 = new Scanner(System.in);
        int lenght1 = scanner1.nextInt();

        String[] number1 = new String[lenght1];
        for (int i = 0; i < lenght1; i++) {
            number1[i] = scanner1.next();
            System.out.println("Массив №1: " + number1[i]);
        }


        //2й массив
        System.out.println("Введите длину массива№2: ");
        Scanner scanner2 = new Scanner(System.in);
        int lenght2 = scanner2.nextInt();

        String[] number2 = new String[lenght2];
        for (int i = 0; i < lenght2; i++) {
            number2[i] = scanner2.next();
            System.out.println("Массив №2: " + number2[i]);
        }


        //3й массив, состоит из 1го и 2-го
        System.out.println("Вывод 1-го и 2-го массива в 3-ем массиве: ");
        int lenght3 = lenght1 + lenght2;
        String[] number3 = new String[lenght3];
        for (int i = 0; i < lenght1; i++) {
            number3[i] = number1[i];
        }
        for (int i = lenght1; i < lenght1 + lenght2; i++) {
            number3[i] = number2[i - lenght1];
        }
        System.out.println(Arrays.toString(number3));
    }



    //#3 сортировка пузырьком
    public static void sortirowkaPuzirkom() {
        int[] array = {3, 34, 1, 0, 4, 34546};
        int temp;
        boolean a = false;
        while (!a) {
            a = true;

            for (int i = 0; i < array.length -1; i++) {
                if (array[i] > array[i + 1]) {
                    a=false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                }
                System.out.println(" "+array[i]);
            }
        }
        System.out.print(Arrays.toString(array));
    }


    //#5 Число в массив 12345
    public static void chisloVMassiw() {

        int x = 23564574;
        String s = Integer.toString(x);
        int[] array = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            array[i] = x % 10;
            x /= 10;
        }
        System.out.println(Arrays.toString(array));
    }




}
