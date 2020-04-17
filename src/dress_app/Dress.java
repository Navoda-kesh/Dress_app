/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dress_app;

/**
 *
 * @author Student
 */
public class Dress {
    private double price;
    
    public void setPrice(double price){
        this.price=price;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public String getDetails(){
        return "Price of this dress : "+this.price;
    }
}
