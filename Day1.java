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