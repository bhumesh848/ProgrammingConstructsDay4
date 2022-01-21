package com.bridge.programmingconstructs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SnakeLadder {

    private static final int WIN_POSITION = 100;
    public static void main(String[] args) {

        List<Integer> snakePosition = new ArrayList<>(Arrays.asList(12,20,33,50,74,88,98));
        List<Integer> ladderPosition = new ArrayList<>(Arrays.asList(6,22,37,51,65,85));

        System.out.println(" Start the game of snakeLadder ");
        System.out.println("Player1 rolls a dice ");
        int player1DiceRolled;
        int player2DiceRolled;
        int player1Position = 0;
        int player2Position = 0;


        while(player1Position < WIN_POSITION || player2Position < WIN_POSITION) {

            player1DiceRolled = (int)(Math.random()*6) + 1;
            System.out.println("Dice rolled by player1 : "+ player1DiceRolled);

            player1Position += player1DiceRolled;
            System.out.println("player1 Current Position : "+ player1Position);
            if (snakePosition.contains(player1Position)){
                System.out.println("Player1 got a snake : " + player1Position);
                player1Position -= 5;
            }
            else if (ladderPosition.contains(player1Position)){
                System.out.println("Player1 got a Ladder : " + player1Position);
                player1Position += 5;
            }

            if(player1Position == WIN_POSITION || (player2Position == WIN_POSITION)) {
                break;
            }

            if (player1DiceRolled == 6) {
                System.out.println("Player1 will play again ");
                player1DiceRolled = (int)(Math.random()*6) + 1;
                System.out.println("Dice rolled by player1"+ player1DiceRolled);
            }

            else {
                System.out.println("player 2 will play ");
            }

            player2DiceRolled = (int)(Math.random()*6) + 1;
            System.out.println("Dice rolled by player 2  :"+ player2DiceRolled);

            player2Position += player2DiceRolled;
            System.out.println("Player2 Current Position : "+ player2Position);
            if (snakePosition.contains(player2Position)){
                System.out.println("Player2 got a snake :" + player2Position);
                player2Position -= 5;
            }
            else if (ladderPosition.contains(player2Position)){
                System.out.println("Player2 got a Ladder : " + player2Position);
                player2Position += 5;
            }

            if (player2DiceRolled == 6) {
                System.out.println("Player2 will play again ");
                player2DiceRolled = (int)(Math.random()*6) + 1;
                System.out.println("Dice rolled by player 2 :" + player2DiceRolled);
            }
            else {
                System.out.println("player 1 will play ");
            }
        }


        if (player1Position == WIN_POSITION) {
            System.out.println("Player 1 has Won the Game");
        }
        else {
            System.out.println("Player 2 has Won the Game");
        }
    }
}
