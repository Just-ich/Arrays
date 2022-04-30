package com.company;

import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class String1 {

//1) Написать свою функцию приведения строки к числу
    public static void one(){

        String str = "Hello world and Java!";
        int  char2;
        System.out.println(str);
        char[] char1=str.toCharArray();
        System.out.println(str.toCharArray());
        for (int i = 0; i < str.length(); i++) {
            System.out.print(char1[i]+" ");
            char2=char1[i]-'0';
            System.out.print(char2+" ");
        }
    }

    //2) Проверить есть ли подстрока в строке(своя функция)
    public static void two(){
        System.out.println("Введите что-нибудь");
        Scanner scanner= new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.length()==0){
            System.out.println("Строка содержит элементов --- "+str.length());
        }else if(str.length()!=0)
        System.out.println("Строка содержит: "+str);
    }

    //3) Вывести из предложения все слова в которых есть буква "a"
    public static void tre(){
        System.out.println("Введите что-нибудь");
        Scanner scanner= new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.contains("a")){
            System.out.println("Есть ли слова содержащие букву 'a': "+ str.contains("a"));
        }
    }

    //4)Написать функцию которая проверяет является ли слово палиндромом(Одинаково читается в обоих направлениях)
    public static void forr(){
        System.out.println("Введите что-нибудь");
        Scanner scanner=new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
            char[] array = str.toCharArray();
            String result = "";
            for (int i = array.length - 1; i >= 0; i--) {
                result = result + array[i];
            }
            if (str.equals(result)){
                System.out.println("Ваше слово палидром! ---- "+str);
            }else System.out.println("Ваше слово не палидром! ---- "+str);
    }

    //5)Отсортировать массив строк по количеству букв "a"
//    public static void feif() {
//        String[] str=new String[]{"абракадабра", "ага", "абакан", "пока"};
//        int  char2;
//        //char[] str2 = new char[str.length];
//        char a='a';
//        int b = a-'0';
//
//        int schetchik=0;
//
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i].charAt(i));
//
//            str[i] = "Hello world and Java!";
//
//            System.out.println(str);
//            char[] char1=str.toCharArray();
//            System.out.println(str.toCharArray());
//            for (int i = 0; i < str.length(); i++) {
//                System.out.print(char1[i]+" ");
//                char2=char1[i]-'0';
//                System.out.print(char2+" ");
//            }
//           // if (str[i]==a)
//           // str1[i]=str[i].toCharArray();
//            //if (str[i]==a){
//           // System.out.println(str2);
//                schetchik++;
//            }
//            //System.out.println(schetchik);
//        }

       // System.out.println(st);
        //String str1="Abak an";
       // System.out.println(str1.split("a", Integer.parseInt(str1)));

}
