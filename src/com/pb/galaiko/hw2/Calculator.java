package com.pb.galaiko.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        int res; //todo потом глянуть
        char operation;

        System.out.print("Введіть операцію:(+,-,*,/): ");
        operation = scan.next().charAt(0);
        System.out.print("Введіть перше число: ");
        x = scan.nextInt();
        System.out.print("Введіть друге число: ");
        y = scan.nextInt();

        boolean correct = true;

        switch (operation) {
            case '+':
                res = x + y;
                break;
            case '-':
                res = x - y;
                break;
            case '*':
                res = x * y;
                break;
            case '/':
                if (y == 0) {
                    res = 0;
                    correct = false;
                    System.out.print("Ділити на нуль не можна!");
                    break;
                } else {
                    res = x / y;
                }
                break;
            default:
                res = 0;
                correct = false;

        }
        System.out.println(correct ? "Результат:" + res : " Не вірна операція ");
    }
}

