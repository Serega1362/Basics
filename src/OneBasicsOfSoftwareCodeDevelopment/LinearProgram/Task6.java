package OneBasicsOfSoftwareCodeDevelopment.LinearProgram;

/*
Составить программу, которая печает true, если точка с кординатами (x,y)
принадлежат закрашенной области, и false - в противном случае.
 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x >= -4 && x <= 4 && y <= 4 && y >= -3) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }
}
