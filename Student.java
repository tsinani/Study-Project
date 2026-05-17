import java.util.ArrayList;
import java.util.Scanner;
abstract class person{
    private String name;
    protected int age;
    public person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    abstract void showInfo();
}
class Student extends person{
    private double grade;
    public Student(String name,int age,double grade){
        super(name,age);
        this.grade = grade;
    }
    @Override
    void showInfo(){
        System.out.println("stident: "+ getName());
        System.out.println("age: "+ age);
        System.out.println("grade: " +grade);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> people = new ArrayList<>();
        try {
            System.out.println("enter name: ");
            String name = sc.nextLine();
            System.out.println("enter age: ");
            int age = sc.nextInt();
            System.out.println("enter grade: ");
            double grade = sc.nextDouble();
            Student S = new Student(name, age, grade);
            people.add(S);
            System.out.println("--studypoint Info--");
            for (Student P : people) {
                P.showInfo();
            }
        } catch (Exception e) {
            System.out.println("invalid input");
            sc.close();
        }
    }
}