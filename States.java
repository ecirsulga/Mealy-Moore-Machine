   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ecome
 */
public class States {
    
    public String state_Name;
    public char output;
    public States[] trans;
    public char[] transout;
    
    public States(String state_Name,int x) {
        this.state_Name = state_Name;
        
        trans = new States[x];
    }
    
public void fonk(int a)
{
    transout = new char[a];
}
  

}
