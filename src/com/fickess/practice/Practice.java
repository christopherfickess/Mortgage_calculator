package com.fickess.practice;

import java.util.concurrent.ThreadLocalRandom;

import static com.fickess.Main.scanner;

public class Practice {

    public static void main(String[] args){
        //quackEveryThirdNumber();
        //System.out.println(randomNumberCreation());
        //System.out.println(randomNumber);

    }

    public static void randomNumberCreation() {
        int upperBound = 5;
        int randomNumber = ThreadLocalRandom.current().nextInt(1,5);

        quessRandomNumber(randomNumber);
    }

    public static void quessRandomNumber(int randomNumber){
        int guessNumber;
        while (true){
            System.out.println("Pick a number from 1 to 5:   ");
            guessNumber = scanner.nextInt();
            if (guessNumber != randomNumber) {
                System.out.println("Sorry better luck next time");
                System.out.println("Pick a number from 1 to 5:   ");
                guessNumber = scanner.nextInt();
                if (guessNumber != randomNumber) {
                    System.out.println("Sorry better luck next time");
                }
                else
                {
                    System.out.println("Good guess!!");
                }
            }
            else
            {
                System.out.println("Good guess!!");
            }
        }
    }

    public static void quackEveryThirdNumber(){
        int i = 0;
        int j = 0;
        while (i <= 40){
            i++;
            j=i%3;
            if ( j  == 0 ){
                System.out.println("Quack");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
