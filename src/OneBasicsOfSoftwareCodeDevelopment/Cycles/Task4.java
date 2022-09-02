package OneBasicsOfSoftwareCodeDevelopment.Cycles;

//Составить программу нахождения произведения квадратов первых двухсот чисел

import java.math.BigInteger;

public class Task4 {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.valueOf(1);
        for (long i = 2; i <= 3; i++) {
            sum = sum.multiply(BigInteger.valueOf((long) i*i));
        }
        System.out.println("Сумма произведения квадратов первых двухсот чисел равна " + sum);
    }
}

