package Businessclasses;


public class bjavadegtorad {
   // public double result,res,Hypres;
    public double display(int Degree){
   double result= Math.toRadians(Degree);
   return result;
    
}
    public double raddeg(int radtodeg){
      double res=Math.toDegrees(radtodeg);
        return res;
    }
    public double hyp( double adjhyp,double ophyp){
          double hyp1 = Math.sqrt((Math.pow(adjhyp, 2)) + (Math.pow(ophyp, 2)));
//           double hypres = (Math.sqrt(hyp1));
             return hyp1;
    }
    public double adj(double hypadj,double opadj){
         double adj1 = (Math.pow(hypadj, 2)) - (Math.pow(opadj, 2));
         double adjres= Math.sqrt(adj1);
         return adjres;
    }
    public double op(int hypop,int adjop){
          double opp1 = (Math.pow(hypop, 2)) - (Math.pow(adjop, 2));
        double oppres= Math.sqrt(opp1);
        return oppres;
    }
}