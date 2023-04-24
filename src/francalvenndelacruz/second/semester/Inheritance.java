/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package francalvenndelacruz.second.semester;

/**
 *
 * @author Administrator
 * 
 * 
 * Create a program that will compute the total amount to be paid by the customer
 * based on the quantity and price supplied by the user The program will 
 * assign a getter method to get the value of the price and a setter method to set 
 * the value.
 * 
 * In the parent class create a method that will compute for the amount. 
 * 
 * In the subclass overwrite the compute method in the parent class to compute for the discounted
 * price (20% discount is given).
 * 
 * Also create a test class to execute the program. Save this as Inheritance.java,
 * InheritOne.java and InheritDemo.java
 * 
 * 5 methods
 * 
 */



public class Inheritance{
    
    static int quantity;
    static double price;
    static double total;
    
    
    public double getPrice(){ 
        return price;
    }
    
    public void setPrice(double amt){
        Inheritance.price = amt;
    }
    
    
    public int getQuantity(){
        return quantity;
    }
    
    public void setQuantity(int qty){
        Inheritance.quantity = qty;
    }
    
    public double compute(double price, double quantity){
        //compute the price
        total = price * quantity;
        return total;
    }
    
}
