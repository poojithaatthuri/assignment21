package assign21;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailSamples {

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
        public static void mobileNumber() {
            Scanner scanner = new Scanner(System.in);
            String MobileNumberPattern = "(91-)?[0-9]{10}";
            System.out.println("Enter the phone number");
            String phoneNumber = scanner.next();
            Pattern pattern = Pattern.compile(MobileNumberPattern);
            Matcher matcher = pattern.matcher(phoneNumber);
            Boolean result = matcher.matches();
            if (result == true) {
                System.out.println("Mobile number is valid");
            } else {
                System.out.println("Mobile number is invalid");
            }
        }
        public static void passwordRule1() {
            Scanner scanner = new Scanner(System.in);
            String PasswordPattern = "[a-zA-Z0-9~!@#$]{8,}";
            System.out.println("Enter the Password");
            String passWord = scanner.next();
            Pattern pattern = Pattern.compile(PasswordPattern);
            Matcher matcher = pattern.matcher(passWord);
            Boolean result = matcher.matches();
            if (result == true) {
                System.out.println("Password is valid");
            } else {
                System.out.println("Invaild, please enter minimum 8 character");
            }
        }
        public static void passwordRule2(){
            Scanner scanner = new Scanner(System.in);
            String PasswordPattern="^(?=.*[A-Z])[a-zA-Z0-9@#$%^&+]{8,}$";
            System.out.println("Enter the Password");
            String passWord=scanner.next();
            Pattern pattern=Pattern.compile(PasswordPattern);
            Matcher matcher=pattern.matcher(passWord);
            Boolean result=matcher.matches();
            if(result==true){
                System.out.println("Password is valid");
            }else{
                System.out.println("Invaild, please enter one upper case and minimum 8 character");
            }
        }
        public static void passwordRule3() {
            Scanner scanner = new Scanner(System.in);
            String PasswordPattern = "^(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9@#$%^&+]{8,}$";
            System.out.println("Enter the Password");
            String passWord = scanner.next();
            Pattern pattern = Pattern.compile(PasswordPattern);
            Matcher matcher = pattern.matcher(passWord);
            Boolean result = matcher.matches();
            if (result == true) {
                System.out.println("Password is valid");
            } else {
                System.out.println("Invaild, please enter one number and minimum 8 character");
            }
        }
        public static void passwordRule4() {
            Scanner scanner = new Scanner(System.in);
            String PasswordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])[a-zA-Z0-9@#$%^&+=]{8,}$";
            System.out.println("Enter the Password");
            String passWord = scanner.next();
            Pattern pattern = Pattern.compile(PasswordPattern);
            Matcher matcher = pattern.matcher(passWord);
            Boolean result = matcher.matches();
            if (result == true) {
                System.out.println("Password is valid");
            } else {
                System.out.println("Invaild, please enter one number and minimum 8 character");
            }
        }
        public static void emailAll(){
            String emailPattern= "[a-zA-Z0-9]+[.+-]{0,1}[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.a-z]{0,4}";
            System.out.println("Enter your Email:");
            String[] str = {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com",
                    "abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"};
            int i =0;
            while(i<str.length) {
                Pattern pattern = Pattern.compile(emailPattern);
                Matcher matcher = pattern.matcher(str[i]);
                Boolean result = matcher.matches();

                if (result == true) {
                    System.out.println(i+": Valid");
                } else {
                    System.out.println(i+": Email is not valid");
                }
                i++;
            }
        }
        public static void main(String[] args) {
            System.out.println("Welcome to Exception Handling");
           // @@ -136,5 +155,6 @@ public static void main(String[] args) {
                passwordRule2();//UC6
                passwordRule3();//UC7
                passwordRule4();//UC8
                emailAll();//UC9
            }
        }

