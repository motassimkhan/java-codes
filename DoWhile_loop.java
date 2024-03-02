import java.util.Scanner;

public class DoWhile_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), i = 0;
        System.out.println("Numbers from 0 to "+num);
        do{
            System.out.print(i+"\t");
        } while (i <= num);
        sc.close();
    }
}
