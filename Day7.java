import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();

        if(a==1 || a==3 || a==5|| a==7 || a==8 || a==10|| a==12){
            System.out.println(31);
        }
        if(a==4|| a==6 || a==9 || a==11){
            System.out.println(30);
        }
        if(a==2){
            if (isleap(b)){
                System.out.println(29);
            }
            else
                System.out.println(28);
        }
    }
    static boolean isleap(int n){
        if(n%400==0 )
            return true;
        else if (n%100==0) {
            return false;
        } else if (n%4==0) {
            return true;
        }
        else
            return false;
    }
}
