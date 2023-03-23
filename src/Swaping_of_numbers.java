import java.util.Scanner;

public class Swaping_of_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First no. ");
        int x = sc.nextInt();
        System.out.println("Enter the Second no. ");
        int y = sc.nextInt();
        int z = x;
        x=y;
        y=z;
        System.out.println("After Swap");
        System.out.println("x = " +x);
        System.out.println("y = " +y);
    }
}
