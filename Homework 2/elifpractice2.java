import java.util.Scanner;

public class elifpractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Please write your age");
        int myage = sc.nextint();
        if (myage >= 21){
            System.out.println("You can legally drink");}
        else{
            System.out.println("NO ALCOHOL FOR YOU MINOR");}
        }
    }