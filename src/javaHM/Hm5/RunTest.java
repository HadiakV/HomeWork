package javaHM.Hm5;

public class RunTest {
    public static void main(String[] args) {
        try {
            JustLotoMeettTest justLotoMeettTest = new JustLotoMeettTest();
            justLotoMeettTest.genWinNumb();
        }catch (Exception e) {
            System.out.println("just message");
        }try {
        JustLotoMetTest justLotoMetTest = new JustLotoMetTest();
        justLotoMetTest.searchWinNumb();
        }catch (Exception e) {
            System.out.println("just message 2 ");

        }
    }
}
