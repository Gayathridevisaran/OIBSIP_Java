import java.util.Scanner;
class User
{
   private String username;
   private String password;
   public User(String username,String password)
   {
      this.username = username;
      this.password = password;
   }
   public String getUsername()
   {
      return username;
   }
   public String getPassword()
   {
      return password;
   }
}

class ReservationSystem
{
   private User currentUser;
   public ReservationSystem(User user)
   {
      this.currentUser = user;
   }
   public void makeReservation()
   {
   }
   public void cancelReservation()
   {
   }
}

public class OnlineReservationSystem
{
   public static void main(String args [])
   { 
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter username:");
      String username = scanner.nextLine();
      System.out.println("Enter password:");
      String password = scanner.nextLine();

      User user = new User(username,password);
      ReservationSystem reservationSystem = new ReservationSystem(user);

      System.out.println("1. Make Reservation");
      System.out.println("2. Cancel Reservation");
      System.out.println("Enter your choice:");
      int choice = scanner.nextInt();

      switch(choice)
      {
         case 1:
             reservationSystem.makeReservation();
             break;
         case 2:
             reservationSystem.cancelReservation();
             break;
         default:
             System.out.println("Invalid choice");
      }
   }
}