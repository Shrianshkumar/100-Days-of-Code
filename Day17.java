import java.util.*;
public class Day17{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count;
        for(int i=1;i<=num;i++){
            if(num % i==0){
                count=i;
                System.out.println(count);
            }
        }
    }
}