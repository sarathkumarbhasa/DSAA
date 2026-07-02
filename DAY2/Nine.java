import java.util.Scanner;

class Nine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter ur 1st number: ");
        int num1=sc.nextInt();
        System.out.print("Enter ur 2nd number: ");
        int num2=sc.nextInt();
        System.out.print("Enter ur 3rd number: ");
        int num3=sc.nextInt();
        if (num1>num2 & num1>num3)
        {
            System.out.println(num1 + " is greater");
        }
        else if (num2>num1 & num2>num3)
        {
            System.out.println(num2 + " is greater");
        }
        else if (num3>num1 & num3>num1 )
        {
            System.out.println(num3 + " is greater");
        }
        else
        {
            System.out.println("Three are equal");
        }
        
        sc.close();
        
        
    }
}
