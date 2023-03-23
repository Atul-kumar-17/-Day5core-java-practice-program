import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet ");
        char ch = sc.next().charAt(0);
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u') {
            System.out.println("it is Vowel");
        }else if(ch>='a'&& ch<='z') {
            System.out.println("it is Consonant");
        }else{
            System.out.println("not a alphabet");
        }
    }
}
