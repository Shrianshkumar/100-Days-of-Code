Day 24 coding Statement : Write a program to print Pyramid pattern using stars

Description

Get the number of lines as the input and print stars in that many lines or rows in a pyramid shape.

Input

4

Output

  *

 ***

*****

*******



import java.util.*;
public class Day24{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int s=n-1;
        int st=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=s;j++){
                System.out.print("\t");
            }
             s--;
            for(int k=1;k<=st;k++){
                System.out.print("*\t"); 
            }
            st+=2;
            System.out.println();
        }
    }
}
