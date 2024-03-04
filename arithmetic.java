import java.util.*;
public class arithmetic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        int dif = num1-num2;
        int mul = num1*num2;
        int div = num1/num2;
        System.out.println(" Addition Sum: "+sum+"\n Subtraction Difference: "+dif+"\n Multiplication Profuct: "+mul+"\n Division Quotient: "+div+"\n");
        sc.close();
    }
}
