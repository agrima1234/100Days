import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a, b and c:");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c= sc.nextInt();
        double det = (b*b) - (4*a*c);
        double sqrt = Math.sqrt(det);
        if(det>0){
            double first = (-b + sqrt)/2*a;
            double second = (-b - sqrt)/2*a;
            System.out.println("Roots are:"+ first + " and " + second);
        } else if (det == 0) {
            System.out.println("Roots are equal. Root1=Root2= " + (-b+sqrt)/2*a);
        }
    }

}
