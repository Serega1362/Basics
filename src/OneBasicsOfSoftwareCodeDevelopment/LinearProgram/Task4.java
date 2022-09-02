package OneBasicsOfSoftwareCodeDevelopment.LinearProgram;

// Поменять местами дробную и целую часть числа и вывести значение

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дробное число:");
        double a = sc.nextDouble();
        double b = (a * 1000) % 1000 + (int) a /1000.0;
        System.out.println(b);
    }
}