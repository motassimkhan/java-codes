import java.util.Scanner;
public class Multidimentional_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value;
        //decleration of array
        int [][] array;
        // array = new datatype [rows][columns]
        array = new int [2][3];
        for (int i=0; i<=1 /*row count*/; i++){
            for (int j=0; j<=2 /*Column Count*/; j++){
                System.out.print("Enter element in position "+i+" "+j+":");
                value = sc.nextInt();
                array [i][j] = value;
            }
        }
        System.err.println("Your Entered Array: ");
        for (int i=0; i<=1 /*row count*/; i++){
            for (int j=0; j<=2 /*Column Count*/; j++){
                System.out.print(array [i][j]+" ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
