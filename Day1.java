//Vowel Or Consonant
import java.util.*;
public class Day1 {
    //Take input from the user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch=='e' || ch == 'i' || ch =='o'|| ch=='u'|| ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println(ch +" is a Vowel.");
        }
        else
            System.out.println(ch +" is a Consonant.");
    }
}