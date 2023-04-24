/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package francalvenndelacruz.second.semester;

/**
 *
 * @author Administrator
 */
public class InheritOne extends Inheritance{
    

    @Override
    public double compute(double price, double quantity){
        //compute for the discounted total
        
        double amount = (price * quantity);
        total = amount - (amount * 0.2);
        
        return total;
        
    }
    
    
}
