package tcummings1989.Lab;

import java.util.Scanner;

public class AccountDemoClient {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("What is the account number?");
      int accountNum = input.nextInt();
      CdAccount cd = new CdAccount (accountNum, 50000.0);
      System.out.println("What is the term?");
      int term = input.nextInt();
      cd.term(term);
      System.out.println("account number: " + cd.getAccoutNum());
      System.out.println("account type: " + cd.getType());
      System.out.println("initial amount: " + cd.getAmount());
      System.out.println("cd term (months): " + cd.getTerm());


     /* System.out.println("Enter the Savings account number");
      Scanner inputAccountNum = new Scanner(System.in);
      int savingsInputNum = inputAccountNum.nextInt();
      System.out.println("Enter the Checkings account number");
      int checkingInputNum = inputAccountNum.nextInt();

      SavingsAccount sa = new SavingsAccount(savingsInputNum, 10000);
      System.out.println("account number: " + sa.getAccoutNum());
      System.out.println("account type: " + sa.getType());
      System.out.println("initial amount: " + sa.getAmount());
      sa.deposit(5000);
      System.out.println("new amount after deposit: " + sa.getAmount());

      CheckingAccount ca = new CheckingAccount(checkingInputNum, 20000);
      System.out.println("account number: " + ca.getAccoutNum());
      System.out.println("account type: " + ca.getType());
      System.out.println("initial amount: " + ca.getAmount());
      ca.deposit(6000);
      System.out.println("new amount after deposit: " + ca.getAmount());
      ca.withdraw(3000);
      System.out.println("new amount after withdrawal: " + ca.getAmount()); */
   }
}