import java.util.*;
class Day6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st value: ");
        int x=sc.nextInt();
        System.out.println("Enter 2nd value: ");
        int y=sc.nextInt();
        if(x > 0 && y > 0){
            System.out.println("This point lies in first quadrant.");
        }else if(x < 0 && y > 0){
            System.out.println("This point lies in second quadrant.");
        }else if(x < 0 && y < 0){
            System.out.println("This point lies in third quadrant.");
        }else{
            System.out.println("This point lies in fourth quadrant."); 
        }
    }
}