package base;

/*
 *  UCF COP3330 Summer 2021 Assignment 21 Solution
 *  Copyright 2021 Brianne Juntunen
 */
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int num = myApp.promptMonth();

        String month = myApp.checkMonthDatabase(num);

        myApp.printOutput(month);

    }

    public void printOutput(String msg){
        System.out.printf("The name of the month is %s.", msg);
    }

    public String checkMonthDatabase(int num){
        switch (num) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "non-existent";
        }
    }

    public int promptMonth(){
        System.out.print("Please enter the number of the month: ");
        return Integer.parseInt(in.nextLine());
    }
}
