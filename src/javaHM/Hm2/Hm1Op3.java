package javaHM.Hm2;

public class Hm1Op3 {
    public static boolean testTemperature(double temperature1, double temperature2) {
        return temperature1 > 100 && temperature2 < 100;

    }

    public static void main(String[] args) {
        double temperature1 = 943;
        double temperature2 = 27;
        boolean result = testTemperature(temperature1, temperature2);
        System.out.println(" Rezultat " + result);
    }
}
