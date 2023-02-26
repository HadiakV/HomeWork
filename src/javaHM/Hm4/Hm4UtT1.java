package javaHM.Hm4;

import java.util.Arrays;

public class Hm4UtT1 {

    public static int findMsTm(int[] znOne)
    {
        int left = 0,right = znOne.length - 1;
        int diff = (znOne[znOne.length -1] - znOne[0]) /znOne.length;
        while (left<=right)
        {
            int mid = right -(right - left) /2 ;
            if (mid+1 < znOne.length && znOne[mid +1]- znOne[mid] != diff) {
                return znOne[mid+1] - diff;
        }
            if (mid-1 >=0 &&znOne[mid] - znOne[mid-1] != diff){
                return znOne[mid -1] -diff;
            }
            if (znOne[mid] - znOne[0] != (mid-0) * diff){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return -1;

    }
    public static int findMsTm1(int[] znOne1)
    {
        for (int i = 0; i < znOne1.length; i++) {

            int min = znOne1[i];
            int minId = i;

            for (int j = i+1; j < znOne1.length; j++) {
                if (znOne1[j] < min){
                    min = znOne1[j];
                    minId = j;
                }
            }

            int temp = znOne1[i];
            znOne1[i] = min;
            znOne1[minId] = temp;
        }

        int left = 0,right = znOne1.length - 1;
        int diff = (znOne1[znOne1.length -1] - znOne1[0]) /znOne1.length;
        while (left<=right)
        {
            int mid = right -(right - left) /2 ;
            if (mid+1 < znOne1.length && znOne1[mid +1]- znOne1[mid] != diff) {
                return znOne1[mid+1] - diff;
            }
            if (mid-1 >=0 &&znOne1[mid] - znOne1[mid-1] != diff){
                return znOne1[mid -1] -diff;
            }
            if (znOne1[mid] - znOne1[0] != (mid-0) * diff){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return -1;

    }
}
