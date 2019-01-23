import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		String s;
		System.out.println("enter your sentence");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		char[] c=s.toCharArray();
		char[] output=new char[c.length];
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==' ')
			{
				output[i]=' ';
			}
		}
		int j=0;
		for(int i=c.length-1;i>=0;i--)
		{
			if(c[i]==' ')
			{
				continue;
			}
		
				if(output[j]==' ')
				{
					j++;
				}
				
				output[j]=c[i];
				
			j++;
			
		}
		String ans=new String(output);
		System.out.println(ans);
		

	}

}
