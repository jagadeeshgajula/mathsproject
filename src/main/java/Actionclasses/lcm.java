/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actionclasses;

import Businessclasses.lcm1;
import Businessclasses.root1;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Admin
 */
public class lcm extends ActionSupport{
       private int lcmvalue;
       private int lcm1value;
       private int res;

    public int getLcmvalue() {
        return lcmvalue;
    }

    public void setLcmvalue(int lcmvalue) {
        this.lcmvalue = lcmvalue;
    }

    public int getLcm1value() {
        return lcm1value;
    }

    public void setLcm1value(int lcm1value) {
        this.lcm1value = lcm1value;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public void validate() {
        if (lcmvalue<0) {
            addFieldError("lcmvalue", "please enter positive values");
        }
     }

   
    
    public String execute()
    {
        lcm1 r1=new lcm1();

        
        res= r1.lcm(lcmvalue,lcm1value);    
        return "success";
        
    }
}
