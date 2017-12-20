/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actionclasses;

import Businessclasses.Business1;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Dell
 */
public class circumaction extends ActionSupport{
     private int circumradius;

    public int getCircumradius() {
        return circumradius;
    }

    public void setCircumradius(int circumradius) {
        this.circumradius = circumradius;
    }
       private double circumres;

  

    public double getCircumres() {
        return circumres;
    }

    public void setCircumres(double circumres) {
        this.circumres = circumres;
    }
   public void validate()
    {
        if(circumradius<0)
        {
            addFieldError("circumradius","Please Enter Positive numbers only");
        }
    }
   public String execute()
    {
        Business1 obj=new Business1();
    
        circumres=obj.circumference(circumradius);
        
        return SUCCESS;
    }

   
}
