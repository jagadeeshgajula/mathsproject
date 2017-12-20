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
public class lcm1 {
        
public int result; 
   
    public int lcm(int lcmvalue,int lcm1value)
    {
//    int m = 0;
//    int n = 0;
    

        int h = 1;
        int p = lcmvalue*lcm1value;
        for (int i = 2; i < p; i++) {
            if ((lcmvalue % i == 0) && (lcm1value % i == 0)) {
                h = i;
            }

        }
  result= p / h;
        System.out.println(result);
        return result;
     
    } 

  
}
