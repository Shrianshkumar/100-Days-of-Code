Day 9 coding Statement : Write a program to find Number of digits in an integer

Description

Take an integer as the input from the user and then calculate the number of digits in the given input and print it as the output.

Input

3241

Output

4 I

nput

6

Output

1


import java.util.*;
public class Day9{
    public static void main(String[] args){
        int count;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String n = Integer.toString(num);
        System.out.println(+n.length());
    }
}
