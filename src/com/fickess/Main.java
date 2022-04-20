package com.fickess;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    private static NumberFormat currency = NumberFormat.getCurrencyInstance();
    private static Scanner scanner = new Scanner(System.in);
    private static NumberFormat percent = NumberFormat.getPercentInstance();
    static final byte MONTHS_IN_YEAR = 12;
    static final byte PERCENT =100;

    public static void main(String[] args){
        //int result =(int)(Math.random()*100);
        System.out.println("Principal:   ");
        float principle = scanner.nextFloat();
        System.out.println("Annual Interest Rate:   ");
        float apr = scanner.nextFloat();
        System.out.println("Period (Years):   ");
        int years = scanner.nextInt();

        System.out.println("Mortgage:   " + mortgageCalculation(principle, apr, years));

        //System.out.println(resultPercentage);
    }

    public static String mortgageCalculation(float principle, float apr,  int years){
        float mortgage;
        float monthlyInterest = (apr/PERCENT)/MONTHS_IN_YEAR;
        float numberOfPayments = years*MONTHS_IN_YEAR;

        mortgage = (float) (principle*(monthlyInterest*Math.pow((1+monthlyInterest),numberOfPayments))/(Math.pow((1+monthlyInterest), numberOfPayments) - 1 ));




        String result = currency.format(mortgage);
//        String resultPercentage = percent.format(.051);
//        String name = scanner.nextLine();


        return result;
    }
}
