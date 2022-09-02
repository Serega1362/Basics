package OneBasicsOfSoftwareCodeDevelopment.Branch;

//Вычислить значение функции

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        double x = sc.nextInt();
        double f;
        if (x <= 3) {
            f = Math.pow(x, 2) - (3 * x) + 9;
        } else {
            f = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println("Значение функции F(x)= " + f);
    }
}