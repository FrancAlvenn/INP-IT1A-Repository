/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package francalvenndelacruz.second.semester;

import java.util.Scanner;

/**
 *
 * @author Franc Alvenn Dela Cruz BSIT 1-A
 */

/*
Write a java constructor that will calculates and print the bill for a cellular
telephone company. the company offerstwo types of service: 
regular and premium.

Rates vary based on the type of service and are computed as follows:

    Regular service: 50.00 php plus first 50 mins are free
        Charges for over 50 minutes are 1.5 php per minute..

    Premium Service: 100 php plus
        a. for calls made from 6:00 hundred hour to 18:00 hundred hour, the first 75 minutes are free, charges
            for over 75 minutes are 1.0 php per minute.

        b. for calls made beyond 18:00 hundred hour, the first 100 minutes are free; charges
            for over 100 minutes are .50 php per minute

*/
public class Activity {
    
    static int startOfCall;
    static double durOfCall;
    static double _tempdurOfCall;
    static String tos;
    static double totalBill;
    static double servicefeeR = 50.00;
    static double servicefeeP = 100.00;
    
    static Scanner input = new Scanner(System.in);
    
        Activity(){
            
            System.out.println("Welcome to Cellular Tech! We offer: ");
            System.out.println("A.Regular");
            System.out.println("B.Premium");
            System.out.print("What type of service: ");
            tos = input.nextLine();
            System.out.print("Input start of call (in military time): ");
            startOfCall = input.nextInt();
            System.out.print("Input duration of call (in mins): ");
            durOfCall = input.nextInt();
            
           switch(tos){
               //regular service
               case "regular","Regular","REGULAR","A","a" -> {
                   if(durOfCall <= 50){
                       totalBill = servicefeeR;
                   }else if(durOfCall > 50){
                       _tempdurOfCall = durOfCall - 50;
                       totalBill = servicefeeR + (_tempdurOfCall * 1.5);
                   } 
            }
               //premium service    
               case "premium","Premium","PREMIUM","B","b" -> {
                   if(startOfCall >= 600 && startOfCall < 1800){
                       if(durOfCall <= 75){
                           totalBill = servicefeeP;
                       }else if(durOfCall > 75){
                           _tempdurOfCall = durOfCall - 75;
                           totalBill = servicefeeP + (_tempdurOfCall * 1.0);
                       }
                   }else if(startOfCall > 1800){
                       if(durOfCall <= 100){
                           totalBill = servicefeeP;
                       }else if(durOfCall > 100){
                           _tempdurOfCall = durOfCall - 100;
                           totalBill = servicefeeP + (_tempdurOfCall * 0.5);
                       }
                   }   
            }//end of case   
           } //end of switch
           
            System.out.println("-----------------------------------------------------");
            System.out.println("The time of call is " + startOfCall);
            System.out.println("The duration of the call is " + durOfCall);
            System.out.println("The excess duration of the call is " + _tempdurOfCall);
            System.out.println("-----------------------------------------------------");
            System.out.println("The Total Bill to pay is " + totalBill);
           
        }//end of constructor
    
   
        
}
