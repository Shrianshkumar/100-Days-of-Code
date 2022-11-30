Day 1 coding Statement: Write a program to identify if the character is a vowel or consonant.

Description of the program: 


Take an input character from the user and check whether the given input is a vowel or consonant.

Input
A

Output
Vowel

Input
m

Output
Consonant

Input
3

Output
Invalid Input



import java.util.*;
class Day1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter: ");
        char ch=sc.next().charAt(0);
        if(ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D' || ch == 'E' 
        || ch == 'a' || ch == 'b' || ch == 'c' || ch == 'd' || ch == 'e'){
                System.out.println("Vowel");
            }
        else if(ch >= '0' && ch <= '9'){
                System.out.println("Invalid input");
            }else{
                System.out.println("Consonant");
            }
    }
}
