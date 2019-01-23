import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Program27 {

	public static String findMissingLetters(String str)
	{
		char[] ch=str.replace(" ","").toLowerCase().toCharArray();
		boolean[] bool=new boolean[26];
		Arrays.sort(ch);
		int c=0;
		String output="";
		for(int i=0;i<ch.length;i++)
		{
			c=(int)ch[i];
			c=c-97;
			bool[c]=true;
		}
		for(int i=0;i<bool.length;i++)
		{
			if(bool[i]==false)
			{
				output=output+(char)(i+97)+" ";
			}
		}
		return output;
	}
	public static void main(String[] args) {

		String s;
		int count=0;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		char[] ch=s.replace(" ","").toLowerCase().toCharArray();
		
		HashSet<Character> h=new HashSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			h.add(ch[i]);
		}
		for(Character c:h)
		{
			count++;
		}
		if(count==26)
		{
			System.out.println("panagram");
		}
		else
		{
			String ans=findMissingLetters(s);
			System.out.println("missings are: "+ans);
		}
		
		sc.close();
	}

}