package javaHM.Hm4;

import java.util.Arrays;
import java.util.List;

import static javaHM.Hm4.Hm4UtT2.countPairs;

public class Hm4Task2 {

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 7, 1};
        int K1 = 6;
        int numPairs = countPairs(arr1, K1);
        int numPossiblePairs = arr1.length * (arr1.length - 1) / 2;
        System.out.println("Number of pairs with sum " + K1 + " in array " + ": " + numPairs);
        System.out.println("Total number of possible pairs in array " + ": " + numPossiblePairs);

        int[] arr = {1, 1, 1, 1};
        int K = 2;
        int numPairs1 = countPairs(arr, K);
        int numPossiblePairs1 = arr.length * (arr.length - 1) / 2;
        System.out.println("Number of pairs with sum " + K + " in array " + ": " + numPairs1);
        System.out.println("Total number of possible pairs in array " + ": " + numPossiblePairs1);
    }
}








