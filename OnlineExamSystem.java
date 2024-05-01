import java.util.Scanner;
class User
{
   private String username;
   private String password;
   public User(String username, String password)
   {
      this.username = username;
      this.password = password;
   }
}
class Exam
{
   private String[] questions;
   private String[][] options;
   private int[] answers;
   private int totalTime;
   public Exam(String[] questions, String[][] options, int[] answers, int totalTime)
   {
      this.questions = questions;
      this.options = options;
      this.answers = answers;
      this.totalTime = totalTime;
   }
}
class OnlineExamSystem
{
   private User currentUser;
   private Exam currentExam;
   private boolean loggedIn;
   public void login(String username, String password)
   {
      this.loggedIn = true;
   }
   public void updateProfile(String username, String password)
   {
   }
   public void selectAnswers(int[]selectedAnswers)
   {
   }
   public void startExam()
   {
   }
   public void submitExam()
   {
   }
   public void logout()
   {
      this.loggedIn = false;
      this.currentUser = null;
      this.currentExam = null;
   }
   public static void main(String args[])
   {
      OnlineExamSystem examSystem = new OnlineExamSystem();
   }
}