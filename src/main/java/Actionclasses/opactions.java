
package Actionclasses;

import Businessclasses.bjavadegtorad;
import com.opensymphony.xwork2.ActionSupport;


public class opactions extends ActionSupport {
    private  int hypop,adjop;
private double  opposite;

    public int getHypop() {
        return hypop;
    }

    public void setHypop(int hypop) {
        this.hypop = hypop;
    }

    public int getAdjop() {
        return adjop;
    }

    public void setAdjop(int adjop) {
        this.adjop = adjop;
    }

    public double getOpposite() {
        return opposite;
    }

    public void setOpposite(double opposite) {
        this.opposite = opposite;
    }
   public void validate(){
        
        if(hypop<0){
            addFieldError("hypop","Please Give Correct Input And Give Possitive Numbers Only");
        }
        if(adjop<0){
            addFieldError("adjop","Please Give Correct Input Give Possitive Numbers Only");
        }
    }
   public String execute(){
           bjavadegtorad dr=new  bjavadegtorad();
          opposite= dr.op(hypop, adjop);
       return "success";
   } 
}
