/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dress_app;

import javax.swing.JOptionPane;

/**
 *
 * @author Student
 */
public class Person {
    double budget;
    int noOfItems;
    Dress[] drs;
    
    public Person(double budget, int maxItems){
        this.budget=budget;
        drs=new Dress[maxItems];
        this.noOfItems=0;
    }
    
    public void addItem(Dress d){
        drs[noOfItems]=d;
        this.noOfItems++;
    }
    
    public void showDetails(){
        String msg;
        double totalPrice=0;
        msg="------------Details of the person as follows-------------\n"+
                "Budget for this person:"+this.budget+
                "\nNo of dresses: "+this.noOfItems+"\n";
        
        for(int i=0;i<noOfItems;i++){
            
            msg=msg+"Item No "+(i+1)+":\n";
            msg=msg+drs[i].getDetails();
            totalPrice=totalPrice+drs[i].getPrice();
        }
        
        if(totalPrice>this.budget){
            msg=msg+"This is over budgeted person.";
        }
        else if(totalPrice<this.budget){
            msg=msg+"This is lower budgeted person.";
        }
        else
        {
            msg=msg+"This is a balanced budgeted person.";
        }
        
        JOptionPane.showMessageDialog(null,msg);
        
    }
}
