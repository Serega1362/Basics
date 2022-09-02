package OneBasicsOfSoftwareCodeDevelopment.Branch;

/*Даны два угла треугольника (в градусах). Определить, существует ли такой
треугольник, и если да, то будет ли он прямоугольным
*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа в градусах:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 180 - a - b;
        if (a > 0 && b > 0 && c > 0) {
            System.out.println("Треугольник существует");
            if (a == 90 || b == 90 || c == 90)
                System.out.println("Треугольник прямоугольный");
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}