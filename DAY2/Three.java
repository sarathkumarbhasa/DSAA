import java.util.Scanner;

class Three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter ur number: ");
        int num=sc.nextInt();
        if (num>=18)
        {
            System.out.println("Eligible to vote");
        }
        else
        {
            System.out.println("Not Eligible to vote");
        }
        
        sc.close();
        
        
    }
}
