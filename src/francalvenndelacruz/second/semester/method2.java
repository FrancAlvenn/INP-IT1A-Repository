/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package francalvenndelacruz.second.semester;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class method2 {

    public static int result;


        

    public  int add(int num1,int num2){
       
        result = num1 + num2; 
        return result;
    }
    static int sub(int num1,int num2){
        result = num1 - num2; 
        return result;
        
    }
    static int mul(int num1,int num2){
        result = num1 * num2;
        return result;
        
    }
    static int div(int num1,int num2){
        result = num1 / num2;
        return result;
        
    }
    
    public void Compute(double misc, double amt, int unit){
        double tuition;
        tuition = (amt*unit) + misc;
        System.out.println("Tuition Fee: " + tuition);
    }
    
    
    
    
    
    
}
