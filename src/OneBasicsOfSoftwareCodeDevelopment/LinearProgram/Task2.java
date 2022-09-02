package OneBasicsOfSoftwareCodeDevelopment.LinearProgram;

//Вычислить значения выражения по формуле(переменные принимают действительный значения)

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три действительных числа:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = (Math.sqrt(Math.pow(b, 2) + 4 * a * c)+b)/2*a-(Math.pow(a,3)*c+Math.pow(b, -2));
        System.out.println("Решение:"+d);
    }
}