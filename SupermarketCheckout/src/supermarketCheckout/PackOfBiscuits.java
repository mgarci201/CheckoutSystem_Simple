/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kotikan;

/**
 *
 * @author gauchoescoces
 */
public class PackOfBiscuits  extends SupermarketItem{
     
    double price = 1.29;
    int deal = 0; // no deal on this item

    public int getDeal() {
        return deal;
    }
        
    public double getPrice() {
        return price;
    }  
}
