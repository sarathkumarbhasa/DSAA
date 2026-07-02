import java.util.Scanner;

class Six {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter ur marks: ");
        int num1=sc.nextInt();
        if (num1>=35 & num1<=100)
        {
            System.out.println("Passed");
        }
        else if (num1<0 || num1>100)
        {
            System.out.println("Pls enter valid number");
        }
        else
        {
            System.out.println("Failed");
        }
        
        sc.close();
        
        
    }
}
