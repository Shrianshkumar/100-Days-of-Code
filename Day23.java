Day 23 coding Statement : Write a program to Replace all 0’s with 1 in a given integer

Description

Get a number as input from the user and find the zeros present in that number.

Then convert the zeros into one and then print it.

Input

310020

Output

311121


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
