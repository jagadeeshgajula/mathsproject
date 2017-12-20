/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actionclasses;

import Businessclasses.square1;
import com.opensymphony.xwork2.ActionSupport;
import Businessclasses.square1.*;
/**
 *
 * @author Admin
 */
public class square extends ActionSupport{
private double squarevalue;
     private double result;
    public double getSquarevalue() {
        return squarevalue;
    }

    public void setSquarevalue(double squarevalue) {
        this.squarevalue = squarevalue;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
     public void validate() {
        if (squarevalue<0) {
            addFieldError("squarevalue", "please enter positive values");
        }
     }
     public String execute()
    {
        square1 r1=new  square1();
        result= r1.square(squarevalue);
        return "success";
}
}
