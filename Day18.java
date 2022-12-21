import java.util.*;
public class Day18{
    public static void main(String[] args){
        int x3,y3,Div;
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        x3 = (x1*y2) + (x2*y1);
        y3 = (y1*y2);
        if(x3>y3)
            Div=y3;
        else
            Div=x3;
        for(int i=Div;i>0;i--){
            if(x3%i==0 && y3%i==0){
                x3=x3/i;
                y3=y3/i;
            }
        }
        System.out.print("Sum of fractions is "+x3+"/"+y3);
 
    }
}