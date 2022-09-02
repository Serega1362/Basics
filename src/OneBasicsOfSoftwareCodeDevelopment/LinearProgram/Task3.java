package OneBasicsOfSoftwareCodeDevelopment.LinearProgram;

//Вычислить значения выражения по формуле(переменные принимают действительный значения)

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите градусы числа x и y:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = (Math.sin(Math.toRadians(x))+Math.cos(Math.toRadians(y)))/(Math.cos(Math.toRadians(x))-Math.sin(Math.toRadians(y)))*Math.tan(Math.toRadians(x*y));
        System.out.println("Решение:"+z);
    }
}