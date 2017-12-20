
package Actionclasses;

import Businessclasses.Business1;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;


public class sqrperiaction extends ActionSupport{
   
    private int squareperi;
    private int squareres;

    public int getSquareperi() {
        return squareperi;
    }

    public void setSquareperi(int squareperi) {
        this.squareperi = squareperi;
    }

    public int getSquareres() {
        return squareres;
    }

    public void setSquareres(int squareres) {
        this.squareres = squareres;
    }
     public void validate()
    {
        if( squareperi<0)
        {
            addFieldError("squareperi","Please Enter Positive numbers only");
        }
        
    }
      public String execute()
    {
        Business1 obj=new Business1();
    
        squareres=obj.square2(squareperi);

        System.out.println(squareres);
        return SUCCESS;
    }
}
