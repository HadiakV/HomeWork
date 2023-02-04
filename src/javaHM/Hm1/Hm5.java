package javaHM.Hm1;

import java.util.Scanner;

public class Hm5 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите количество euro - ");
        double euro = scaner.nextDouble();
        double baks = euro * 1.09;
        System.out.println("Это будет - " + baks + " доларов");



    }
}
