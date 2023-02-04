package javaHM.Hm1;

import java.util.Scanner;

public class Hm4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число - ");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число - ");
        double num2 = scanner.nextDouble();
        System.out.println("Результат сложения - " + Hm4Methode.sum(num1,num2));
        System.out.println("Резултат вычетания - " + Hm4Methode.minus(num1,num2));
        System.out.println("Резултат умножения - " + Hm4Methode.multi(num1,num2));
        System.out.println("Резултат деления - " + Hm4Methode.div(num1,num2));


    }
}
