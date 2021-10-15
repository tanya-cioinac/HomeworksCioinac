package Homeworks.Homework2;

import java.util.Scanner;

public class mathtask5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Input your number: ");
        int number = input.nextInt();
        int i;

        for(i=1; i<=10;i++){
            int result=number*i;
            System.out.println( number + " x "  +   i + " = " +result );
        }




    }
}
