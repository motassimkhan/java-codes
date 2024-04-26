public class search_in_array {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int key = 4;
        for (int i = 0; i < array.length; i++){
            if (array[i] == key)
            System.out.println("Element found!");
        }
    }
}
