package Homeworks.Homework1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your fahrenheit");
        double fahrenheit = input.nextDouble();
        double celsius =  ((fahrenheit - 32 ) * 5) / 9;
        System.out.println(celsius);
    }
}
