import java.util.Scanner;

public class LibraryEX001
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String name;
        int score;
        System.out.println("이름 입력 :");
        name = input.next();
        System.out.println("점수 입력 :");
        score = input.nextInt();
        
        if(score >=60)
        {
            System.out.println(name + " : 합격");
        }
        else
        {
            System.out.println(name + " : 불합격");
        }
    }
}
