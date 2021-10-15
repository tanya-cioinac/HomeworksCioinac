package Homeworks.Homework4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter one of the song name:");
        String str = scan.nextLine();
        int i= str.indexOf("k");
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.length());
        System.out.println(i);
        System.out.println(str.charAt(3));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());



    }
}