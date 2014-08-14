/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kotikan;

/**
 *
 * @author gauchoescoces
 */
public class Supermaket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        PackOfBiscuits biscuits = new PackOfBiscuits();
        
        MicrowaveMeal meal1 = new MicrowaveMeal();
        MicrowaveMeal meal2 = new MicrowaveMeal();
        
        CanOfJuice can1 = new CanOfJuice();
        CanOfJuice can2 = new CanOfJuice();
        CanOfJuice can3 = new CanOfJuice();
        
        
        buyItem(meal1);
        buyItem(can2);
        buyItem(can1);
        buyItem(biscuits);
        buyItem(can3);
        buyItem(meal2);      
        
        showBill();
        
    }

    private static void buyItem(SupermarketItem  item) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private static void showBill() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
