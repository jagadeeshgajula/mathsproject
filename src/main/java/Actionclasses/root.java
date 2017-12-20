package Actionclasses;

import Businessclasses.root1;
import com.opensymphony.xwork2.ActionSupport;
import Businessclasses.root1.*;

public class root extends ActionSupport {

    private double rootvalue;
    private double result;

    

    public double getRootvalue() {
        return rootvalue;
    }

    public void setRootvalue(double rootvalue) {
        this.rootvalue = rootvalue;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String execute() {
        root1 r1 = new root1();
        result = r1.root(rootvalue);
        return "success";

    }
    public void validate() {
        if (rootvalue<0) {
            addFieldError("rootvalue", "please enter positive values");
        }
    }
}
