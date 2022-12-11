Day 7 coding Statement:  Write a program to find Number of days in a given month of a given year

Description

Get the number of month and year as input from the user and check the number of days present in that month.

Input

Enter month : 2

Enter year : 2000

Output

29


import java.util.*;
class Day7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month: ");
        int month=sc.nextInt();
        System.out.println("Enter year: ");
        int year=sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println("Number of days is 31");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println("Number of days is 30");
            break;
            case 2:
                if((year%400==0) || ((year%100!=0)&&(year%4==0)))
                    System.out.println("Number of days is 29");
                else System.out.println("Number of days is 28");
            break;
  
            default:
            System.out.println("Invalid Month.");
            break;
        }
    }
}
