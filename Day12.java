Day 12 coding Statement:  Write a program to find Sum of digits of a number

Description

Get a number from user and then find the sum of the digits in the given number.

E.g. let the number = 341

Sum of digits is 3+4+1= 8

Input

4521

Output

12


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
