import java.util.*;
class Day5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter: ");
        int num=sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}