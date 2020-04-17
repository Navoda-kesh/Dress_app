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
public class Trouser extends Dress{
    String length;
    @Override
    public String getDetails(){
       return "This is a trouser and length : "+this.length+"\n"+
               super.getDetails()+"\n";
}
}
