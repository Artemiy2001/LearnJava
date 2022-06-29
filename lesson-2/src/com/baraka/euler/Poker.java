package com.baraka.euler;

import java.io.*;
import java.util.Arrays;

public class Poker {
    public static void main(String[] args) throws IOException {

        char[] CardPower = {'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};
        char[] CardSuits = {'S', 'C', 'H', 'D'};

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\artba\\IdeaProjects\\lesson-2\\src\\com\\baraka\\euler\\p054_poker.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                CardsArray(line, CardPower, CardSuits);
                break;

            }
        } catch (IOException e) {
            System.out.println("ERROR " + e);
        } finally {
            br.close();
        }

    }

    public static void CardsArray(String line, char[] CardPower, char[] CardSuits){
        line = line.replaceAll(" ", "");
        int[][] FirstPlayer = new int[5][2];
        int[][] SecondPlayer = new int[5][2];

        char[] lineArr = line.toCharArray();
        int indexLineArr = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++){
                char x = lineArr[indexLineArr];
                if (indexLineArr == 0 || indexLineArr % 2 == 0) {
                    String CardPower2 = new String(CardPower);
                    int index = CardPower2.indexOf(x);
                    FirstPlayer[i][j] = index;
                }else {
                    String CardPower2 = new String(CardSuits);
                    int index = CardPower2.indexOf(x);
                    FirstPlayer[i][j] = index;
                }

                indexLineArr++;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++){
                char x = lineArr[indexLineArr];
                if (indexLineArr == 0 || indexLineArr % 2 == 0) {
                    String CardPower2 = new String(CardPower);
                    int index = CardPower2.indexOf(x);
                    SecondPlayer[i][j] = index;
                }else {
                    String CardPower2 = new String(CardSuits);
                    int index = CardPower2.indexOf(x);
                    SecondPlayer[i][j] = index;
                }

                indexLineArr++;
            }
        }


    }

    public static void CardsComp(){

    }


}
