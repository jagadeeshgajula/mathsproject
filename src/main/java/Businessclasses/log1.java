/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Businessclasses;

/**
 *
 * @author Admin
 */
public class log1 {
    public double result; 
       public double result1; 
    public double log(double logval)
    {
     result=Math.log(logval);
     
       
     return result;
    
    } 
    public double log10(double logval){
        result1=Math.log10(logval);
    return result1;
    }
}
