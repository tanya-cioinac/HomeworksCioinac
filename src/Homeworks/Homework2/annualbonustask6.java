package Homeworks.Homework2;

import java.util.Scanner;

public class annualbonustask6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what's your income?");
        int income = input.nextInt();
        double fiveFromFifty = (income *0.5) * 0.05;
        System.out.println(fiveFromFifty);
        double eightFromThirty= (income *0.3) * 0.08;
        System.out.println(eightFromThirty);
        double tenFromTwenty = (income *0.2)*0.1;
        System.out.println(tenFromTwenty);
    }
}
