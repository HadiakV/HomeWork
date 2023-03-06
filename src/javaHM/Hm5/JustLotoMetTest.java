package javaHM.Hm5;

import static javaHM.Hm5.JustLoto.rWin;
class JustLotoMetTest {
    public static void searchWinNumb() {
        int[] sumNamvb = new int[5];
        int coun = 0;
        int i;
        int j = 0;
        for (i = 0; i < rWin.length; i++) {
            if (rWin[i] >= 1 && rWin[i] <= 50) {
                for (j = 0; j < rWin.length; j++) {
                    if (rWin[i] == rWin[j]) {
                        sumNamvb[coun] = rWin[i];
                        coun++;
                    }
                }
            }
        }
        if (rWin[i] != rWin[j]) {
            sumNamvb[coun] = rWin[i];
            coun++;
        }
        System.out.println(" not korect metod  2 ");
    }
            }


