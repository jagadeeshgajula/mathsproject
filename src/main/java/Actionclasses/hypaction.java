
package Actionclasses;

import Businessclasses.bjavadegtorad;
import com.opensymphony.xwork2.ActionSupport;


public class hypaction extends ActionSupport {
    private double adjhyp,ophyp;
    private double output;
    public void validate(){
        
        if(adjhyp<0){
            addFieldError("adjhyp","Please Give Correct Input And Give Possitive Numbers Only");
        }
        if(ophyp<0){
            addFieldError("ophyp","Please Give Correct Input Give Possitive Numbers Only");
        }
    }


    public double getAdjhyp() {
        return adjhyp;
    }

    public void setAdjhyp(double adjhyp) {
        this.adjhyp = adjhyp;
    }

    public double getOphyp() {
        return ophyp;
    }

    public void setOphyp(double ophyp) {
        this.ophyp = ophyp;
    }

    public double getOutput() {
        return output;
    }

    public void setOutput(double output) {
        this.output = output;
    }
    public String execute(){
          bjavadegtorad dr=new  bjavadegtorad();
          output =dr.hyp(adjhyp,ophyp);
         //System.out.println(output);
          return "success";
    }
    
}
