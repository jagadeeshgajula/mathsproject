
package Businessclasses;
import java.util.*;

public class root1_loop {
    
public double result[]= new double[30]; 
    public int i;
    public double root_loop(double rootval_loop)
    {
        //for(int j=0;j<rootval_loop;j++)
        //{
        for(i=0;i<=rootval_loop;i++)
        {
            result[i]=Math.sqrt(i);
    //System.out.println(result);
        
        }
         return result[i];
        
    } 
}