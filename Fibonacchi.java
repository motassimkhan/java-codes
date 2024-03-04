import java.util.Scanner;

public class Fibonacchi {
    public static void main(String[] args) {
        int a = 0,b = 1,c = 0;
        System.out.print("Enter range of fibonacci series: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0){
            System.out.println("Invalid input!");
            System.exit(0);
        }
        else if (num == 0){
            System.out.println("Fibo series: "+0);
            System.exit(0);
        }
        else if (num == 1){
            System.out.println("Fibo series: "+0+" "+1);
            System.exit(0);
        }
        System.out.println("Fibonacci series: ");
        System.out.print(0+" "+1);
        for (int i = 2; i < num; i++){
            c = b + a;
            System.out.print(" "+ c);
            a = b;
            b = c;
        }
        sc.close();
    }
}
