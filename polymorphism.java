class Func{
    // polymorphism is applied in this function as there are arrays of many data types, and creating a separate function for each one is inefficient hence we use the <T> method to print all the different arrays
    <T> void print_array(T[] array){
        System.out.println("Array: ");
        for(T element: array){
            System.out.println(element);
        }
    }

}

public class polymorphism {
    public static void main(String[] args) {
        Integer[] int_array = {1,2,6,4};
        Character[] char_array = {'a', 'b'};
        Byte[] byte_array = {0x01, 0x02};
        Func f1 = new Func();
        f1.print_array(int_array);
        f1.print_array(char_array);
        f1.print_array(byte_array);
    }
}
