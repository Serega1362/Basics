package OneBasicsOfSoftwareCodeDevelopment.Branch;

//Найти max{min(a,b), min(c,d)}

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите четрые числа:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("Максимальное число из четырёх чисел:" + Math.max(Math.min(a, b), Math.min(c, d)));
    }
}