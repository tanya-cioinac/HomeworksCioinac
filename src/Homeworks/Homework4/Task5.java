package Homeworks.Homework4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {


        System.out.println(Task5.test());


    }
    public static boolean test(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();
        System.out.print("Input the second number: ");
        int b = in.nextInt();
        System.out.print("Input the third number : ");
        int c = in.nextInt();
        boolean bl= false;
        if(a == b || b == c){
            bl = true;
        }
        return bl;
    }

}
