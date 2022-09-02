package OneBasicsOfSoftwareCodeDevelopment.Branch;

/*
Заданы размеры А, В прямоугольного отверстия  x, y, z кирпича.
Определить, пройдет ли кирпич через отверстие
*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размеры прямоуголного отверстия:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Введите размеры кирпича x, y, z:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x <= a && y <= b || y <= a && x <= b ||
                x <= a && z <= b || z <= a && x <= b ||
                z <= a && y <= b || y <= a && z <= b) {
            System.out.println("Пройдет");
        } else {
            System.out.println("Не пройдет");

        }
    }
}