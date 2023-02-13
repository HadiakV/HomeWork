package javaHM.Hm2;

import com.sun.source.tree.ReturnTree;

import java.util.Random;
import java.util.Scanner;

public class Hm1Op2 {


    public static void main(String[] args) {

        boolean isEdemaOpen;
        boolean isReweOpen;


        Scanner scaner = new Scanner(System.in);
        System.out.println(" Открыт ли ваш магазин Edeka?");
        isEdemaOpen = scaner.nextBoolean();
        System.out.println(" Открыт ли ваш магазин Rewe?");
        isReweOpen = scaner.nextBoolean();
        System.out.println(" Я могу купить еду, это " + canBuy(isReweOpen,isEdemaOpen));

    }

    public static boolean canBuy(boolean isReweOpen, boolean isEdemaOpen) {
        if (isReweOpen == true || isEdemaOpen == true) {
            return true;

        } else {
            return false;
        }
    }
}



