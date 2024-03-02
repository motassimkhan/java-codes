import java.util.Scanner;
public class String_functions {
    public static void main(String[] args) {
        // strings are indexed in java 
        // there are 2 methods of creating a string
        String example = new String("Mir Ayan Ali");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your string: "+name);
        // string.length() method returns the length of the string
        int len = name.length();
        System.out.println("Length of string: "+len);
        // string.toLowerCase method returns the given string in lowercase
        String low = name.toLowerCase();
        System.out.println("Lowercase: "+low);
        // string.toUpperCase method returns the string in uppercase
        String up = name.toUpperCase();
        System.out.println("Uppercase: "+up);
        // string.trim() method removes leading and trailing spaces and returns string
        String trim = name.trim();
        System.out.println("trim: "+trim);
        //name.Substring(start,end) method takes start and end index parameter and creates a new substring from start to end-1 index
        String sub = example.substring(2,7);
        System.out.printf("String: %s  SubString: %s\n",example,sub);
        // name.replace(char,char) replaces the given char or string with new char or string
        String replaced = example.replace('A','M');
        System.out.println("Replaced: "+replaced);
        // name.charAt(index_value) method takes index value as input and returns the character at the given index value
        char ch = name.charAt(1);
        System.out.println("char at index 1: "+ch);
        // name.indexOf(char,index) takes character and index value as parameter and returns the index of the given character with respect to the given index value which means it treats the given index value as the starting point of the search and returns negative value if the index of character is present before the given index value. default value of index is 0
        int ind = example.indexOf('y',7);
        System.out.println("String: "+example+" Index of Y from 7: "+ind);
        // name.equals(string) this method checks and returns true if the given strings are equal or false
        boolean eq = name.equals("Motassim");
        System.out.println("name = Motassim? "+eq);
        eq = name.equalsIgnoreCase("MoTasSIm");
        sc.close();
    }
}
