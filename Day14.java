import java.util.*;
public class Day14{
    public static void main(String[] args){
        int rem=0;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
             while(num!=0){
            rem=num % 10;
            num/=10;
            System.out.print(rem);
            }   
    }
}