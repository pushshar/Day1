import java.util.Arrays;
import java.util.Scanner;

public class Program26 {

	
	public static void main(String[] args) {

		String s;
		;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		System.out.println("enter your input string");
		char[] input=s.replace(" ","").toLowerCase().toCharArray();
		char[] given="abcdefghijklmnopqrstuvwxyz".toCharArray();
		boolean[] bool=new boolean[26];
		
		for(int i=0;i<input.length;i++)
		{
			for(int j=0;j<given.length;j++)
			{
				if(input[i]==given[j])
				{
					bool[(int)given[j]-97]=true;
					break;
				}
			}
		}
		for(int i=0;i<bool.length;i++)
		{
			if(bool[i]==false)
			{
				System.out.print((char)(i+97));
			}
		}
		
		sc.close();
	}

}