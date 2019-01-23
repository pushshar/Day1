import java.util.LinkedHashSet;
import java.util.Scanner;

public class Program25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		s=sc.next();
		
		System.out.println("enter the no of sequence");
		n=sc.nextInt();
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		for(int i=0;i<s.length()-n;i++)
		{
			lhs.add(s.substring(i,i+n));
		}
		for(String str:lhs)
		{
			System.out.println(str);
		}
	}

}
