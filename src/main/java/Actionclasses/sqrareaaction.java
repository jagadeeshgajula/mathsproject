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
public class sqrareaaction extends ActionSupport {
    private int sqrarea;

    public int getSqrarea() {
        return sqrarea;
    }

    public void setSqrarea(int sqrarea) {
        this.sqrarea = sqrarea;
    }
    private int sqrres;

   
    public int getSqrres() {
        return sqrres;
    }

    public void setSqrres(int sqrres) {
        this.sqrres = sqrres;
    }
     public void validate()
    {
        if(sqrarea<0)
        {
            addFieldError("sqrarea","Please Enter Positive numbers only");
        }
       
    }
    
      public String execute()
    {
        Business1 obj=new Business1();
    
        sqrres=obj.square1(sqrarea);

        return SUCCESS;
    }
    
}
