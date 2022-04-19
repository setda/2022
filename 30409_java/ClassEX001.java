import java.security.PublicKey;

class Rectangle 
{
    int width;
    int heght;
    public int getArea()
    {
        return width * heght; 
    }
    public int getRound()
    {
     return 2 * (width + heght);
    }
    
}
public class ClassEX001
{
    public static void main(String[] args)
    {
        Rectangle aaa = new Rectangle();
        aaa.width = 10;
        aaa.heght = 20;
        System.out.println("사각형의 넓이 : " + aaa.getArea());
        System.out.println("사각형의 둘래 : " + aaa.getRound());
    }
}