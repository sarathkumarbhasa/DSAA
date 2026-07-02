import java.util.Scanner;

class Five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter ur 1st number: ");
        int num1=sc.nextInt();
        System.out.print("Enter ur 2nd number: ");
        int num2=sc.nextInt();
        if (num1>num2)
        {
            System.out.println(num1 + " is greater");
        }
        else if(num2>num1)
        {
            System.out.println(num2 + " is greater");
        }
        else
        {
            System.out.println("Numbers are equal");
        }
        
        sc.close();
        
        
    }
}
