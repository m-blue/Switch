package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int myInt = 3;
        String engToGer = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 10");
        myInt = scanner.nextInt();

        switch (myInt){
            case 1: engToGer = "ein";
                    break;

            case 2: engToGer = "zwei";
                    break;

            case 3: engToGer = "drei";
                    break;

            case 4: engToGer = "vier";
                    break;

            case 5: engToGer = "fünf";
                    break;

            case 6: engToGer = "sechs";
                    break;

            case 7: engToGer = "Sieben";
                    break;

            case 8: engToGer = "acht";
                    break;

            case 9: engToGer = "neun";
                    break;

            case 10: engToGer = "zehn";
                    break;
        }

        System.out.println(myInt + " is " + engToGer + " in German");
    }
}
