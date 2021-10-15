package Homeworks.Homework1;

public class Task1 {
    public static void main(String[] args) {
          int minute = 56849674;
          int days = 0;
          int years = 0;

          days = minute / 24 /60;

        System.out.println(" in " + minute +" minutes, we have " + days + " days ");

            years = days / 365;
            int daysReminder =days % 365;


        System.out.println( "in " +days + " days  we have " +years+  " years , and "  + daysReminder+ " days" );
    }


}
