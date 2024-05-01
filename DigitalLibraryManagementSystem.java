import java.util.*;
class Book
{
   private String title;
   private String author;
   private String category;
   private boolean isAvailable;
   public Book(String title, String author, String category)
   {
      this.title = title;
      this.author = author;
      this.category = category;
      this.isAvailable = true;
   }
}
class Member
{
   private String name;
   private String email;
   public Member(String name, String email)
   {
      this.name = name;
      this.email = email;
   }
}
class Library
{
   private List<Book> books;
   private List<Member> members;
   {
      this.books = new ArrayList<>();
      this.members = new ArrayList<>();
   }
   public void addBook(Book book)
   {
   }
   public void removeBook(Book book)
   {
   }
   public void addMember(Member member)
   {
   }
   public void removeMember(Member member)
   {
   }
}
class Admin
{
   private Library library;
   public Admin(Library library)
   {
      this.library = library;
   }
   public void addBook(Book book)
   {
      library.addBook(book);
   }
   public void removeBook(Book book)
   {
      library.removeBook(book);
   }
   public void addMember(Member member)
   {
      library.addMember(member);
   }
   public void removeMember(Member member)
   {
      library.removeMember(member);
   }
}
class User
{
   private Library library;
   public User(Library library)
   {
      this.library = library;
   }
}
public class DigitalLibraryManagementSystem
{
   public static void main(String args[])
   {
      Library library = new Library();
      Admin admin = new Admin(library);
      User user = new User(library);   
   }
}