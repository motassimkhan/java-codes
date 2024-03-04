
import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int arm = 0, temp = num, rem;
        while (num > 0){
            rem = num % 10;
            arm = arm + (int)Math.pow(rem,3);
            num = num/10;
        }
        if (temp == arm) System.out.println("Number is Armstrong!");
        else System.out.println("Number is NOT Armstrong!");
        sc.close();
    }
}
