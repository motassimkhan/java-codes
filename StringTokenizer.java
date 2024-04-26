import java.util.Scanner;
public class StringTokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input_string = sc.nextLine();
        StringTokenizer st = new StringTokenizer(input_string, " ");
        
    }
}
