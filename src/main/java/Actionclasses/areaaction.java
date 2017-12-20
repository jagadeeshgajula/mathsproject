package Actionclasses;

import Businessclasses.Business1;
import com.opensymphony.xwork2.ActionSupport;

public class areaaction extends ActionSupport {

    private int radius;

    private double res;

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void validate()
    {
        if(radius<0)
        {
            addFieldError("radius","Please Enter Positive numbers from 1-9");
        }
//       
    }

    public String execute() {
        Business1 obj = new Business1();
        res = obj.area(radius);

        return SUCCESS;
    }
}
