package Homeworks.Homework4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your numbers");
        int a= scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        a=(a*a);
        b=(b*b);
        c=(c*c);
        int somOfSquareNr= a+b+c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(somOfSquareNr);


    }
}
