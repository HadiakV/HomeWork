package javaHM.Hm1;

import java.util.Scanner;

public class Hm3 {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите первое четное слово");
        String word1 = scaner.nextLine();
        System.out.println("Введите второе четное слово");
        String word2 = scaner.nextLine();
        int halfWord1 = word1.length() /2;
        int halfWord2 = word2.length() /2;

        String word3 = word1.substring(0,halfWord1) + word2.substring(halfWord2);
        System.out.println("Ваше новое слово - " + word3);



    }
}
