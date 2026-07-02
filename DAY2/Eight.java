import java.util.Scanner;

class Eight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter ur age: ");
        int num=sc.nextInt();
        if (num>=0 & num<13)
        {
            System.out.println("Child");
        }
        else if (num>=13 & num<=19)
        {
            System.out.println("Teenager");
        }
        else if (num>19 & num<60 )
        {
            System.out.println("Adult");
        }
        else if (num>=60 & num<=100)
        {
          System.out.println("Senior Citizen");   
        }
        else
        {
            System.out.println("pls enter valid age");
        }
        
        sc.close();
        
        
    }
}
