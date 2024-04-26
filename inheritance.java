class Student{
    int rollnumber;
    String name;
    void display(){
        System.out.println("Roll number is "+rollnumber+" and the student's name is "+name);
    }
}
public class inheritance {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.name="khan";
        S1.rollnumber = 10;
        S1.display();
    }
}
