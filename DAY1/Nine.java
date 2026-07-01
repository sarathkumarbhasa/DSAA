import java.util.Scanner;

class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int num3 = sc.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        int num4 = sc.nextInt();

        System.out.print("Enter marks of Subject 5: ");
        int num5 = sc.nextInt();

        int total = num1 + num2 + num3 + num4 + num5;

        double percentage = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}
