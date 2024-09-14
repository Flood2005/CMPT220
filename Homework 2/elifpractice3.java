import java.util.Scanner;

public class elifpractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Please write your age");
        int myage = sc.nextInt();
        if (myage >= 25){
            System.out.println("You can legally drink and rent a car");}
        else if(myage >20 && myage <26){
            System.out.println("You can drink but no car for you");}
        else if(myage >=18 && myage<=21){
            System.out.println("You can smoke but not drink or rent a car");
        }
        else{
            System.out.println("Only soda for you");
        }
        }
    }