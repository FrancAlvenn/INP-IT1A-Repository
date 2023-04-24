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
public class methodwithoutparameters {
    
    public static void Compute(){
        Scanner input = new Scanner(System.in);
        int num1, num2, sum = 0;
        
        System.out.println("Enter a number: ");
        num1 = input.nextInt();
        System.out.println("Enter a numner: ");
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.println("The sum is " + sum);
        
    }
    
}
