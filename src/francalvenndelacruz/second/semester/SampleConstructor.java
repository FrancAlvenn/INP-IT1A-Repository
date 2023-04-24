/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package francalvenndelacruz.second.semester;
import java.util.*;
/**
 *
 * @author Administrator
 */


/*
Create a java constructor taht will accpet the value of  GWA of the user and another constructor
to determine the GWA and compute the discount based on the value of the GWA as parameter value

GWA:       |  Discount:
98 - 100%  |  100%
95 - 97%   |  50%
90 - 94%   |  30%
<90%       |  no discounr
*/
public class SampleConstructor {
    
    static double gwa;
    static double tuitionFee;
    static double percentage;
    static double discount;
    
    static Scanner input = new Scanner(System.in);
    
    SampleConstructor(){
        
        System.out.print("General Grade: ");
        gwa = input.nextDouble();
        System.out.print("Tuition Fee: ");
        tuitionFee = input.nextDouble();
    }
    
    SampleConstructor(double g, double tf){
        if (g >= 98 && g <= 100){
            
            percentage = 100;
            
        }else if(g >= 95 && g <= 97){
            
            percentage = 50;
            
        }else if(g >= 90 && g <= 94){
            
            percentage = 30;
            
        }else {
            System.out.println("Invalid Input!");
        }
        
        discount = tf * (percentage/100);
        System.out.println("Perventage Discount: " + percentage);
        System.out.println("Discount Amount: " + discount);
        
        
    }
    
    
    
    
}
