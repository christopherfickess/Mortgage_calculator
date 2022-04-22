package com.fickess.practice;

import static com.fickess.Main.scanner;

public class DivisibleBy {


    public static void main(String[] arg){
        userInput();
        userInput();
        userInput();
        userInput();
    }

    public static void isDividible(int number){

        int remainder3 = number%3;
        int remainder5 = number%5;

        //System.out.println(remainder3);
        if ( remainder3 == 0 && remainder5 == 0){
            System.out.println("FizzBuzz");
        }
        else if ( remainder3 == 0 )
        {
            System.out.println("Buzz");
        }
        else if( remainder5 == 0 ){
            System.out.println("Fizz");
        }
        else
        {
            System.out.println(number);
        }
    }

    public static void userInput(){
        System.out.println("Number:  ");
        int number = scanner.nextInt();

        isDividible(number);
    }
}
