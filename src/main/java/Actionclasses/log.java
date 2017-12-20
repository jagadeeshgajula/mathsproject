/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actionclasses;

import Businessclasses.log1;
import Businessclasses.root1;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Admin
 */
public class log extends ActionSupport{
     private double logvalue;
 private double result;
 private double result1;

    public double getResult1() {
        return result1;
    }

    public void setResult1(double result1) {
        this.result1 = result1;
    }
    public double getLogvalue() {
        return logvalue;
    }

    public void setLogvalue(double logvalue) {
        this.logvalue = logvalue;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
     
     public void validate(){
         if(logvalue<=0){
             addFieldError("logvalue","please enter positive values");
         }
     }
     
      public String execute()
    {
        log1 r1=new log1();
        result= r1.log(logvalue);
        result1=r1.log10(logvalue);
        return "success";
        
    }
}
