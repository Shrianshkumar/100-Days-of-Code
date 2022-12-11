import java.util.*;
public class Day8 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    double a,b,c,root1,root2;
    System.out.println("Enter the values for a, b and c: ");
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    double d = Math.pow(b,2) - 4*a*c;
    if(d>0){
        root1 = (-b + Math.sqrt(d)) / (2 * a);
        root2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.println("There are two real roots");
        System.out.println("Roots are " + root1 + " and "+ root2);
    }else if (d == 0){
        root1= -b/(2*a);
        System.out.println("Roots are equal");
        System.out.println("Roots are " +root1 );
    }else{
        root1=-b/(2*a);
        root2= Math.sqrt(-d)/(2*a);
        System.out.println("No real roots");
        System.out.println("Roots are " + root1 + " and "+ root2);
        }
 }}