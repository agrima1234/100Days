//Whether entered element is Alphabet or not

import java.util.Scanner;
public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println(ch + " is an Alphabet");
        }
        else
            System.out.println(ch + " is not an Alphabet");
    }
}
