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
public class square1_loop {
   public double result[]= new double[30]; 
    public int i;
    public double square_loop(double squareval_loop)
    {
       for(i=0;i<=squareval_loop;i++)
        {
//     result=(squareval_loop*squareval_loop);
     
            result[i]=i*i;
    //System.out.println(result);
        
        }
         return result[i];
        
    } 
    }
