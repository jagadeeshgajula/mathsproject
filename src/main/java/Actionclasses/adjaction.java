
package Actionclasses;

import Businessclasses.bjavadegtorad;
import com.opensymphony.xwork2.ActionSupport;


public class adjaction extends ActionSupport {
    private double hypadj,opadj;
private double adjout;
public void validate(){
        if(hypadj<0){
            addFieldError("hypadj","Please Give Correct Input And Give Possitive Numbers Only ");
        }
        if(opadj<0){
            addFieldError("opadj","Please Give Correct Input And Give Possitive Numbers Only");
        }
    }

    public double getAdjout() {
        return adjout;
    }

    public void setAdjout(double adjout) {
        this.adjout = adjout;
    }
    public double getHypadj() {
        return hypadj;
    }

    public void setHypadj(double hypadj) {
        this.hypadj = hypadj;
    }

    public double getOpadj() {
        return opadj;
    }

    public void setOpadj(double opadj) {
        this.opadj = opadj;
    }
    
    public String execute(){
         bjavadegtorad dr=new  bjavadegtorad();
         adjout=dr.adj(hypadj, opadj);
        return "success";
    }
}
