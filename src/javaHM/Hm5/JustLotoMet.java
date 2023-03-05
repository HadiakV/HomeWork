package javaHM.Hm5;
import java.util.Arrays;

import static javaHM.Hm5.JustLoto.rWin;

public class JustLotoMet {
    public static void searchWinNumb(int [] randNumb){
        int[] sumNamvb= new int[5];
        int coun = 0;
        for (int i = 0; i < rWin.length; i++) {
            if (randNumb[i] >= 1 && randNumb[i] <= 50){
                for (int j = 0; j <rWin.length; j++){
                    if (randNumb[i] == rWin[j]){
                        sumNamvb[coun]= randNumb[i];
                        coun++;
                    }
                }
            }
        }
        System.out.println("Выиграшные номера : " + Arrays.toString(randNumb));
        if (coun >0 ) {
            System.out.println("Поиск совпадений : " + Arrays.toString(sumNamvb));
        }else {
            System.out.println(" Нет совпадений - выпроиграли ");

        }
    }
}
