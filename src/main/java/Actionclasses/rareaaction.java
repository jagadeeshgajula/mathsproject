
package Actionclasses;

import Businessclasses.Business1;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;

public class rareaaction extends ActionSupport {
    private int rlen;
    private int rareares;

    public int getRareares() {
        return rareares;
    }

    public void setRareares(int rareares) {
        this.rareares = rareares;
    }

    public int getRlen() {
        return rlen;
    }

    public void setRlen(int rlen) {
        this.rlen = rlen;
    }

    public int getRbre() {
        return rbre;
    }

    public void setRbre(int rbre) {
        this.rbre = rbre;
    }
    private int rbre;
    public void validate()
    {
        if(rlen<0||rbre<0)
        {
            addFieldError("rlen","Please Enter Positive numbers only");
        }
//        if(rbre<=0)
//        {
//            addFieldError("rbre","Please Enter Positive numbers only");
//        }
    }
    public String execute()
    {
        Business1 obj=new Business1();
    
       rareares=obj.rect1(rlen,rbre);

       
        return SUCCESS;
    }
}
