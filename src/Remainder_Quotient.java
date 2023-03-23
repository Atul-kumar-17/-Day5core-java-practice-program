import java.util.Scanner;

public class Remainder_Quotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dividend = ");
        double dividend = sc.nextDouble();
        System.out.println("Enter the Divisor = ");
        double divisor = sc.nextDouble();
        double quotient = dividend/divisor;
        double remainder = dividend%divisor;
        System.out.println("Quotient = "+quotient);
        System.out.println("Remainder = "+remainder);
    }

}
