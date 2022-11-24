import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>=0 && b>=0)
            System.out.println("This point lies in first quadrant.");
        else if (a<0 && b>0) {
            System.out.println("This point lies in second quadrant.");
        } else if (a<0 && b<0) {
            System.out.println("This point lies in third quadrant.");
        }
        else
            System.out.println("This point lies in fourth quadrant.");
    }
}
