package main.java.BattleSheep.FirstTry;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class SeaBattle {

    static String playerName1 = "Player#1";
    static String playerName2 = "Player#2";
    static Scanner scaner = new Scanner(System.in);
    static int[][] battleField1 = new int[10][10];
    static int[][] battleField2 = new int[10][10];
    static int[][] monitor1 = new int[10][10];
    static int[][] monitor2 = new int[10][10];


    public static void main(String[] args) {
        System.out.println("Player 1 , please enter your name : ");
        playerName1 = scaner.nextLine();
        System.out.println("Player 2 , please enter your name : ");
        playerName2 = scaner.nextLine();


        placeShips(playerName1, battleField1);
        placeShips(playerName2, battleField2);


        while (true) {
            makeTurn(playerName1, monitor1, battleField2);
            if (isWinCondition()) {
                break;
            }
            makeTurn(playerName2, monitor2, battleField1);
            if (isWinCondition()) {
                break;
            }
        }
    }


    public static void placeShips(String playerName, int[][] battleField) {
        int deck = 4;
        while (deck >= 1) {
            System.out.println();
            System.out.println(playerName + " Please place yor " + deck + "-deck  ship on the seaBattle : ");
            System.out.println();

            drawField(battleField);


            System.out.println("Please enter ox coordinate ");
            int x = scaner.nextInt();
            System.out.println("Please enter oy coordinate ");
            int y = scaner.nextInt();
            System.out.println("choise direction ");
            System.out.println(" 1 : Vertical");
            System.out.println(" 2 : Horizontal");

            int direction = scaner.nextInt();
//            if (direction < 1 || direction > 2 ){
//                System.out.println();
//            }else {
//                System.out.println(" 1 equals Vertical , 2 equals Horizontal enter direction again ");
//                return;
//            }


            if (!isAvaliable(x, y, deck, direction, battleField)) {
                System.out.println("wrong coordinates try again  ");
                continue;
            }
            for (int i = 0; i < deck; i++) {
                if (direction == 1) {
                    battleField[x][y + i] = 1;
                } else {
                    battleField[x + i][y] = 1;

                }

            }
            deck--;
            clearScrean();
        }

    }

    public static void drawField(int[][] battleField) {


        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < battleField.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < battleField[1].length; j++) {
                if (battleField[j][i] == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print("X ");
                }

            }
            System.out.println();
        }


    }

    public static void makeTurn(String playerName, int[][] monitor, int[][] battleField) {
        while (true) {
            System.out.println(playerName + " , please , make you turn. ");

            System.out.println("  0 1 2 3 4 5 6 7 8 9");
            for (int i = 0; i < monitor.length; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < monitor[1].length; j++) {
                    if (monitor[j][i] == 0) {
                        System.out.print("- ");
                    } else if (monitor[j][i] == 1) {
                        System.out.println("O ");
                    } else {
                        System.out.print("X ");
                    }

                }
                System.out.println();
            }
                System.out.println("Please enter ox coordinate min 0 max 9 ");
            int x = scaner.nextInt();
         /*   if (x < 9 || x > 0) {
                System.out.println();
            } else {
                System.out.println("Please enter one again min 0 max 9 ");
                continue;
            }*/
            System.out.println("Please enter oy coordinate min 0 max 9 ");
            int y = scaner.nextInt();
       /*     if (y < 9 || y > 0) {
                System.out.println();
            } else {
                System.out.println("Please enter one again min 0 max 9 ");
                continue;
            }*/

            if (battleField[x][y] == 1) {
                System.out.println("Direct hit, keep shooting, stuff him with lead  ");
                monitor[x][y] = 2;
            } else {
                System.out.println("Miss !!! Your opponent turn  ");
                monitor[x][y] = 1;
                break;
            }
            clearScrean();
        }
    }

    public static boolean isWinCondition() {
        int counter1 = 0;
        for (int j = 0; j < monitor1.length; j++) {
            for (int i = 0; i < monitor1[i].length; i++) {
                if (monitor1[i][j] == 2) {
                    counter1++;
                }
            }

        }
        int counter2 = 0;
        for (int j = 0; j < monitor2.length; j++) {
            for (int i = 0; i < monitor2[i].length; i++) {
                if (monitor2[i][j] == 2) {
                    counter2++;
                }
            }

        }
        if (counter1 >= 10) {
            System.out.println(playerName1 + " WIN!!! ");
            return true;

        }
        if (counter2 >= 10) {
            System.out.println(playerName1 + " WIN!!! ");
            return true;
        }
        return false;
    }

    public static boolean isAvaliable(int x, int y, int deck, int rotation, int[][] battlefield) {
        //проверка на выход за поля
        if (rotation >= 1) {
            if (y + deck > battlefield.length) {
                return false;
            }
        }
        if (rotation <= 2) {
            if (x + deck > battlefield[0].length) {
                return false;
            }
        }
        //neighbours check without diagonals
        //XXXX
        while (deck != 0) {
            for (int i = 0; i < deck; i++) {
                int xi = 0;
                int yi = 0;
                if (rotation == 1) {
                    yi = i;
                } else {
                    xi = i;
                }
                //battlefield[x][y];
                if (x + 1 + xi < battlefield.length && x + 1 + xi >= 0) {
                    if (battlefield[x + 1 + xi][y + yi] != 0) {
                        return false;
                    }
                }
                if (x - 1 + xi < battlefield.length && x - 1 + xi >= 0) {
                    if (battlefield[x - 1 + xi][y + yi] != 0) {
                        return false;
                    }
                }
                if (y + 1 + xi < battlefield.length && y + 1 + xi >= 0) {
                    if (battlefield[x + xi][y + 1 + yi] != 0) {
                        return false;
                    }
                }
                if (y - 1 + xi < battlefield.length && y - 1 + xi >= 0) {
                    if (battlefield[x + xi][y - 1 + yi] != 0) {
                        return false;
                    }
                }
                deck--;
            }
        }
        return true;
    }

    public static void clearScrean() {
        //очищение екрана работает только на Windows =)
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}

