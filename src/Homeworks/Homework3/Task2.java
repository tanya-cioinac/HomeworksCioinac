package Homeworks.Homework3;

public class Task2 {
   public static void main(String[] args) {
      int maxcapacity = 10000;
      int ticketssold = 10001;

      boolean anyemptyspots = true;

      if (ticketssold > maxcapacity) {
         anyemptyspots = false;
         System.out.println("Sold out");

      } else {

         System.out.println("We have empty spots");
      }
   }

   }

