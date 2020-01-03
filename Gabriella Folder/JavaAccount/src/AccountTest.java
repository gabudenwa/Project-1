import java.util.Scanner;
import javaaccount.Account;
//package javaaccount;

public class AccountTest {
    private static Object acount1;
    private static Object acount2;
    public static void main(String[]args)
            
    {
    Account account1 = new Account(50.00);
    Account account2 = new Account(-7.00);
    
    System.out.printf("account1 balance: $%.2f\n",
             account1.getBalance());
    System.out.printf("account2 balance: $%.2f\n\n",
             account2.getBalance());
    
    Scanner input = new Scanner(System.in);
    double depositAmount;
    
    System.out.printf("Enter deposit amount for account1:  ");
    depositAmount = input.nextDouble();
    System.out.printf("\nadding %.2f to account1 balance\n\n",
            depositAmount);
    
    acount1.credit(depositAmount);
    
    System.out.printf("account1 balance: $%.2f\n",
             account1.getBalance());
    System.out.printf("account2 balance: $%.2f\n\n",
             account2.getBalance());
    
     System.out.print("Enter deposit amount for account2:  ");
    depositAmount = input.nextDouble();
    System.out.printf("\nadding %.2f to account2 balance\n\n",
            depositAmount);
    acount2.credit(depositAmount);
    
    
    System.out.printf("account1 balance: $%.2f\n",
             account1.getBalance());
    System.out.printf("account2 balance: $%.2f\n",
             account2.getBalance());
        
    
    }         
            
    
}