package javaHM.Hm4;

import java.util.Arrays;
import java.util.HashMap;

public class Hm4UtT2 {
    public static int countPairs(int[] arr, int K) {
        Arrays.sort(arr);
        int count = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == K) {
                count++;
                left++;
                right--;
            } else if (sum < K) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}
