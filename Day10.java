Day 10 coding Statement:  Write a program to find Factorial of a number

Description

Get a number from user for which you need to fin the factorial, then calculate the factorial and give it as the output.

Input

4

Output

24


import java.util.*;
public class Day10{
    public static void main(String[] args){
        int fact=1;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=num; i>=2; i--){
            fact= fact*i;
        }
        System.out.println("factorial=" +fact);
    }
}
