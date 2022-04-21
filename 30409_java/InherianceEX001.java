import jdk.nashorn.internal.runtime.Debug;

class Person
{
    String name = "홍길동";
    void sleep()
    {
        System.out.println("sleep");
    }
}
class Student extends Person 
{
    void study()
    {
        System.out.println("STUDY");
    }
}
public class InherianceEX001
{
    public static void main(String[] args)
    {
        Student std = new Student();
        System.out.println(std.name);
        std.sleep();
        std.study();
    }
}
//