import java.util.*;
import java.util.regex.Pattern;
public class PasswordVerify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String regex = "(?=.*[a-z])(?=.*[A-Z])";
System.out.println("Please enter a password.");
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    Pattern pattern = Pattern.compile(regex);
    if (a.length() >= 7 && a.length() <=15) {
      if (a.contains("!")) {
        if (a.matches(".*[a-z].*") && a.matches(".*[A-Z].*")) {
            System.out.println("Password valid and accepted");
           } else{
              System.out.println("Error Password must contain at least one lowercase and one uppercase letter.");
            }
          } else{
            System.out.println("Error, Password must contain \"!\"");
          }
        }
         else{
            System.out.println("Error Password must be 7 to 15 characters long.");
          }
        }
      
    
}
