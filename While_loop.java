import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), i = 0;
        while(i <= num){
            System.out.print(i+"\t");
            i++;
        }
        sc.close();
    }
}
