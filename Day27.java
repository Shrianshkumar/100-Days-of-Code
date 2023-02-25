Day 27 coding Statement : Write a program to find the double of the given number without using arithmetic operator

Description

For the given input number calculate the double of it without using arithmetic operator.

Input

4

Output

8



//Write a program to find the double of the given number without using arithmetic operator

import java.util.*;
public class Day27{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num1=num;
        for(int i=1;i<=num;i++){
            num1++;
        }
        System.out.println(num1);
    }
}
