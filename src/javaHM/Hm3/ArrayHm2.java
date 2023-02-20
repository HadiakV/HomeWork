package javaHM.Hm3;

public class ArrayHm2 {
    public static void main(String[] args){
        int[] Ar=new int[4];
        for(int n=0;n<Ar.length;n++){
            Ar[n]=(int)(Math.random()*90+10);
            System.out.print(Ar[n]+" ");
        }
        for(int n=0;n<Ar.length;n++){
            if(n>0){
                if(Ar[n-1]>=Ar[n]){
                    System.out.println("Not increasing");
                    break;

                }
            }
            if(n==Ar.length-1)
                System.out.println("Strictly increases");
        }
    }
}