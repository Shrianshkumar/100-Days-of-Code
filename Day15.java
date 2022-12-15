import java.util.*;
public class Day15{
    public static void main(String[] args){
        int rem=0,sum=0;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num1=num;
        while(num!=0){
            int fact=1;
            rem=num % 10;
            num/=10;
            for(int i=rem; i>=2;i--){
                fact*=i;
            }
            sum+=fact;
        }
        if(sum==num1){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a Strong Number");
        }
    }
}