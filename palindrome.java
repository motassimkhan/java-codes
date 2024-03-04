import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        int temp = num,rem, rev = 0;
        while(num > 0){
            rem = num % 10;
            rev = (rev*10)+rem;
            num = num/10;
        }
        if (rev == temp) System.out.println("Reverse: "+rev+" Number is palindrome!");
        else System.out.println("Reverse: "+rev+" Number is not palindrome!");
        sc.close();
    }
}
