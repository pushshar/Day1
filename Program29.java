
import java.util.Scanner;

public class Program29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		int count=0;
		char ch=s.charAt(0);
		String ss="";
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
				
			for(int j=0;j<s.length();j++)
			{
				if(ch==s.charAt(j))
				{
					count++;
				
				
				}
				else
				{
					ss=ss+s.charAt(j);
					System.out.println(ss);
				}
			}
			
			System.out.println(ch+"="+count);
			s=ss;
		}
	}

}
