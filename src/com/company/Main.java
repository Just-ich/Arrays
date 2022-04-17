package com.company;

import java.util.Arrays;



public class Main {

    public static void main(String[] args) {



        //# Cаздание массива
//        System.out.println("Введите длину массива: ");
//        Scanner scanner=new Scanner(System.in);
//        int lenght=scanner.nextInt();                 // Запрос на ввод длины массива
//        String[] number=new String[lenght];            // Саздаём массив строк с названием number
//        for (int i = 0; i < lenght; i++) {             // Записываем полученные от пользователя данные в ячейки массива,
//                                                        // кол-во ячеек пользователь ввёл выше
//            number[i]= scanner.next();                // записываем сами числа из консоли в каждую ячейку массива
//           }
        //ArrayService.dlinnoeOrKorotkoe(number,lenght);   // Передаём весь массив на поиск мин и макс числа

        ArrayService arrayService=new ArrayService();
//        arrayService.summaMassiwow();
//        arrayService.sortirowkaPuzirkom();
          arrayService.chisloVMassiw();



    }
}
