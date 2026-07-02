import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        double finalAmount;

        if (amount > 5000) {
            finalAmount = amount - (amount * 20 / 100);
        } else {
            finalAmount = amount;
        }

        System.out.println("Final amount to pay: " + finalAmount);

        sc.close();
    }
}
