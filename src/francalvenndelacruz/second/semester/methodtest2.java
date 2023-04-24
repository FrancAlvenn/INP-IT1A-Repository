/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package francalvenndelacruz.second.semester;


import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class methodtest2 {
        public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
//        System.out.print("Enter a number: ");
//        int num1 = x.nextInt();
//        System.out.print("Enter a number: ");
//        int num2 = x.nextInt();
//        System.out.println("-------------------------------------");
//        System.out.println("Please enter an operation: ");
//        System.out.println("1 for addition");
//        System.out.println("2 for subtration");
//        System.out.println("3 for multiplication");
//        System.out.println("4 for division");
//        int _temp = x.nextInt();
//        
       method2 m2 = new method2();
//        
//        switch(_temp){
//            case 1 -> {
//                m2.add(num1,num2);  
//                System.out.println("The result is " + method2.result);
//            }
//            case 2 -> {
//                method2.sub(num1,num2);
//                System.out.println("The result is " + method2.result);
//            }
//            case 3 -> {
//                method2.mul(num1,num2);
//                System.out.println("The result is " + method2.result);
//            }
//            case 4 -> {
//                method2.div(num1,num2);
//                System.out.println("The result is " + method2.result);
//            }
//            default -> System.out.println("Wrong Input");
//        }
            double misc = 4500.56, amt = 900.75;
            int unit = 29;
            System.out.println("misc = " + misc);
            System.out.println("amt = " + amt);
            System.out.println("unit = " + unit);
            m2.Compute(misc,amt,unit);
            
            
            
}
}
