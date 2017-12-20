/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actionclasses;

import Businessclasses.hcf1;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Admin
 */
public class hcf extends ActionSupport{
       private int hcfvalue;
       private int hcf1value;
 private int res;
    public int getHcfvalue() {
        return hcfvalue;
    }

    public void setHcfvalue(int hcfvalue) {
        this.hcfvalue = hcfvalue;
    }

    public int getHcf1value() {
        return hcf1value;
    }

    public void setHcf1value(int hcf1value) {
        this.hcf1value = hcf1value;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
      
       public void validate(){
               
           if(hcfvalue<0){
               addFieldError("mvalue","please Enter the values");
           }
          if(hcf1value<0){
              addFieldError("nvalue","please Enter the values");
           }
       }
    public String execute()
    {
        hcf1 r1=new hcf1();

        
        res= r1.hcf(hcfvalue,hcf1value);    
        return "success";
}
}
