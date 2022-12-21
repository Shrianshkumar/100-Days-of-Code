Day 19 coding Statement : Write a program to identify if the number is Armstrong number or not

Description

Get an input number from user and check whether the given number is an Armstrong number or not.

E.g. Let the number be 1634,

Here 1^4 + 6^4 + 3 ^4 + 4^4 = 1634

Therefore, this is an Armstrong number

Input

153

Output

Armstrong number

Input

121

Output

Not an Armstrong number  


import java.util.*;
public class Day19{
    public static void main(String[] args){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int copy=num;
        String n = Integer.toString(num);
        int len=n.length();
        while(num!=0){
            int rem=num % 10;
            int mul=1;
            for(int i=1;i<=len;i++){
                mul*=rem;
            }
            sum+=mul;
            num/=10;
        }
        if(sum==copy){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not an Armstrong number");
        }
    }
}
