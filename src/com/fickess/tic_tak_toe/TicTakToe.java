package com.fickess.tic_tak_toe;

import static com.fickess.Main.scanner;

public class TicTakToe {
    public static char[] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    public static int input = 0;
    public static char turn = 'X';
    public static int counter = 1;
    public static boolean gameOver = false;


    public static void main(String[] args){

        while(gameOver == false) {
            userInput();
            gamePlayDisplay();
            gameOver =  gameOutcome(gameOver);
            swichPlayer();
            gameOver = maxRounds(gameOver);
        }
    }

    // How to determine the winner
    public static boolean gameOutcome(boolean gameOver){
        if ( pos[0] == turn && pos[3] == turn && pos[6] == turn ||
                pos[1] == turn && pos[4] == turn && pos[7] == turn ||
                pos[2] == turn && pos[5] == turn && pos[8] == turn ||
                pos[6] == turn && pos[7] == turn && pos[8] == turn ||
                pos[3] == turn && pos[4] == turn && pos[5] == turn ||
                pos[0] == turn && pos[1] == turn && pos[2] == turn ||
                pos[0] == turn && pos[4] == turn && pos[8] == turn ||
                pos[6] == turn && pos[4] == turn && pos[2] == turn)
        {
            System.out.println("WINNER");
            gameOver = true;
        }
        return gameOver;
    }

    public static char[] userInput(){
        do {
            System.out.println("Enter a position: ");
            input = scanner.nextInt();
        } while (pos[input - 1] == 'X' || pos[input - 1] == 'O');

        pos[input - 1] = turn;

        return pos;
    }

    public static void gamePlayDisplay(){
        System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");
    }

    public static char swichPlayer(){
        if ( turn == 'X' )
            turn = 'O';
        else
            turn = 'X';

        return turn;
    }

    public static boolean maxRounds(boolean gameOver){
        counter++;

        if (counter > 9){
            System.out.println("DRAW");
            gameOver = true;
        }
        return gameOver;
    }
}
