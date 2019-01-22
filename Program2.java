import java.util.HashSet;
import java.util.Scanner;

public class Program2 {

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
			System.out.println("not panagram");
		System.out.println(count);
		sc.close();
	}

}
