package Homeworks.Homework1;

public class task5 {
    public static void main(String[] args) {
        int initialNumber =  12345;
        String reverseStr = "";
        for (int i=0;i<5;i++) {  //in this for loop im using remainder % to extract every last character from our original integer
        //and then im diving it by 10, to decrease my initial number by one character each iteration

            int remindernumber = initialNumber % 10;
            initialNumber = initialNumber/10;
            reverseStr+= remindernumber;



            System.out.println(""+remindernumber);
        }
        System.out.println();
        System.out.println(reverseStr); // here we have a string where each our last character is saved inside string
        //but we still have to revert it so it will meet the condition from acceptance criteria
        //for that I will create a new string and add to it each last character from my previous string
        String reverseStr2 = "";
        for (int i=4;i>=0;){

            reverseStr2+=reverseStr.charAt(i)+" ";
            i--;

        }

        System.out.println(reverseStr2);




    }
}
