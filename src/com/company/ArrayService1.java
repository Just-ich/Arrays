package com.company;

import java.awt.*;
import java.util.*;

public class ArrayService1 {


    //№1 ЗАДАНИЕ maxChisloMassiwa
    public static void maxChisloMassiwa() {
        int[] array = {3, 34, 1, 200, 1000, 4, 3, 5};
        int max = 0, min = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(" Максимальное число: " + max);
        System.out.println(" Миниимальное число: " + min);
    }

    //forEach
    public static void forEach() {
        System.out.println("Введите длину массива№1: ");
        Scanner scanner = new Scanner(System.in);
        int lenght = scanner.nextInt();
        String[] number = new String[lenght];
        for (int i = 0; i < lenght; i++) {
            number[i] = scanner.next();
        }

        for (String num : number) {
            System.out.print(num + " ");
        }

    }

    // Cумма чётных чисел
    public static void binarry() {
        int[] bin = {12, 23, 443, 35, 6, 10, 279, 2};
        int summ = 0;
        for (int tek : bin) {
            if (tek % 2 == 0) {
                summ += tek;
            }
        }
        System.out.println("Cумма чётных чисел: " + summ);
    }



//ДЗ  22.04.22
//1)В массиве найти количество положительных элементов.
    public static void pologChislo(){

    //Циклом For
        int[] chilso= {-2, 1,-5,11,10,-4,6,-3,7 };
        int chisloPalog=0;
            for (int i = 0; i < chilso.length; i++) {
                if (chilso[i] > 0) {
                    chisloPalog++;
                    System.out.print(chilso[i]+" ");
                }
            }
            System.out.println("\nколичество положительных элементов, цикл For: " + chisloPalog);

        ////Циклом For each
        int[] chilso1= {-2, 1,-5,11,10,-4,6,-3,7 };
        int chisloPalog1=0;
        for (int tek: chilso1) {
            if ( tek> 0) {
                chisloPalog1++;
                System.out.print(tek+" ");
            }
        }
        System.out.println("\nколичество положительных элементов, цикл For each: " + chisloPalog1);
    }

    //2)Дан массив. Найти среднее арифметическое его элементов.
    // Вывести на экран только те элементы массива, которые больше найденного среднего арифметического.   35-14
    public static void sredneeArefm(){
        double[] chilso= {-2, 1,-5,11,10,-4,6,-3,7 };
        double sredneeAref=0;
        for (double i=0; i< chilso.length;i++){
            sredneeAref+=chilso[(int) i]/chilso.length;
        }
        System.out.println("среднее арифметическое (-2, 1,-5,11,10,-4,6,-3,7): "+sredneeAref);
        System.out.print("Больше ср.арефм.: ");
        for (int i = 0; i < chilso.length; i++) {
            if (chilso[i]>sredneeAref){
                System.out.print(chilso[i]+", ");
            }

        }
    }

   // 3)Из массива удалить все повторяющиеся элементы (дубликаты) так,
   // чтобы каждое значение встречалось в массиве только один раз.

    public static void isklDublikatow(){
        double[] chilso= {-2, 1,-5,11,10, -2,-5,11,-2,1,1,4 };
        System.out.println(Arrays.toString(chilso));
//        System.out.println(chilso.length);
//        for (int i = 0; i < chilso.length; i++) {
//        }


        int[] nums = {-2, 1,-5,11,10, -2,-5,11,-2,1,1,4};

        int n = nums.length;    //12

        for (int i = 0, m = 0; i != n; i++, n = m) {    // счётчик не равен длине массива
            System.out.println(m+" sdgdfgb");                                 //n =0
            for (int j = m = i + 1; j != n; j++) {      //1!=12
                                                        //m=1
                if (nums[j] != nums[i]) {
                    if (m != j) nums[m] = nums[j];
                    m++;
                }
            }
        }

        if (n != nums.length) {
            int[] b = new int[n];
            for (int i = 0; i < n; i++)
                b[i] = nums[i];
                nums = b;
        }

        for (int x : nums) System.out.print(x + " ");
        System.out.println();
    }
   // }


   // 4)Добавить элемент в массив(вводим место на которое будем добавлять, массив, что будем добавлять)
    public static void dobawElements(){

    }

    //5)Найдите сумму и количество элементов массива,
    // находящихся между a и b, a и b ввести с клавиатуры
    public static void numberFaif() {
        int a, b, summ=0, kolwo=0;;
        int[] chilso = {-2, 1, -5, 11, 10, -2, -5, 11, -2, 1, 1, 4};
        System.out.println("Элементы массива:" +Arrays.toString(chilso));
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число 'a' ( с какого индекса массива начать вывод) " );
        a=scanner.nextInt();
        System.out.println("Введите число 'b' (по какой индекс массива закончить вывод)" );
        b=scanner.nextInt();
        for (int i=a; i<=b;i++){
            summ+=chilso[i];
            kolwo++;
        }
        System.out.println("Сумма элементов: "+summ+", количество элементов: "+kolwo);
    }



    //ДЗ за 23.04.22
    //1) Найти сумму элементов каждого столбца в матрице
    public static void summEl() {
        int[][] number = {{2, 3,9,10,1},
                          {5, 6,1,10,1},
                          {5, 6,1,10,1},
                          {1, 1,1,1,1},};
        int[][] ready=new int[1][number[0].length];
        for (int i = 0; i < number.length; i++) {
            for (int k = 0; k < number[0].length; k++) {
                ready[0][k]+=number[i][k];
            }
        }
        for (int i = 0; i < number[0].length; i++)
            System.out.print(ready[0][i]+"  ");
    }



    //2)  Построить матрицу из звёздочек в зависимости от введенного n, пример для n = 3:
    //
    ////        * * *
    //
    ////        * *
    //
    ////        *
    public static void matrixStar(){
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int z=scanner.nextInt();
        char simbol='*';
        char[][] number= new char[x][z];
        int chislo=number.length;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < chislo; j++) {
                number[i][j]=simbol;
                System.out.print(number[i][j]+"  ");
            }
            chislo--;
              System.out.println( );

        }

    }

    //3) Посчитать сумму элементов по краям матрицы

    public static void summEl1() {



        int i1 = 1, i2=2;
        int[][] number = {{2, 3,9,1,10},
                          {5, 6,1,20,10},
                          {1,1,1,1,10}};
        for (int i = 0; i < 1; i++) {
            for (int k = 0; k < number[i].length; k+=number[i].length-1) {
                number[i][k] += number[i+i1][k]+number[i+i2][k];
                System.out.print(number[i][k]+"  ");
            }
        }
    }


    //4)Найти среднее арифметическое для каждой строки матрицы
    public static void sredArDwumArray(){
        double summ=0;
        double[][] number={{2,1,3},
                        {3,3,3}};
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                summ+=number[i][j];
            }
            System.out.println(summ/ number[i].length);
            summ=0;

        }
    }




}
