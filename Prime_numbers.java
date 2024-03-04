import java.util.Scanner;
public class Prime_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i  = 1; i <= num; i++) {
            if(num%i == 0) 
                count++;
        }
        if (count == 2) System.out.println("Number Is Prime! ");
        else System.out.println("Number is composite");
        sc.close();
    }

}
