package javaHM.Hm5;

import java.util.Arrays;
import java.util.Random;
import static javaHM.Hm5.JustLotoMeett.genWinNumb;
import static javaHM.Hm5.JustLotoMet.searchWinNumb;

public class JustLoto {
    public static int [] rWin;
    public static void main(String[] args) {
        genWinNumb();
        int[] randNumb = {5, 13, 27, 39, 46};
        searchWinNumb(randNumb);

    }
}
