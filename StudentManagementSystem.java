import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Student{
    private String name;
    private int age;
    private Map<String,Integer> courses;
    public Student (String name,int age)
    {
        this.name=name;
        this.age=age;
        this.courses=new HashMap<>();

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void enroll(String courseName,int grade)
    {
        courses.put(courseName,grade);
    }
    public Map<String,Integer> getCourses(){
        return courses;
    }

}
public class StudentManagementSystem{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter student name:");
        String name=sc.nextLine();
        System.out.print("Enter student age:");
        int age=sc.nextInt();
        sc.nextLine();
        Student student= new Student(name,age);
        System.out.println("Enter the courses enrolled  and grades(Press Enter after each course):");
        while(true)
        {
            System.out.println("Course name(for 'exit' to finish):");
            String courseName=sc.nextLine();
            if(courseName.equalsIgnoreCase("exit"))
            {
                break;
            }
            System.out.print("Grade for"+courseName+":");
            int grade=sc.nextInt();
            sc.nextLine();
            student.enroll(courseName,grade);
        }
        System.out.println("\n Student:"+student.getName());
        System.out.println("Age:"+student.getAge());
        System.out.println("course enrolled and grades:");
        for(Map.Entry<String,Integer>entry:student.getCourses().entrySet())
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        sc.close();
    }
}