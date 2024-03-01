import java.util.Scanner;
public class taking_input {
    public static void main(String[] args) {
        // creating an object sc of scanner class that takes system input
        Scanner sc = new Scanner(System.in);
        // taking a number as input using nextInt
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("number: "+a);
        // taking float as input using nextFloat
        System.out.println("Enter a floating point number: ");
        float b = sc.nextFloat();
        System.out.println("Float: "+b);
        // taking string as input using next and nextLine
        System.out.println("Enter a word: ");
        String str = sc.next();
        System.out.println("Word: "+str);
        System.out.println("Enter a sentence: ");
        sc.nextLine();  
        String str1 = sc.nextLine();
        System.out.println("Sentence: "+str1);
    }
}
