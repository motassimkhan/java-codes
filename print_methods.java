public class print_methods {
    public static void main(String[] args) {
        int a = 5;
        float b =0.56f;
        // System.out.println is used to print in the next line
        System.out.println("Value of a: ");
        System.out.println(a);
        // System.out.print is used to print in the same line
        System.out.print("Value of a: ");
        System.out.print(a);
        // System.out.printf or System.out.format is used to print formatted string
        System.out.printf("\nValue of a is %d and value of f is %f",a,b);
        System.out.format("\nValue of a is %d and value of f is %f",a,b);

    }
}
