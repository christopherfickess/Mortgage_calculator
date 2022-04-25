package com.fickess.guestlist;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static int guestNumber = 0;
    public static String guestName = "";
    public static String[] guests = new String[10];
    public static String[] tmpGuests = new String[guests.length];
    public static Scanner scanner = new Scanner(System.in);
    //public static int option = scanner.nextInt();

    public static void main(String[] args){
        insertTestNames();

        do {
            displayGuest();
            displayMenu();
            int option = getOption();

            if (option == 1) {
                addGuest();
            }
            else if (option == 2) {
                insertGuest();
            }
            else if (option == 3){
                renameGuest();
            }
            else if (option == 4){
                removeGuest();
            }
            else if (option == 5){
                System.out.println("Exiting...");
                System.out.println("\n");
                System.out.println("-----------------------------");
                break;
            }
        }while (true);
    }

    static void displayGuest(){
        System.out.println("-----------------------------");
        System.out.println("- Guests -" + "\n");
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                System.out.println(i + 1 + ". " + guests[i]);
            }
            else if (i == 0 && guests[i] == null){
                System.out.println("Guest list is empty");
            }
            else
                break;

        }
        System.out.println("\n");
    }
    static void addGuest(){
        System.out.println("-----------------------------");
        System.out.println("- Guests -" + "\n");
        for (int i = 0; i < guests.length; i++) {
            System.out.println(guests[i]);
            if (guests[i] == null){
                System.out.print("Name: ");
                guests[i] = scanner.nextLine();
                break;
            }
        }
    }

    static void insertTestNames(){
        guests[0] = "Chris Manchester";
        guests[1] = "Sarah LongHill";
        guests[2] = "George Weasley";
        guests[3] = "Fred Weasley";
        guests[4] = "Harry Potter";
    }
    static void insertGuest(){
        System.out.println("-----------------------------");
        System.out.println("- Guests -" + "\n");
        System.out.println("Guest Number: ");
        guestNumber = scanner.nextInt();

        scanner.nextLine(); //removes new line

        if (guestNumber >= 0 && guestNumber <= (guests.length + 1) && guests[guestNumber - 1] != null){
            System.out.println("New Guest Name: ");
            guestName = scanner.nextLine();

            for (int i = (guests.length - 1); i > 0 ; i--)
            {
                guests[i] = guests[i - 1];
            }

            guests[guestNumber - 1] = guestName;
        }
        else
        {
            System.out.println("Error: There is no guest with that number.");
        }
    }
    static void renameGuest(){
        System.out.println("-----------------------------");
        System.out.println("- Guests -" + "\n");
        System.out.println("Guest Number: ");
        guestNumber = scanner.nextInt();

        scanner.nextLine(); //removes new line

        if (guestNumber <= (guests.length) && guestNumber > 0 && guests[guestNumber - 1] != null){
            System.out.println("New Guest Name: ");
            guestName = scanner.nextLine();

            guests[guestNumber - 1] = guestName;
        }
        else
        {
            System.out.println("Error: There is no guest with that number.");
        }
    }
    static void removeGuest(){
        System.out.println("-----------------------------");
        System.out.println("- Guests -" + "\n");
        System.out.println("Guest Number: ");
        guestNumber = scanner.nextInt();

        if (guestNumber <= (guests.length) && guestNumber > 0 && guests[guestNumber - 1] != null){
            for (int i = 0; i < guests.length; i++) {
                if (guests[i] != null && i == (guestNumber - 1)){
                    guests[i] = null;
                    break;
                }
            }

            int tmpIndex = 0;
            for (int i = 0; i < guests.length; i++) {
                if (guests[i] != null){
                    tmpGuests[tmpIndex] = guests[i];
                    tmpIndex++;
                }
            }
            guests = tmpGuests;
        }
        else
        {
            System.out.println("Error: There is no guest with that number.");
        }
    }
    public static void displayMenu(){
        System.out.println("-----------------------------");
        System.out.println("- Menu -" + "\n");
        System.out.println("1 - Add Guest");
        System.out.println("2 - Insert Guest");
        System.out.println("3 - Rename Guest");
        System.out.println("4 - Remove Guest");
        System.out.println("5 - Exit");
    }

    public static int getOption(){
        System.out.print("Option:  ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return option;
    }
}
