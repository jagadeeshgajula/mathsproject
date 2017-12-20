package Actionclasses;
import Businessclasses.bjavadegtorad;
import com.opensymphony.xwork2.ActionSupport;
import Businessclasses.bjavadegtorad.*;

public class javadegtorad extends ActionSupport{
    private int Degree;
    private double result;
    public void validate(){
       
        if(Degree<0)
        {
            addFieldError("Degree","Please Give Correct Input And Give Possitive Numbers 0-9 Only");
        }
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public int getDegree() {
        return Degree;
    }

    public void setDegree(int Degree) {
        this.Degree = Degree;
    }
    public String execute(){
        bjavadegtorad  dr=new  bjavadegtorad();
       result= dr.display(Degree);
        return SUCCESS;
    }
    
}
