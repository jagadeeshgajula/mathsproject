
package Actionclasses;

import Businessclasses.Business1;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;


public class diameteraction extends ActionSupport {
    private int diamtrradius;
    private int diameterres;

    public int getDiameterres() {
        return diameterres;
    }

    public void setDiameterres(int diameterres) {
        this.diameterres = diameterres;
    }

    public int getDiamtrradius() {
        return diamtrradius;
    }

    public void setDiamtrradius(int diamtrradius) {
        this.diamtrradius = diamtrradius;
    }
 public void validate()
    {
        if(diamtrradius<0)
        {
            addFieldError("diamtrradius","Please Enter Positive numbers only");
        }
    }
  
     public String execute()
    {
        Business1 obj=new Business1();
    
        diameterres=obj.diameter(diamtrradius);
      
        return SUCCESS;
    }
 
}
