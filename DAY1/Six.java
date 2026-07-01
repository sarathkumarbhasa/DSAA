import java.util.Scanner;

class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st num: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd num: ");
        int b = sc.nextInt();

        System.out.println("Before Swapping: A = " + a + ", B = " + b);
      
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping: A = " + a + ", B = " + b);

        sc.close();
    }
}
