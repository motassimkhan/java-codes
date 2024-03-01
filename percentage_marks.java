import java.util.Scanner;
class Subject{
    int max_marks = 100;
    int obtained;
}

public class percentage_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Subject maths = new Subject();
        System.out.println("Enter maths marks: ");
        maths.obtained = sc.nextInt();
        Subject chem = new Subject();
        System.out.println("Enter chemistry marks: ");
        chem.obtained = sc.nextInt();
        Subject bio = new Subject();
        System.out.println("Enter biology marks: ");
        bio.obtained = sc.nextInt();
        Subject english = new Subject();
        System.out.println("Enter english marks: ");
        english.obtained = sc.nextInt();
        int total = (maths.obtained+chem.obtained+bio.obtained+english.obtained);
        int per = (total*100/400);
        System.out.println("Percentage marks: "+per);
    }    
}
