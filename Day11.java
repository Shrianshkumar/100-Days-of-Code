import java.util.*;
public class Day11{
    public static void main(String[] args){
        int f1=0,f2=1;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.print(f1+" , ");
           int f3=f1+f2;
           f1=f2;
           f2=f3;
        }
    }
}