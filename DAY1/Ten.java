import java.util.Scanner;

class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        int length = sc.nextInt();

        System.out.print("Enter Breadth: ");
        int breadth = sc.nextInt();

        System.out.print("Enter Height: ");
        int height = sc.nextInt();

        double volume = length * breadth * height;

        System.out.println("Volume = " + volume);

        sc.close();
    }
}
