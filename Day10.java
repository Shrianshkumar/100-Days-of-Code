import java.util.*;
public class Day10{
    public static void main(String[] args){
        int fact=1;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=num; i>=2; i--){
            fact= fact*i;
        }
        System.out.println("factorial=" +fact);
    }
}