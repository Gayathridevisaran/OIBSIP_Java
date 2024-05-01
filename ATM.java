import java.util.Scanner;
class User
{
   private String userId;
   private String pin;
   public User(String userId, String pin)
   {
      this.userId = userId;
      this.pin = pin;
   }
   public String getUserId()
   {
      return userId;
   }
   public String getPin()
   {
      return pin;
   }
}
class Account
{
   private String accountNumber;
   private double balance;
   public Account(String accountNumber, double balance)
   {
      this.accountNumber = accountNumber;
      this.balance = balance;
   }
   public String getAccountNumber()
   {
      return accountNumber;
   }
   public double getBalance()
   {
      return balance;
   }
   public void deposit(double amount)
   {
      balance += amount:
   }
   public void withdraw(double amount)
   {
      if(balance >= amount)
      {
         balance -= amount;
      }
      else
      {
         System.out.println("Insufficient funds");
      }
   }
   public void transfer(Account recipient, double amount)
   {
      if(balance >= amount)
      {
         balance -= amount;
         recipient.deposit(amount);
         System.out.println("Transfer successful");
      }
      else
      {
         System.out.println("Insufficient funds");
      }
   }
}
public class ATM
{
   public static void main(String args[])
   {
      Scanner scanner = new Scanner(System.in);
      User user = new User("user123", "1234");
      Account account = new Account("123456789", 1000.0);
      System.out.println("Enter user ID:");
      String userId = scanner.nextLine();
      System.out.println("Enter PIN:");
      String pin = scanner.nextLine();

      if(!userId.equals(user.getUserId())||!pin.equals(user.getPin()))
      {
         System.out.println("Invalid credentials Exiting...");
         return;
      }
      System.out.println("Welcome,"+user.getUserId());
      while(true)
      {
         System.out.println("\nATM Menu:");        
         System.out.println("1. Transaction History");
         System.out.println("2. Withdraw");
         System.out.println("3. Deposit");
         System.out.println("4. Transfer");
         System.out.println("5. Quit");
         System.out.println("Enter your choice:");
         int choice = scanner.nextInt();
         switch(choice)
         {
            case 1:
               System.out.println("Transaction History:");
               break;
            case 2:
               System.out.println("Enter amount to withdraw:");
               double withdrawAmount = scanner.nextDouble();
               account.withdraw(withdraw(withdrawAmount);
               System.out.println("Remaining balance:"+account.getBalance());
               break;
            case 3:
               System.out.println("Enter amount to deposit:");
               double depositAmount = scanner.nextDouble();
               account.deposit(depositAmount);
               System.out.println("Updated balance:"+account.getBalance());
               break;
            case 4:
               System.out.println("Enter recipient's account number:");
               String recipientAccountNumber = scanner.next();
               Account recipientAccount = new Account(recipientAccountNumber, 0.0);
               System.out.println("Enter amount to transfer:");       
               double transferAmount = scanner.nextDouble();
               account.transfer(recipientAccount, transferAmount);
               System.out.println("Your balance after transfer:"+account.getBalance());
               break;
            case 5:
               System.out.println("Thank you for using the ATM. Goodbye!");
               return;
            default:
               System.out.println("Invalid choice. Please try again.");
         }
      }
   }
}