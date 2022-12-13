import java.util.*;
public class Day13{
    public static void main(String[] args){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==0){
            System.out.println(sum);
        }else{
            for(int i=1;i<=num;i++){
                sum+=i;
            }
            System.out.println(sum);
        }
    }
}