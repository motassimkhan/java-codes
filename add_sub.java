public class add_sub {
    public static void main(String[] args) {
        //byte data type is used for integer values ranging from -128 to 128
        byte num1 = 20;
        //int data type ranges from -2147483648 to 2147483647
        int num2 = 584;
        int sum = num1 + num2;
        int dif = num1 - num2;
        int mul = num1 * num2;
        // double data type is used for floating point values
        double div = num1/num2;
        System.out.println("Sum: "+sum+"\nDifference: "+dif+"\nProuct: "+mul+"\nQuotient: "+div);
    }    
}
