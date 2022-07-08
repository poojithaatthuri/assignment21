package assign21;
import java.util.Scanner;
import java.util.regex.Matcher;

import java.util.regex.Pattern;
public class email {

        public static void firstName() {
            String firstNamePattern = "[A-Z]{1}[a-z]{2,}";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter First Name:");
            String firstName = scanner.next();
            Pattern pattern = Pattern.compile(firstNamePattern);
            Matcher matcher = pattern.matcher(firstName);
            boolean result = matcher.matches();
            if(result == true){
                System.out.println("First Name is valid");
            }
            else
                System.out.println("First Name is Invalid");
        }
        public static void lastName() {
            String lastNamePattern = "[A-Z]{1}[a-z]{2,}";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Last Name:");
            String lastName = scanner.next();
            Pattern pattern = Pattern.compile(lastNamePattern);
            Matcher matcher = pattern.matcher(lastName);
            boolean result = matcher.matches();
            if(result == true)
                System.out.println("Last Name is Valid");
            else
                System.out.println("Last Name is Invalid");
        }
        public static void email(){
            String emailPattern= "[a-zA-Z0-9]+[.+-]{0,1}[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.a-z]{0,4}";
            System.out.println("Enter your Email:");
            Scanner scanner = new Scanner(System.in);
            String email = scanner.next();
            Pattern pattern=Pattern.compile(emailPattern);
            Matcher matcher=pattern.matcher(email);
            boolean result=matcher.matches();

            if(result== true){
                System.out.println("true");
            }else{
                System.out.println("Email is not valid");
            }
        }
        public static void main(String[] args) {
            System.out.println("Welcome to Exception Handling");
            firstName();//UC1
            lastName();//UC2
            email();//UC3
        }
    }

