Day 22 coding Statement : Write a program to express a number as a sum of two prime numbers

Description

Get a number as input from the user and express that number as sum of two prime numbers.

Input

4

Output

4 can be expressed as sum of 2 and 2


import java.util.*;
public class Day22{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    boolean flag = false;
    for (int i = 2; i <= number / 2; i++) {
      // condition for i to be a prime number
      if (checkPrime(i)) {
        // condition for n-i to be a prime number
        if (checkPrime(number - i)) {
          // n = primeNumber1 + primeNumber2
          System.out.println(i + " + " +  (number - i) + " = " + number);
          flag = true;
        }
      }
    }
    if (!flag)
      System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
  }
  // Function to check prime number
  static boolean checkPrime(int num) {
    boolean isPrime = true;
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }
    return isPrime;
  }
}
