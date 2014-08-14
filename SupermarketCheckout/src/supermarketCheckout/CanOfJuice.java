/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kotikan;

/**
 *
 * @author gauchoescoces
 */
public class CanOfJuice extends SupermarketItem{
    
    public double  price = 0.53;
    public int  deal = 1; //buy 2 you get 3

    public int getDeal() {
        return deal;
    }
        
    public double getPrice() {
        return price;
    }
    
}
