package application;

import java.util.Scanner;
import model.entities.Account;
import model.exceptions.DomainException;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    try {
        System.out.println("Enter account data:");
        System.out.print("Number:");
        int number = sc.nextInt();
        System.out.print("Holder:");
        sc.next();
        String holder = sc.nextLine();
        System.out.print("Initial balance:");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit:");
        double withdrawlimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdrawlimit);

        System.out.println(" ");
        System.out.print("Enter amount for withdraw:");
        double amount = sc.nextDouble();
        account.withdraw(amount);

        System.out.print(account);
    }
    catch(DomainException e){
        System.out.println("Withdraw error: "+e.getMessage());
    }
    catch(RuntimeException e){
        System.out.println("Unexpected error");
    }
        sc.close();
    }
}
