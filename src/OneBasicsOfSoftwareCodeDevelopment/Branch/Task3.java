package OneBasicsOfSoftwareCodeDevelopment.Branch;

/*
Даны три точки A(x1, y1), B(x2, y2) и C(x3, y3).
Определить будут ли они расположены на одной прямой.
*/

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты трёх точек:");
        System.out.println("Введите координаты точки A:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Введите координаты точки B:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Введите координаты точки C:");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int count1 = x2 - x1;
        int count2 = x3 - x1;
        int count3 = y2 - y1;
        int count4 = y3 - y1;
        int result = count1 * count4 - count3 * count2;
        if (result==0){
            System.out.println("Точки лежат на одной прямой");
        }else{
            System.out.println("Точки не лежат на одной прямой");
        }

    }
}