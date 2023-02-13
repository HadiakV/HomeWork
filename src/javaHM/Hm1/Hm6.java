package javaHM.Hm1;

import java.util.Scanner;

public class Hm6 {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println( "Диаметр первой пиццы - ");
        double d1 =scaner.nextDouble();

        double Pz1=d1 /2;
        double Pz2= Pz1 * Pz1;
        double Pz3 = (Math.PI * Pz2);
        double pzCal = Pz3 * 50;
        System.out.println("К-лво к-рий пиццы N1 - " + pzCal);

        System.out.println( "Диаметр второй пиццы - ");
        double d2 =scaner.nextDouble();
        double pPz1 = d2 /2;
        double pPz2 = pPz1 * pPz1;
        double pPz3 = (Math.PI * pPz2);
        double pzCal1 = pPz3 * 80;
        System.out.println("К-лво к-рий пиццы N2 - " + pzCal1 );
        System.out.println("Разница калорий между пиццами - " + (pzCal1 - pzCal));



        }
    }
