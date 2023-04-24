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
public class InheritDemo{
    public static void main(String[] it1a){
        
        Scanner input = new Scanner(System.in);
        Inheritance i = new Inheritance();
        Inheritance io = new InheritOne();
        
        System.out.print("Please input the price: ");
        Inheritance.price = input.nextDouble();
        System.out.print("Please input the quantity: ");
        Inheritance.quantity = input.nextInt();
        
        //set the price and quantity
        i.setPrice(Inheritance.price);
        i.setQuantity(Inheritance.quantity);
        
        
        //compute for price
        i.compute(i.getPrice(), i.getQuantity());
        System.out.println("The total is: " + Inheritance.total);
        
        System.out.println("--------------------------------");
        
        //discounted price
        io.compute(io.getPrice(), io.getQuantity());
        System.out.println("The discounted price is: " + Inheritance.total);
        
    }
    
    
}
