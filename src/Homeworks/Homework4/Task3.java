package Homeworks.Homework4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter length of Rectangle:");
        double a= scan.nextDouble();
        System.out.println("Please enter width of Rectangle:");
        double b=scan.nextDouble();

        double area =a*b;
        System.out.println((int) area);
    }
}
