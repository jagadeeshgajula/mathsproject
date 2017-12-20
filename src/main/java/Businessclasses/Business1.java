/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Businessclasses;
 import java.math.*;
/**
 *
 * @author Dell
 */
public class Business1 {
   
    public double area(int radius)
    {
      double result1=Math.PI*radius*radius;
       return result1; 
    }
    public double circumference(int circumradius)
    {
        double result2=2*Math.PI*circumradius;
        return result2;
    }
    public int diameter(int diamtrradius)
    {
        int result3=2*diamtrradius;
        return result3;
    }
    public int square1(int sqrarea)
    {
        int result4=sqrarea*sqrarea;
        return result4;
    }
    public int square2(int squareperi)
    {
        int result5=4*squareperi;
        return result5;
    }
    public int rect1(int rlen,int rbre)
    {
        int result6=rlen*rbre;
        return result6;
    }
    public int rect2(int rlen,int rbre)
    {
        int result7=2*(rlen+rbre);
        return result7;
    }
}
