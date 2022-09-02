package OneBasicsOfSoftwareCodeDevelopment.Cycles;

// Вычислить значение функции на отрезке [a,b] с шагом h:

import java.util.Scanner;

//Вычислить значения функции на отрезке [а,b] c шагом h

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите два числа для отрезка [a,b]: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Введите шаг h для отрезка [a,b]: ");
        int h = sc.nextInt();
        int y;
        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = i * (-1);
            }
            System.out.println("При x = " + i + " y = " + y);
        }
        System.out.println();
    }
}