
package Actionclasses;

import Businessclasses.bjavadegtorad;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
public class javaradtodeg extends ActionSupport {
      private int radtodeg;
               private double res;

    public int getRadtodeg() {
        return radtodeg;
    }

    public void setRadtodeg(int radtodeg) {
        this.radtodeg = radtodeg;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
    public void validate(){
        if(radtodeg<0){
            addFieldError("radtodeg","Please Give Correct Input And Give Possitive Numbers 0-9 Only");
        }
    }
    public String execute(){
        bjavadegtorad dr=new bjavadegtorad();
       res= dr.raddeg(radtodeg);
       // System.out.println(res);
        return "success";
    }

  
    }
    
