import java.util.Scanner;

//No. Of Digits
public class Day9 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a!=0){
            int rem = a%10;
            count++;
            a= a/10;
        }
        System.out.println(count);

    }
}
