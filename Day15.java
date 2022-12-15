Day 15 coding Statement : Write a program to identify if the number is Strong number or not

Description

Get a number as input from user and then check whether that number is a strong number or not. A number is said to be strong number if the sum of the factorial of each digit in the number is same as that of the number.

E.g. let the number be 145

Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.

Input

121

Output

Not a strong number

Input

2

Output

Strong number


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
