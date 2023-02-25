Day 21 coding Statement : Write a program to identify if the number is Palindrome or not

Description

Get a number as input from the user and check whether that number is a Palindrome or not.

Input

121

Output

Palindrome

Input

34

Output

Not a Palindrome


import java.util.*;
public class Day21{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num1=num;
        int rev=0;
        while(num1 != 0){
            int rem=num1 % 10;
            num1/=10;
            rev=rev*10+rem;
        }
        if(num==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
