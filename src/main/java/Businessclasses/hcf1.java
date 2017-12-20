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
public class hcf1 {
    public int result; 
    public int hcf(int hcfvalue,int hcf1value){
          int h = 1;
        int p = hcfvalue * hcf1value;
        for (int i = 2; i < p; i++) {
            if ((hcfvalue % i == 0) && (hcf1value% i == 0)) {
                h = i;
    }
            result=h;
}
        return result;

    }
}