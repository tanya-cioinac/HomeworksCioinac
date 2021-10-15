package Homeworks.Homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Input your numbers");

        int initialNumber =  sc.nextInt();
        String reverseStr = "";
        for (int i=0;i<5;i++) {  //in this for loop im using remainder % to extract every last character from our original integer
            //and then im diving it by 10, to decrease my initial number by one character each iteration

            int remindernumber = initialNumber % 10;
            initialNumber = initialNumber/10;
            reverseStr+= remindernumber;



            System.out.print(""+remindernumber);
        }






    }

}
