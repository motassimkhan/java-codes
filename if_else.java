
import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age<0||age>128){
            System.out.println("Invalid Input!");
        }
        else if(age>18){
            System.out.println("You are eligible for voting!");
        }
        else {
            System.out.println("You are NOT eligible for voting!");
        }
    }
}
