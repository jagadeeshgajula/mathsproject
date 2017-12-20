
package Actionclasses;

import Businessclasses.root1_loop;
import com.opensymphony.xwork2.ActionSupport;
import Businessclasses.root1_loop.*;
import java.util.ArrayList;
import java.util.List;

public class root_loop extends ActionSupport{
     private double rootvalueloop;
         
     private List<Double> results;

    public List<Double> getResults() {
        return results;
    }

    public void setResults(List<Double> results) {
        this.results = results;
    }

 
    public double getRootvalueloop() {
        return rootvalueloop;
    }

    public void setRootvalueloop(double rootvalueloop) {
        this.rootvalueloop = rootvalueloop;
    }

    
      public void validate() {
        if (rootvalueloop<0) {
            addFieldError("rootvalueloop", "please enter positive values");
        }
      }
  public String execute()
    {
         results= new ArrayList<Double>();
        for(int i=0;i<=rootvalueloop;i++)
        {
            
            results.add(Math.sqrt(i));
        }

        //System.out.println(result);
        return "success";
        
    }
}