package com.pb.galaiko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть ціле число :");
        number = scanner.nextInt();

            if(number >= 0 && number <= 14 ){
                System.out.println("Число входить в діапазон [0 -14]");
            }else if (number >= 15 && number <= 35){
                System.out.println("Число входить в діапазон [15 - 35]");
              }else if (number >= 36 && number <= 50){
                System.out.println("Число входить в діапазон [36 - 50]");
            }else if (number >= 51 && number <= 100){
                System.out.println("Число входить в діапазон [51 - 100]");
            }else {
                System.out.println("Число не входить в жодний із діапазонів: [0 -14] [15 - 35] [36 - 50] [51 - 100]");
            }
    }
}




//        Предложите пользователю ввести целое число и сохраните его в переменную с произвольным именем.
//        Программа должна выяснить в какой промежуток попадает введенное число [0 -14] [15 - 35] [36 - 50] [51 - 100].
//        Вывести на экран сообщение с подходящим промежутком.
//        Если введенное число не попадает в один из имеющихся промежутков, то вывести соответствующее сообщение.