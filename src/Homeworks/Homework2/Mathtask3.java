package Homeworks.Homework2;

import java.util.Scanner;

public class Mathtask3 {

    public static void main(String[] args) {
      Scanner input =new Scanner(System.in);

        int firstnr = input.nextInt();

        int secondnr=input.nextInt();

            System.out.println("Sum of first and second number is:" +firstnr+secondnr);
        System.out.println("Difference  of first and second number is:" + (firstnr - secondnr));
        System.out.println("Multiplication of first and second number is:" +(firstnr * secondnr));
        System.out.println("Division  of first and second number is:" +(firstnr/secondnr));
        System.out.println("Mod of first and second number is:" +(firstnr % secondnr));


    }
}
