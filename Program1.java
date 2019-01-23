import java.util.Arrays;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		String s2;
		System.out.println("enter first string");
		Scanner sc=new Scanner(System.in);
		s1=sc.next();
		System.out.println("enter second string");
		s2=sc.next();
		
		char[] c1=s1.replaceAll(" ", "").toLowerCase().toCharArray();
		char[] c2=s2.replaceAll(" ", "").toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		String str1=new String(c1);
		String str2=new String(c2);
		
		if(str1.equals(str2))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}

	}

}
