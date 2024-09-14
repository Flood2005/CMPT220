import java.util.Scanner;
class Morepractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstname = sc.nextLine();
        // Putting String () = sc.nextline is basically functioning as print(input)
        System.out.println("What is your last name?");
        String lastname = sc.nextLine();
        
        
        System.out.println("Your name is " + firstname + " " + lastname);
        //Java recquires you to manually add a space string when combining variables
    }
}