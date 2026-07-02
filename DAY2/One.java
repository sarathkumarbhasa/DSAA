import java.util.Scanner;

class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter ur number: ");
        int num=sc.nextInt();
        if (num<0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Positive");
        }
        
        sc.close();
        
        
    }
}
