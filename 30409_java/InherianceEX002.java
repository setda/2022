class Person
{
    String name = "홍길동";
    void sleep()
    {
        System.out.println("Sleep");
    }
}
class Studet extends Person 
{
    void sleep()
    {
        System.out.println("Good Night");
    }
}
public class InherianceEX002
{
    public static void main(String[] args)
    {
        Studet std = new Studet();
        System.out.println(std.name);
        std.sleep();
    }
}