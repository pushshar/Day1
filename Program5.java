import java.util.Scanner;

public class Program5 {
 
	public static void main(String[] args) {
		int n;
		int i;
	
		System.out.println("enter the no. of words");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("enter your string array");
		String[] s=new String[n];
		for(i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		
		for(String ss:s)
		{
			if((ss.charAt(0))==('s'))
			{
				System.out.println(ss);
			}
		}
	}

}
