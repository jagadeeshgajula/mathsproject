/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actionclasses;

import Businessclasses.square1;
import com.opensymphony.xwork2.ActionSupport;
import Businessclasses.square1.*;
import Businessclasses.square1_loop;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class square_loop extends ActionSupport{
private double squarevalue_loop;
private double i;
private double res;

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
      private List<Double> results;

    public List<Double> getResults() {
        return results;
    }

    public void setResults(List<Double> results) {
        this.results = results;
    }
    public double getSquarevalue() {
        return squarevalue_loop;
    }

    public void setSquarevalue_loop(double squarevalue_loop) {
        this.squarevalue_loop = squarevalue_loop;
    }

  public void validate() {
        if (squarevalue_loop<0) {
            addFieldError("squarevalue_loop", "please enter positive values");
        }
     }
     public String execute()
//    {
     {     
         results= new ArrayList<Double>();
        for( i=0;i<=squarevalue_loop;i++)
        {
            results.add(i*i);
        }

        System.out.println(res);
        return "success";
        
}
}
