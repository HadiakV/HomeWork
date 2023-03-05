package javaHM.Hm5;

import java.util.Random;


import static javaHM.Hm5.JustLoto.rWin;

public class JustLotoMeett {
    public static void genWinNumb(){
        rWin = new int[5];
        Random random = new Random();
        for (int i = 0; i < rWin.length; i++) {
            rWin[i] = random.nextInt(50) +1;
        }
    }
}
