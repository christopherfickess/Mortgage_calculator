package com.fickess.practice;

import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

import static com.fickess.Main.scanner;

public class GuessNumber {

    public static void main(String[] args){
        //guessNumber();
        //linkedListIncreasingNumbers();

    }

    public static void linkedListIncreasingNumbers(){
        LinkedList linky = new LinkedList();
        int i;
        for (i = 0; i <=10; i++){
            linky.add(i);
            System.out.println(linky);
        }
        System.out.println(linky);

    }
    public static void guessNumber(){
        int randomNumber = ThreadLocalRandom.current().nextInt(1,101);
        System.out.print("Guess a Number from 1 to 100:   ");
        int numberOfGuesses = 1;
        while(true){
            int guessNumber = scanner.nextInt();
            if (guessNumber < randomNumber ){
                System.out.println("HIGHER");
                numberOfGuesses++;
            }
            else if(guessNumber > randomNumber){
                System.out.println("LOWER");
                numberOfGuesses++;
            }
            else
            {
                System.out.println("CORRECT");
                System.out.println("The User Guessed " + numberOfGuesses + " Number of times!");
                break;
            }
        }
    }
}
