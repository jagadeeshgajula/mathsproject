
package Actionclasses;

import Businessclasses.bjavadegtorad;
import com.opensymphony.xwork2.ActionSupport;

public class tableaction extends ActionSupport{
    private int degree;
private double sin,cos,tan,cosec,sec,cot;

    public double getSin() {
        return sin;
    }

    public void setSin(double sin) {
        this.sin = sin;
    }

    public double getCos() {
        return cos;
    }

    public void setCos(double cos) {
        this.cos = cos;
    }

    public double getTan() {
        return tan;
    }

    public void setTan(double tan) {
        this.tan = tan;
    }

    public double getCosec() {
        return cosec;
    }

    public void setCosec(double cosec) {
        this.cosec = cosec;
    }

    public double getSec() {
        return sec;
    }

    public void setSec(double sec) {
        this.sec = sec;
    }

    public double getCot() {
        return cot;
    }

    public void setCot(double cot) {
        this.cot = cot;
    }
    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }
    public void validate(){
        if(degree<0){
            addFieldError("degree","Please Give Correct Input And Give Possitive Numbers Only");
        }
    }
    public String execute(){
        sin = Math.sin(degree);
        cos = Math.cos(degree);
         tan = Math.tan(degree);
        cosec = 1 / sin;
        sec = 1 / cos;
           cot = 1 / tan;
        return "success";
    }
}
