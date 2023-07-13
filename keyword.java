import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str[]= {"break", "case", "continue", "default", "defer", "else","for", "func", "goto", 
     "if", "map", "range", "return", "struct", "type", "var"};
     Scanner sc=new Scanner(System.in);
     String in=sc.nextLine();
     int flag=0;
        for(int i=0;i<str.length;i++){
            if(str[i]==in);
            flag=1;
            break;
        }
        if(flag==1) System.out.print(in+" is a key");
        else System.out.print("Not a keyword");
	}
}
