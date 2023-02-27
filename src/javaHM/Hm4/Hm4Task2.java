package javaHM.Hm4;

import java.util.Arrays;
import java.util.List;

import static javaHM.Hm4.Hm4UtT2.countPairs;

public class Hm4Task2 {

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 7, 1};
        int K1 = 6;
        System.out.println(countPairs(arr1, K1)); // 2

        int[] arr = {1, 1, 1, 1};
        int K = 2;
        int numPairs = countPairs(arr, K);
        int numPossiblePairs = arr.length * (arr.length - 1) / 2;
        System.out.println("Number of pairs with sum " + K + " in array " + ": " + numPairs);
        System.out.println("Total number of possible pairs in array " + ": " + numPossiblePairs);
    }
}








