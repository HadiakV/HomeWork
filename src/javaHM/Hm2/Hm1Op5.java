package javaHM.Hm2;

public class Hm1Op5 {

    public static void main(String[] args) {

        int totalNumberOfFloors = 400;
        int numberOfFloorsUp = 83;
        int numberOfFloorsDown = 13;
        numberOfLifts(totalNumberOfFloors,numberOfFloorsUp,numberOfFloorsDown);
    }

     public static void numberOfLifts(int floor, int stepUp, int stepDown){
        int numberOfLifts = 0;
        int currentFloor = 0;

        while (currentFloor <= floor) {

            currentFloor = currentFloor + stepUp - stepDown;
            numberOfLifts++;

        }
         System.out.println("kolichestwo podjemow " + numberOfLifts);

     }



}
