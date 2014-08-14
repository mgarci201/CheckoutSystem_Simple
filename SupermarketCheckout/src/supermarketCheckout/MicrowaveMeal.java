/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kotikan;

/**
 *
 * @author gauchoescoces
 */
public class MicrowaveMeal  extends SupermarketItem {
    
    double price = 3.50;
    int deal = 2; // 2 for £5

    public int getDeal() {
        return deal;
    }
        
    public double getPrice() {
        return price;
    }
    
    
    
}
