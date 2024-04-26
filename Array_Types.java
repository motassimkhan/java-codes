public class Array_Types {
    public static void main(String [] args){
        int [] int_array = new int[5];
        // char [] char_array = new char[5];
        // byte [] byte_array = new byte[5];
        for (int i = 0; i < 5; i++){
            int_array[i] = i;
        }
        System.out.println(int_array);
        for (int i = 0; i < int_array.length; i++){
            System.out.println(int_array[i]);

        }
        // System.out.println(char_array);
        // System.out.println(byte_array)
    }

}
