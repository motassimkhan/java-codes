/*
 *write a java program to find out
 the day of the week by the number read by user
 1 for Monday 2 for Tuesday ... 7 for sunday)
 */

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for day of the week: ");
        int num = sc.nextInt();
        switch(num){
            case 1:
                System.out.println("Monday\nworking day");
            case 2: 
                System.out.println("Tuesday\nworking day");
                break;
            case 3:
                System.out.println("Wednesday\nworking day");
                break;
            case 4:
                System.out.println("Thursday\nworking day");
                break;
            case 5:
                System.out.println("Friday\nworking day");
                break;
            case 6:
                System.out.println("Saturday\nworking day");
                break;
            case 7:
                System.out.println("Sunday\nHOLIDAY!!!");
                break;
            default:
                System.out.println("Invalid Input!!");
        }
    }
}
