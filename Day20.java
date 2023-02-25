Day 20 coding Statement : Write a program to identify if the number is Prime number or not

Description

Get a number as input from the user and check whether that number is prime or not.

A prime number is a number with factors as 1 and that number itself.

Input

1

Output

1 is not a prime number

Input

5

Output

5 is a prime number  


import java.util.*;
public class Day20{
    public static void main(String[] args){
        int count=0;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==2){
            System.out.println(num + " is a prime number");
        }else{
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
        }
        if(count==2){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }
        }
    }
}
