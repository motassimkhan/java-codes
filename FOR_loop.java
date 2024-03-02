import java.util.Scanner;

public class FOR_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Numbers from 0 to "+n);
        for (int i = 0; i <= n; i++){
            System.out.print(i+"\t");
        }
        sc.close();
    }
}
