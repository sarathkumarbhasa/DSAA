import java.util.Scanner;

class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st num: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd num: ");
        int num2 = sc.nextInt();

        System.out.println("Remainder : " + (num1%num2));

        sc.close();
    }
}
