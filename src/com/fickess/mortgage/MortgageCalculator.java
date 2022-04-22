package com.fickess.mortgage;

import java.text.NumberFormat;

import static com.fickess.Main.scanner;

public class MortgageCalculator {
    private static NumberFormat currency = NumberFormat.getCurrencyInstance();
    private static NumberFormat percent = NumberFormat.getPercentInstance();
    static final byte MONTHS_IN_YEAR = 12;
    static final byte PERCENT =100;
    private static float principle = 0;
    private static float apr = 0;
    private static int years = 0;

    public static void main(String[] args){
        mortgageInformation();
        mortgageInformation();
    }

    public static void mortgageInformation(){
        System.out.println("Start");
        while(true){
            System.out.println("Enter a number between 1,000 and 1,000,000.");
            System.out.println("Principal:   ");
            principle = scanner.nextFloat();
            if (principle >= 1_000 && principle <= 1_000_000)
                break;
        }

        while(true){
            System.out.println("Annual Interest Rate:   ");
            apr = scanner.nextFloat();
            if (apr > 0 && apr < 30)
                break;
        }

        while(true){
            System.out.println("Period (Years):   ");
            years = scanner.nextInt();
            if (years > 0)
                break;
        }
        System.out.println(mortgageCalculation(principle, apr, years));

    }
    public static void loanApprovalQuestionar(){
        System.out.println("Applicants Income per year:   ");
        float annualIncome = scanner.nextFloat();
        boolean hasHighIncome = (annualIncome >= 60_000);


        System.out.println("Applicant Credit Score:   ");
        int creditScore = scanner.nextInt();
        boolean hasGoodCredit = (creditScore >= 650);

        System.out.println("Applicant has Criminal Record:   ");
        String hasCriminalRecord = scanner.next().trim();

    }
    public static boolean loanApproval(float annualIncome){
        String className = annualIncome > 100_000 ? "First" : "Economy";

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;

        boolean isEligible = (hasGoodCredit || hasHighIncome) && !hasCriminalRecord;


        return isEligible;
    }

    public static String mortgageCalculation(float principle, float apr,  int years){
        float mortgage;
        float monthlyInterest = (apr/PERCENT)/MONTHS_IN_YEAR;
        float numberOfPayments = years*MONTHS_IN_YEAR;

        mortgage = (float) (principle*(monthlyInterest*Math.pow((1+monthlyInterest),numberOfPayments))/(Math.pow((1+monthlyInterest), numberOfPayments) - 1 ));




        String result = currency.format(mortgage);

        return result;
    }
}
