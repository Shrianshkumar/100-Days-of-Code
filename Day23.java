import java.util.*;
public class Day23{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num1=0, rev=0;
        if(num==0){
            num1=1;
        }
        while(num !=0){
            int rem=num % 10;
            if(rem==0){
                rem++;
            }
            num/=10;
            num1= num1*10+rem;
        }
        while(num1 !=0){
            int rem=num1 % 10;
            num1/=10;
            rev=rev*10+rem;
        }
        System.out.println(rev);
    }
}