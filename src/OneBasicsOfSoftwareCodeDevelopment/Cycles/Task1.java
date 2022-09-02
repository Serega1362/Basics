package OneBasicsOfSoftwareCodeDevelopment.Cycles;
/*
Напишите программу, где пользователь вводит любое целое положительное число. А
программа суммирует все числа от 1 до введенного пользователем числа."
*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int a = 0;
        int sum = 0;
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        }
        else if (a > 0) {
        } else{
            System.out.println("Вы ввели число не соответствующее заданию");
            return;
        }
        for (int i = 1; i <= a; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма чисел от 1 до " + a + " = " + sum);
    }
}