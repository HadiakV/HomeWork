package javaHM.Hm5;

import java.util.Random;

import static javaHM.Hm5.JustLoto.rWin;

class JustLotoMeettTest {
    public static void genWinNumb() {
        rWin = new int[5];
        Random random = new Random();
        int i;
        for (i = 0; i < rWin.length; i++) {
            rWin[i] = random.nextInt(50) + 1;
        }
        if (rWin[i] != random.nextInt(50) + 1) ;
        System.out.println(" not korect metod ");
    }

}