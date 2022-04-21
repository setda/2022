import java.lang.String;

public class LibraryEX002
{
    public static void main(String[] args)
    {
        String text = "Hello PASS World";
        String concat, upperCase, lowerCase, replace, subString;
        System.out.println("기본 String : " + text);
        System.out.println("기본 String  길이 : " + text.length());
        
        concat = text.concat(" : YOUNGJ.COM");
        upperCase = concat.toUpperCase();
        lowerCase = concat.toLowerCase();
        replace = upperCase.replace(':','!');
        subString = replace.subString(6,10);
        
        System.out.println("Concat string : " + concat);   
        System.out.println("UperCase string : " + upperCase);   
        System.out.println("LowerCase string : " + lowerCase);  
        System.out.println("Replace string : " + replace);   
        System.out.println("SubString string : " + subString);
    }
        
}