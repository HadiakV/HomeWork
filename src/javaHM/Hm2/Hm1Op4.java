package javaHM.Hm2;

public class Hm1Op4 {
    public static void main(String[] args) {
        int nOfWorkinghours = 8;
        int maximumseconds = nOfWorkinghours *60*60;

        int kakto = (int)( Math.random()*(maximumseconds +1));
        System.out.println("Ostalos - " + kakto + " S ");
        if (kakto<3600){
            System.out.println("ostalos rabotat malo");
        } else if (kakto < 7200) {
            System.out.println("ostalos rabotat ONE HOUR ");
        }else {
            System.out.println("ostalos rabotat  " + kakto / 3600 + " CHASOW. ");
        }


    }


}
