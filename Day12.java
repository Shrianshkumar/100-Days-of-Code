import java.util.*;
public class Day12{
    public static void main(String[] args){
        int sum=0,rem=0;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==0){
            System.out.println(sum);
        }else{
             while(num!=0){
            rem=num % 10;
            sum+=rem;
            num/=10;
        }
        System.out.println(sum);
        }
       
    }
}